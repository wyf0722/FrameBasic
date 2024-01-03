package com.fan.dao;

import com.fan.domain.Account;
import org.apache.ibatis.annotations.Insert;

public interface AccountDao {
    @Insert("insert into tbl_account(name, money)values(#{name}, #{money})")
    void save(Account account);
}
