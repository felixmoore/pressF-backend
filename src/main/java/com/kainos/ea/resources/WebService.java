package com.kainos.ea.resources;

import com.kainos.ea.db.JobRoleMapper;
import com.kainos.ea.objects.JobRole;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.io.Reader;
import java.util.Collections;
import java.util.List;

@Path("/api")
public class WebService {
    private SqlSession sqlSession;
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
            if (sqlSession == null) {
                initDBConnection();
            }
            JobRoleMapper jobRoles = sqlSession.getMapper(JobRoleMapper.class);
            List<DBTest> test = jobRoles.getTest();
            if (test.size() > 0){
                return test;
            } else {
                return Collections.singletonList("No entries found.");
            }

    }

    public void initDBConnection(){
        try (Reader settings = Resources.getResourceAsReader("mybatis-config.xml")) {
            SqlSessionFactoryBuilder mybatis = new SqlSessionFactoryBuilder();
            SqlSessionFactory mappedDb = mybatis.build(settings);
            sqlSession = mappedDb.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GET
    @Path("/getjobroles")
    @Produces(MediaType.APPLICATION_JSON)
    public List<? extends Object> getJobRoles(){
        try (Reader settings = Resources.getResourceAsReader("mybatis-config.xml")) {

            SqlSessionFactoryBuilder mybatis = new SqlSessionFactoryBuilder();
            SqlSessionFactory mappedDb = mybatis.build(settings);
            SqlSession session = mappedDb.openSession();

            JobRoleMapper jobRoles = session.getMapper(JobRoleMapper.class);

            List<JobRole> jobRoleList = jobRoles.getJobRoles();
            session.close();
            return(jobRoleList);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.singletonList("Database connection failed.");
    }
}
