package com.jiangrongxin.work.service.impl;

import com.jiangrongxin.work.mapper.TestMapper;
import com.jiangrongxin.work.model.Test;
import com.jiangrongxin.work.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("testService")
public class TestService implements ITestService {
    @Autowired
    private TestMapper testMapper;
    @Override
    public List<Test> findAll() {
        return testMapper.findAll();
    }
}
