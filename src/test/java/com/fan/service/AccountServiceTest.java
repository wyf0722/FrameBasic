package com.fan.service;

import com.fan.config.SpringConfig;
import com.fan.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;
    @Test
    public void testFindById() {
        Account account = accountService.findById(2);
//        System.out.println();
    }

    @Test
    public void testFindAll() {
        System.out.println(accountService.findAll());
    }
}
