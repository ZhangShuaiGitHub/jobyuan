package com.jobyuan.mapper;

import com.jobyuan.pojo.JobPerson;
import com.jobyuan.pojo.JobPersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobPersonMapper {
    int countByExample(JobPersonExample example);

    int deleteByExample(JobPersonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobPerson record);

    int insertSelective(JobPerson record);

    List<JobPerson> selectByExample(JobPersonExample example);

    JobPerson selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobPerson record, @Param("example") JobPersonExample example);

    int updateByExample(@Param("record") JobPerson record, @Param("example") JobPersonExample example);

    int updateByPrimaryKeySelective(JobPerson record);

    int updateByPrimaryKey(JobPerson record);
}