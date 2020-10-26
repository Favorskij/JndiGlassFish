package com.jndiglassfish.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.jndiglassfish.repository")
public class RootConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/JndiGlassFish?serverTimezone=UTC&useSSL=false");
//        driverManagerDataSource.setUsername("root");
//        driverManagerDataSource.setPassword("1234");
//        return driverManagerDataSource;
//    }


    @Bean
//    @Resource(name="JDBC/JNDITest") Это для Spring Boot
    public DataSource dataSource() {
        return new JndiDataSourceLookup().getDataSource("JDBC/JNDIPool");
    }

}
