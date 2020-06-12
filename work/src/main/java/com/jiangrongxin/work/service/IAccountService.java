
package com.jiangrongxin.work.service;
import com.jiangrongxin.work.model.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IAccountService {

    List<Account> getAccounts();

    Account getAccountById(@Param("cust_id") int id);

    void insertAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Account account);
}
