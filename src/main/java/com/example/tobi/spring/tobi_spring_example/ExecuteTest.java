package com.example.tobi.spring.tobi_spring_example;

import java.sql.SQLException;

import com.example.tobi.spring.tobi_spring_example.sample.user.dao.UserDao;
import com.example.tobi.spring.tobi_spring_example.sample.user.domain.User;

public class ExecuteTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // #####
        UserDao userDao = new UserDao();

        User user = new User();
        
        user.setId("1");
        user.setName("wplee");
        user.setPassword("qwer1234!!");

        userDao.add(user);

        System.out.println(user.getId() + "등록 성공");

        User user2 = userDao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + " 조회 성공");

    }
    
}

