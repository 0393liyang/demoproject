package com.stephen.study.demoproject.mapper;

import com.stephen.study.demoproject.model.userabc;

import java.util.List;

public interface userabcMapper {
    int insert(userabc record);

   List<userabc> userabcList();
}