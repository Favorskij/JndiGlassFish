package com.jndiglassfish.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Repositories {


    @Autowired
    JdbcTemplate jdbcTemplate;


    public String getUserByName(int id) {
        String sql = "SELECT username FROM user WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new Object[] { id }, String.class);

    }



}
