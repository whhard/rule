package com.daokoujinke.config.datasource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSourceConfig {
    /**
     * 数据源2
     * spring.datasource1
     */
    @Bean(name = "datasource1")
    @ConfigurationProperties(prefix = "spring.datasource1")
    public DataSource dataSource1(){
        return DataSourceBuilder.create().build();
    }
    /**
     * 动态数据源：通过AOP在不同数据源之间切换
     */
    @Primary
    @Bean(name = "dynamicDataSource")
    public DataSource dynamiDataSource(){
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        //默认数据源
        dynamicDataSource.setDefaultTargetDataSource(dataSource1());
        //配置多数据源
        Map<Object,Object> map = new HashMap<>();
        map.put("datasource1",dataSource1());

        dynamicDataSource.setTargetDataSources(map);
        return dynamicDataSource;
    }
    /**
     * 配置@Transactional注解
     */
    @Bean
    public PlatformTransactionManager transactionManager(){
        return new DataSourceTransactionManager(dynamiDataSource());
    }
}
