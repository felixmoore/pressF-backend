package com.kainos.ea.db;

import com.kainos.ea.objects.JobRole;
import com.kainos.ea.resources.DBTest;
import org.apache.ibatis.annotations.Select;
import java.util.List;

public interface JobRoleMapper {
    @Select("SELECT ID, TestMessage FROM Test_Table")
    List<DBTest> getTest();

    @Select("SELECT JobRoleID, JobTitle, JobSpecification, jc.JobCapability, jd.JobDiscipline, jb.JobBand, JobCompetencies, RecordCreated FROM JobRoles JOIN JobBand jb ON JobRoles.JobBand = jb.JobBandID JOIN JobDiscipline jd ON JobRoles.JobDiscipline = jd.JobDisciplineID JOIN JobCapability jc ON JobRoles.JobCapability = jc.JobCapabilityID")
    List<JobRole> getJobRoles();


}
