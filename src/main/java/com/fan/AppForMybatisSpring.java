package com.fan;

import com.fan.config.SpringConfig;
import com.fan.domain.Account;
import com.fan.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AppForMybatisSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);
        List<Account> all;
//        // 创建
        Account account = new Account();
        account.setName("qiongbi");
        account.setMoney(20.0);
        accountService.save(account);
        all = accountService.findAll();
        System.out.println(all);
//        // 删除
//        accountService.delete(3);
//        all = accountService.findAll();
//        System.out.println(all);
        // 修改
        account.setId(1);
        account.setName("xiaozi");
        account.setMoney(89730.0);
        accountService.update(account);
        all = accountService.findAll();
        System.out.println(all);
//        // 查询
//        Account ac = accountService.findById(2);
//        System.out.println(ac);
    }
}
