package com.jobyuan.mapper;

import com.jobyuan.pojo.JobNumberBind;
import com.jobyuan.pojo.JobNumberBindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobNumberBindMapper {
    int countByExample(JobNumberBindExample example);

    int deleteByExample(JobNumberBindExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobNumberBind record);

    int insertSelective(JobNumberBind record);

    List<JobNumberBind> selectByExample(JobNumberBindExample example);

    JobNumberBind selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobNumberBind record, @Param("example") JobNumberBindExample example);

    int updateByExample(@Param("record") JobNumberBind record, @Param("example") JobNumberBindExample example);

    int updateByPrimaryKeySelective(JobNumberBind record);

    int updateByPrimaryKey(JobNumberBind record);
}