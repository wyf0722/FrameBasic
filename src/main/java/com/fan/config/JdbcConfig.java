package com.fan.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.fan.dao.AnnotationDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class JdbcConfig {
    @Value("com.mysql.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://localhost:3450/spring_db")
    private String url;
    @Value("root")
    private String username;
    @Value("123456")
    private String password;
    // 当前方法的返回值是一个Bean
    @Bean
    public DataSource dataSource(AnnotationDao annotationDao) {
        System.out.println(annotationDao);
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driver);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }
}
