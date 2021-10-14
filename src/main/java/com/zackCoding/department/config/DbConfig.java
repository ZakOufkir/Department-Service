package com.zackCoding.department.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DbConfig {

    @Autowired
    DatabaseProperties db;

    @Bean
    public DataSource postgreSQLsource() {

        DataSourceBuilder dataSource =DataSourceBuilder.create();
        dataSource.username(db.getUsername());
        dataSource.password(db.getPassword());
        dataSource.url(db.getUrl());
        dataSource.driverClassName(db.getDriverclassname());
        return dataSource.build();


    }
}
