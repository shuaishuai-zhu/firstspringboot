package com.jiangrongxin.work.mapper;

import com.jiangrongxin.work.model.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountMapper {
    List<Account> getAccounts();

    Account getAccountById(int id);

    void insertAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Account account);
}
