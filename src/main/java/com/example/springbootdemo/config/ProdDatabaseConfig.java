package com.example.springbootdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@Profile("production")
public class ProdDatabaseConfig {

    @Value("${database.url}")
    private String databaseURL;

    @Value("${database.username}")
    private String databaseUsername;

    @Value("${database.name}")
    private String databaseName;

    @Value("${database.password}")
    private String databasePassword;

    @Value("${database.driver}")
    private String databaseDriver;

    @Bean
    public DataSource dataSource() {
        // instantiate, configure and return embedded DataSource
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(getDatabaseDriver());
        dataSourceBuilder.url(getDatabaseURL());
        dataSourceBuilder.username(getDatabaseUsername());
        dataSourceBuilder.password(getDatabasePassword());
        return dataSourceBuilder.build();
    }

    public String getDatabaseURL() {
        return databaseURL;
    }

    public String getDatabaseUsername() {
        return databaseUsername;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public String getDatabasePassword() {
        return databasePassword;
    }

    public String getDatabaseDriver() {
        return databaseDriver;
    }
}
