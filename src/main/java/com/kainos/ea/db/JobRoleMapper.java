package com.kainos.ea.db;

import com.kainos.ea.resources.DBTest;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface JobRoleMapper {
    @Select("SELECT ID, TestMessage FROM Test_Table")
    List<DBTest> getTest();

}
