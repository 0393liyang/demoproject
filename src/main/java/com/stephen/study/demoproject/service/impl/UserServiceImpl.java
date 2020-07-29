package com.stephen.study.demoproject.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.stephen.study.demoproject.mapper.userabcMapper;
import com.stephen.study.demoproject.entity.userabc;
import com.stephen.study.demoproject.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Resource
    public userabcMapper userabcMapper;

    @Override
    public int addUser(userabc userabc){
        int insert=userabcMapper.insert(userabc);
        return insert;
    }

    public PageInfo<userabc> findAllUser(int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<userabc> userabcList=userabcMapper.userabcList();
        PageInfo rs=new PageInfo(userabcList);
        return rs;
    }

}
