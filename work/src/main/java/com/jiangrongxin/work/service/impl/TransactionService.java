package com.jiangrongxin.work.service.impl;

import com.jiangrongxin.work.model.Transaction;
import com.jiangrongxin.work.mapper.TransactionMapper;
import com.jiangrongxin.work.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService implements ITransactionService {

    @Autowired
    private TransactionMapper transactionMapper;
    @Override
    public List<Transaction> getTransactions() {
        return transactionMapper.getTransactions();
    }

    @Override
    public Transaction getTransactionById(int id) {
        return transactionMapper.getTransactionById(id);
    }

    @Override
    public void insertTransaction(Transaction transaction) {
        transactionMapper.insertTransaction(transaction);
    }

    @Override
    public void updateTransaction(Transaction transaction) {
        transactionMapper.updateTransaction(transaction);
    }

    @Override
    public void deleteTransaction(Transaction transaction) {
        transactionMapper.deleteTransaction(transaction);
    }
}

