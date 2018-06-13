package com.jobyuan.mapper;

import com.jobyuan.pojo.JobLearning;
import com.jobyuan.pojo.JobLearningExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobLearningMapper {
    int countByExample(JobLearningExample example);

    int deleteByExample(JobLearningExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobLearning record);

    int insertSelective(JobLearning record);

    List<JobLearning> selectByExample(JobLearningExample example);

    JobLearning selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobLearning record, @Param("example") JobLearningExample example);

    int updateByExample(@Param("record") JobLearning record, @Param("example") JobLearningExample example);

    int updateByPrimaryKeySelective(JobLearning record);

    int updateByPrimaryKey(JobLearning record);
}