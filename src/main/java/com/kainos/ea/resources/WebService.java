package com.kainos.ea.resources;

import com.kainos.ea.db.JobRoleMapper;
import com.kainos.ea.objects.JobRole;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

@Path("/api")
public class WebService {
    private SqlSessionFactory sqlSessionFactory;
    @GET
    @Path("/ping")
    public String ping() {
        return "pong";
    }

    @GET
    @Path("/print/{msg}")
    @Produces("text/html")
    public String getMsg(@PathParam("msg") String message){
        return "Hello from a RESTful Web service: " + message;
    }


    @GET
    @Path("/testMybatis")
    @Produces(MediaType.APPLICATION_JSON)
    public List<?> testMybatis(){
        if (sqlSessionFactory == null) {
            initDBConnection();
        }

        try (SqlSession session = sqlSessionFactory.openSession()) {
            JobRoleMapper dbTest = session.getMapper(JobRoleMapper.class);
            List<DBTest> dbTestList = dbTest.getTest();
            if (dbTestList.size() > 0){
                return dbTestList;
            } else {
                return Collections.singletonList("No entries found.");
            }
        } catch (SqlSessionException sqle){
            sqle.printStackTrace();
            return Collections.singletonList("An error occurred during database connection.");
        }
    }

    public void initDBConnection(){
        try (Reader settings = Resources.getResourceAsReader("mybatis-config.xml")) {
            SqlSessionFactoryBuilder mybatis = new SqlSessionFactoryBuilder();
            sqlSessionFactory = mybatis.build(settings);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GET
    @Path("/getjobroles")
    @Produces(MediaType.APPLICATION_JSON)
    public List<?> getJobRoles(){
        if (sqlSessionFactory == null) {
            initDBConnection();
        }

        try (SqlSession session = sqlSessionFactory.openSession()) {
            JobRoleMapper jobRoles = session.getMapper(JobRoleMapper.class);
            List<JobRole> jobRolesList = jobRoles.getJobRoles();
            if (jobRolesList.size() > 0){
                return jobRolesList;
            } else {
                return Collections.singletonList("No entries found.");
            }
        } catch (SqlSessionException sqle){
            sqle.printStackTrace();
            return Collections.singletonList("An error occurred during database connection.");
        }


    }

}
