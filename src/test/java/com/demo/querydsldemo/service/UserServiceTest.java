package com.demo.querydsldemo.service;

import com.demo.querydsldemo.dto.UsersDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void test(){
        String userId = "test1";
//        String userName = "테스트1";
        String userName = null;

        List<UsersDto> users = userService.findByUserIdAndName(userId, userName);

        for (UsersDto u: users) {
            System.out.println(u.getUserNo());
            System.out.println(u.getUserId());
            System.out.println(u.getUserName());
        }
    }

}