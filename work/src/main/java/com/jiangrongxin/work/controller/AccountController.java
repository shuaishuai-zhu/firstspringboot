package com.jiangrongxin.work.controller;
import com.jiangrongxin.work.model.Account;
import com.jiangrongxin.work.service.impl.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    private Logger logger = LoggerFactory.getLogger(AccountController.class) ;

    @Autowired
    private AccountService accountService;


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Account> getAccounts(){
        List<Account> userList = null;
        try {
            userList = accountService.getAccounts();
            logger.info("返回结果集："+ userList);
        } catch (Exception e) {
            userList = new ArrayList<>();
            logger.info("查询所有账户异常：方法入口：getUsers",e);
        }
        return userList ;
    }

    @RequestMapping(value = "/{id}" ,method = RequestMethod.GET)
    @ResponseBody
    public Account getAccountById(@PathVariable("id") int id){
        Account account = null;
        try {
            account = accountService.getAccountById(id);
            logger.info("输入账户ID为："+ id +"|| 返回结果：" + account);
        } catch (Exception e) {
            account = new Account();
            logger.info("restful风格-根据ID查询账户：方法入口：getUserByUserId",e);
        }
        return account ;
    }

    @RequestMapping(value = "insertAccount",method = RequestMethod.POST)
    @ResponseBody
    public void insertAccount(@RequestBody Account account){
        try {
            accountService.insertAccount(account);
            logger.info("新增成功");
        } catch (Exception e) {
            logger.info("新增异常，异常原因为：" ,e);
        }
    }

    @RequestMapping(value = "deleteAccount",method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteAccount(@RequestBody Account account){
        try {
             accountService.deleteAccount(account);
            logger.info("删除成功" );
        } catch (Exception e) {
            logger.info("删除异常，异常原因为：" ,e);
        }
    }

    @RequestMapping(value = "updateAccount",method = RequestMethod.PATCH)
    @ResponseBody
    public void updateAccount(@RequestBody Account account){
        try {
            accountService.updateAccount(account);
            logger.info("更新成功");
        } catch (Exception e) {
            logger.info("更新异常，异常原因为：" ,e);
        }
    }
}
