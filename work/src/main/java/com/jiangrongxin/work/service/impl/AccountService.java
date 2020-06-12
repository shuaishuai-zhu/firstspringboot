package com.jiangrongxin.work.service.impl;
import com.jiangrongxin.work.model.Account;
import com.jiangrongxin.work.mapper.AccountMapper;
import com.jiangrongxin.work.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService {
    @Autowired
    private AccountMapper accountMapper;


    @Override
    public List<Account> getAccounts() {
        return accountMapper.getAccounts();
    }

    @Override
    public Account getAccountById(int id) {
        return accountMapper.getAccountById(id);
    }

    @Override
    public void insertAccount(Account account) {
        accountMapper.insertAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountMapper.updateAccount(account);
    }

    @Override
    public void deleteAccount(Account account) {
        accountMapper.deleteAccount(account);
    }
}

