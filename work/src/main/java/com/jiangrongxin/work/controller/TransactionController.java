package com.jiangrongxin.work.controller;
import com.jiangrongxin.work.model.Transaction;
import com.jiangrongxin.work.service.impl.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tran")
public class TransactionController {
    private Logger logger = LoggerFactory.getLogger(TransactionController.class) ;

    @Autowired
    private TransactionService transactionService;


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Transaction> getTransactions(){
        List<Transaction> transactionList = null;
        try {
            transactionList = transactionService.getTransactions();
            logger.info("返回结果集："+ transactionList);
        } catch (Exception e) {
            transactionList = new ArrayList<>();
            logger.info("查询所有账户异常：方法入口：getUsers",e);
        }
        return transactionList ;
    }

    @RequestMapping(value = "/{id}" ,method = RequestMethod.GET)
    @ResponseBody
    public Transaction getTransactionById(@PathVariable("id") int id){
        Transaction transaction = null;
        try {
            transaction = transactionService.getTransactionById(id);
            logger.info("输入账户ID为："+ id +"|| 返回结果：" + transaction);
        } catch (Exception e) {
            transaction = new Transaction();
            logger.info("restful风格-根据ID查询账户：方法入口：getUserByUserId",e);
        }
        return transaction ;
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseBody
    public void insertTransaction(@RequestBody Transaction transaction){
        try {
            transactionService.insertTransaction(transaction);
            logger.info("新增成功");
        } catch (Exception e) {
            logger.info("新增异常，异常原因为：" ,e);
        }
    }

    @RequestMapping(value = "",method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteTransaction(@RequestBody Transaction transaction){
        try {
            transactionService.deleteTransaction(transaction);
            logger.info("删除成功" );
        } catch (Exception e) {
            logger.info("删除异常，异常原因为：" ,e);
        }
    }

    @RequestMapping(value = "",method = RequestMethod.PATCH)
    @ResponseBody
    public void updateTransaction(@RequestBody Transaction transaction){
        try {
            transactionService.updateTransaction(transaction);
            logger.info("更新成功");
        } catch (Exception e) {
            logger.info("更新异常，异常原因为：" ,e);
        }
    }
}
