package com.demo.querydsldemo.querydsl;

import com.demo.querydsldemo.dto.BoardDto;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoardRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;


}
