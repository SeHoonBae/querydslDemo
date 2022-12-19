INSERT INTO USERS (user_no, user_id, user_name) VALUES (1, 'test1', '테스트1');
INSERT INTO USERS (user_no, user_id, user_name) VALUES (2, 'test2', '테스트2');
INSERT INTO USERS (user_no, user_id, user_name) VALUES (3, 'test3', '테스트3');

INSERT INTO BOARD (id, title, content, user_no) VALUES (1, 'JAVA', 'JAVA에 대해 학습하였습니다.', 1);
INSERT INTO BOARD (id, title, content, user_no) VALUES (2, 'Spring', 'Spring에 대해 학습하였습니다.', 1);
INSERT INTO BOARD (id, title, content, user_no) VALUES (3, 'JPA', 'JPA에 대해 학습하였습니다.', 2);
INSERT INTO BOARD (id, title, content, user_no) VALUES (4, 'AWS', 'AWS에 대해 학습하였습니다.', 3);
INSERT INTO BOARD (id, title, content, user_no) VALUES (5, 'Querydsl', 'Querydsl에 대해 학습하였습니다.', 3);