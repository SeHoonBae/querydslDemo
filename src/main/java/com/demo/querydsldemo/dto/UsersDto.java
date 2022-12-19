package com.demo.querydsldemo.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
public class UsersDto {
    private Long userNo;

    private String userId;

    private String userName;

    @QueryProjection
    public UsersDto(Long userNo, String userId, String userName) {
        this.userNo = userNo;
        this.userId = userId;
        this.userName = userName;
    }
}
