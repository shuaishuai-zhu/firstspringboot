package com.jiangrongxin.work.service;
import com.jiangrongxin.work.model.Transaction;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface ITransactionService {

    List<Transaction> getTransactions();

    Transaction getTransactionById(@Param("trans_id") int id);

    void insertTransaction(Transaction transaction);

    void updateTransaction(Transaction transaction);

    void deleteTransaction(Transaction transaction);
}

