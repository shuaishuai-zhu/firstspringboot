package com.jiangrongxin.work.mapper;

import com.jiangrongxin.work.model.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("testMapper")
public interface TestMapper {
    List<Test> findAll();
}
