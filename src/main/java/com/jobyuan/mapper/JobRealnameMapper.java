package com.jobyuan.mapper;

import com.jobyuan.pojo.JobRealname;
import com.jobyuan.pojo.JobRealnameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobRealnameMapper {
    int countByExample(JobRealnameExample example);

    int deleteByExample(JobRealnameExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobRealname record);

    int insertSelective(JobRealname record);

    List<JobRealname> selectByExample(JobRealnameExample example);

    JobRealname selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobRealname record, @Param("example") JobRealnameExample example);

    int updateByExample(@Param("record") JobRealname record, @Param("example") JobRealnameExample example);

    int updateByPrimaryKeySelective(JobRealname record);

    int updateByPrimaryKey(JobRealname record);
}