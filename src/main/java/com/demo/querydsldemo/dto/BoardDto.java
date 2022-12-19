package com.demo.querydsldemo.dto;

import com.demo.querydsldemo.entity.Users;
import com.querydsl.core.annotations.QueryProjection;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BoardDto {

    private Long id;

    private String title;

    private String content;


    @QueryProjection
    public BoardDto(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
