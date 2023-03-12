package com.zhuweihao.webflux.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author zhuweihao
 * @Date 2023/3/7 17:08
 * @Description com.zhuweihao.SpringFramework.config
 */
@Configuration
public class SpringConfig {
    @Bean
    public DataSource dataSource() throws IOException {
        Properties prop = new Properties();
        InputStream inputStream = SpringConfig.class.getResourceAsStream("/jdbc.properties");
        prop.load(inputStream);
        String DATABASE_URL = prop.getProperty("DATABASE_URL");
        String DATABASE_USER = prop.getProperty("DATABASE_USER");
        String DATABASE_PASSWORD = prop.getProperty("DATABASE_PASSWORD");
        String DATABASE_DRIVER = prop.getProperty("DATABASE_DRIVER");

        DruidDataSource dataSource = new DruidDataSource();
        //设置数据源的名称和密码等等
        dataSource.setUsername(DATABASE_USER);
        dataSource.setPassword(DATABASE_PASSWORD);
        //设置连接的url
        dataSource.setUrl(DATABASE_URL);
        //设置连接的驱动
        dataSource.setDriverClassName(DATABASE_DRIVER);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

}
