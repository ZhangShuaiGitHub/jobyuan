package com.jobyuan.mapper;

import com.jobyuan.pojo.JobReading;
import com.jobyuan.pojo.JobReadingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobReadingMapper {
    int countByExample(JobReadingExample example);

    int deleteByExample(JobReadingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobReading record);

    int insertSelective(JobReading record);

    List<JobReading> selectByExample(JobReadingExample example);

    JobReading selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobReading record, @Param("example") JobReadingExample example);

    int updateByExample(@Param("record") JobReading record, @Param("example") JobReadingExample example);

    int updateByPrimaryKeySelective(JobReading record);

    int updateByPrimaryKey(JobReading record);
}