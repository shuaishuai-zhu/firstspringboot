package com.jiangrongxin.work.controller;

import com.jiangrongxin.work.model.Test;
import com.jiangrongxin.work.service.impl.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping(value = "/findall" ,method = RequestMethod.GET)
    @ResponseBody
    public List<Test> getAccounts(){
        List<Test> testList = testService.findAll();
        System.out.println(testList.toString());
        return testList ;
    }
}
