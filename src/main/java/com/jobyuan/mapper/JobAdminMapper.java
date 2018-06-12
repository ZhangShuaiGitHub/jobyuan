package com.jobyuan.mapper;

import com.jobyuan.pojo.JobAdmin;
import com.jobyuan.pojo.JobAdminExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JobAdminMapper {
    int countByExample(JobAdminExample example);

    int deleteByExample(JobAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobAdmin record);

    int insertSelective(JobAdmin record);

    List<JobAdmin> selectByExample(JobAdminExample example);

    JobAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobAdmin record, @Param("example") JobAdminExample example);

    int updateByExample(@Param("record") JobAdmin record, @Param("example") JobAdminExample example);

    int updateByPrimaryKeySelective(JobAdmin record);

    int updateByPrimaryKey(JobAdmin record);
}