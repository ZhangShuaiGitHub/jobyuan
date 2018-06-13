package com.jobyuan.mapper;

import com.jobyuan.pojo.JobInterview;
import com.jobyuan.pojo.JobInterviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobInterviewMapper {
    int countByExample(JobInterviewExample example);

    int deleteByExample(JobInterviewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobInterview record);

    int insertSelective(JobInterview record);

    List<JobInterview> selectByExampleWithBLOBs(JobInterviewExample example);

    List<JobInterview> selectByExample(JobInterviewExample example);

    JobInterview selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobInterview record, @Param("example") JobInterviewExample example);

    int updateByExampleWithBLOBs(@Param("record") JobInterview record, @Param("example") JobInterviewExample example);

    int updateByExample(@Param("record") JobInterview record, @Param("example") JobInterviewExample example);

    int updateByPrimaryKeySelective(JobInterview record);

    int updateByPrimaryKeyWithBLOBs(JobInterview record);

    int updateByPrimaryKey(JobInterview record);
}