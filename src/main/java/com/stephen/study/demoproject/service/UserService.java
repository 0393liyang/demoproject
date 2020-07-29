package com.stephen.study.demoproject.service;

import com.github.pagehelper.PageInfo;
import com.stephen.study.demoproject.entity.userabc;

public interface UserService {
    int addUser(userabc userabc);

    PageInfo<userabc> findAllUser(int pageNum,int pageSize);
}
