package com.jobyuan.servcie;

import com.jobyuan.mapper.JobAdminMapper;
import com.jobyuan.pojo.JobAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HelloService {

    @Autowired
    JobAdminMapper hd;

    public JobAdmin selectByPrimaryKey(){
        JobAdmin jobAdmin = hd.selectByPrimaryKey(1);
        return jobAdmin;
    }


}
