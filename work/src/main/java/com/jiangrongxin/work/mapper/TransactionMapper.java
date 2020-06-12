package com.jiangrongxin.work.mapper;

import com.jiangrongxin.work.model.Transaction;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionMapper {

    List<Transaction> getTransactions();

    Transaction getTransactionById(@Param("trans_id") int id);

    void insertTransaction(Transaction transaction);

    void updateTransaction(Transaction transaction);

    void deleteTransaction(Transaction transaction);
}
