package com.demo.querydsldemo.service;

import com.demo.querydsldemo.dto.UsersDto;
import com.demo.querydsldemo.querydsl.UsersRepositoryCustom;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

    private final UsersRepositoryCustom usersRepositoryCustom;

    public List<UsersDto> findByUserIdAndName(String userId, String userName){

        return usersRepositoryCustom.findByUserIdAndName(userId, userName);

    }

}
