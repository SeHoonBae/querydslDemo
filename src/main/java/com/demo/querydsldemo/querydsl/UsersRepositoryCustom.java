package com.demo.querydsldemo.querydsl;

import com.demo.querydsldemo.dto.BoardDto;
import com.demo.querydsldemo.dto.QBoardDto;
import com.demo.querydsldemo.dto.QUsersDto;
import com.demo.querydsldemo.dto.UsersDto;
import com.demo.querydsldemo.entity.Users;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.function.Predicate;

import static com.demo.querydsldemo.entity.QBoard.board;
import static com.demo.querydsldemo.entity.QUsers.users;
import static org.springframework.util.StringUtils.hasText;


@Repository
@RequiredArgsConstructor
public class UsersRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    public List<UsersDto> findByUserIdAndName(String userId, String userName) {
//        BooleanBuilder builder = new BooleanBuilder();
//
//        if(StringUtils.hasText(userId)){
//            builder.and(users.userId.eq(userId));
//        }
//
//        if(StringUtils.hasText(userName)){
//            builder.and(users.userName.eq(userName));
//        }


//        return queryFactory
//                .select(new QUsersDto(
//                        users.userNo,
//                        users.userId,
//                        users.userName
//                ))
//                .from(users)
//                .where(builder)
//                .fetch();

//        List<BoardDto> fetch = queryFactory.select(new QBoardDto(
//                        board.id,
//                        board.title,
//                        board.content
//                ))
//                .from(board)
//                .where(users.userNo.eq(board.user.userNo))
//                .fetch();

        List<BoardDto> boards = queryFactory
                .select(new QUsersDto(
                        users.userNo,
                        users.userId,
                        users.userName
                ))
                .from(users)
                .innerJoin(board)
                .on(users.userNo.eq(board.user.userNo))
                .where(
                        usernameId(userId),
                        usernameEq(userName)
                )
                .transform(
                        query -> query.select(new QBoardDto(
                                        board.id,
                                        board.title,
                                        board.content
                                ))
                                .fetch()
                );

        return queryFactory
                .select(new QUsersDto(
                        users.userNo,
                        users.userId,
                        users.userName
                ))
                .from(users)
                .innerJoin(board)
                .on(users.userNo.eq(board.user.userNo))
                .where(
                        usernameId(userId),
                        usernameEq(userName)
                )
                .fetch();
    }

    private BooleanExpression usernameId(String userId) {
        return hasText(userId) ? users.userId.eq(userId) : null;
    }

    private BooleanExpression usernameEq(String username) {
        return hasText(username) ? users.userName.eq(username) : null;
    }

}
