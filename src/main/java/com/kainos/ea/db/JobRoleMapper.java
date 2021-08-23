package com.kainos.ea.db;

import com.kainos.ea.resources.Test;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface JobRoleMapper {
    @Select("SELECT ID, TestMessage FROM Test_Table")
    List<Test> getTest();

}
