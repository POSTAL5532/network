INSERT INTO users (id, full_name, email, password, reg_date, status)
VALUES ('10b7a065-67e6-4a4d-9e43-23fe464fc017', 'Igor Test', 'postal@qwe.qwe', 'qwerty123', '2020-09-05', 'OFFLINE'),
       ('20b7a065-67e6-4a4d-9e43-23fe464fc017', 'User One', 'user1@qwe.qwe', 'qwerty123', '2020-09-06', 'OFFLINE'),
       ('30b7a065-67e6-4a4d-9e43-23fe464fc017', 'User Two', 'user2@qwe.qwe', 'qwerty123', '2020-09-07', 'OFFLINE'),
       ('40b7a065-67e6-4a4d-9e43-23fe464fc017', 'User Three', 'user3@qwe.qwe', 'qwerty123', '2020-09-08', 'OFFLINE'),
       ('50b7a065-67e6-4a4d-9e43-23fe464fc017', 'User Four', 'user4@qwe.qwe', 'qwerty123', '2020-09-09', 'OFFLINE');

INSERT INTO subscriptions (id, user_id, target_user_id, subscribe_date)
VALUES ('11b7a065-67e6-4a4d-9e43-23fe464fc017', '20b7a065-67e6-4a4d-9e43-23fe464fc017', '10b7a065-67e6-4a4d-9e43-23fe464fc017', '2020-10-11'),
       ('12b7a065-67e6-4a4d-9e43-23fe464fc017', '30b7a065-67e6-4a4d-9e43-23fe464fc017', '10b7a065-67e6-4a4d-9e43-23fe464fc017', '2020-10-12'),
       ('13b7a065-67e6-4a4d-9e43-23fe464fc017', '40b7a065-67e6-4a4d-9e43-23fe464fc017', '10b7a065-67e6-4a4d-9e43-23fe464fc017', '2020-10-13'),
       ('14b7a065-67e6-4a4d-9e43-23fe464fc017', '30b7a065-67e6-4a4d-9e43-23fe464fc017', '20b7a065-67e6-4a4d-9e43-23fe464fc017', '2020-10-14'),
       ('15b7a065-67e6-4a4d-9e43-23fe464fc017', '50b7a065-67e6-4a4d-9e43-23fe464fc017', '20b7a065-67e6-4a4d-9e43-23fe464fc017', '2020-10-15');

INSERT INTO posts (id, user_id, text, post_date)
VALUES ('11b7a061-67e6-4a4d-9e43-23fe464fc017', '10b7a065-67e6-4a4d-9e43-23fe464fc017', 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.', '2020-11-11'),
       ('12b7a062-67e6-4a4d-9e43-23fe464fc017', '10b7a065-67e6-4a4d-9e43-23fe464fc017', 'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. ', '2020-11-12'),
       ('13b7a063-67e6-4a4d-9e43-23fe464fc017', '10b7a065-67e6-4a4d-9e43-23fe464fc017', 'Contrary to popular belief, Lorem Ipsum is not simply random text.', '2020-11-13'),
       ('14b7a064-67e6-4a4d-9e43-23fe464fc017', '20b7a065-67e6-4a4d-9e43-23fe464fc017', 'There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form', '2020-11-14'),
       ('15b7a065-67e6-4a4d-9e43-23fe464fc017', '20b7a065-67e6-4a4d-9e43-23fe464fc017', 'In non convallis mauris. Cras ac ante luctus, fermentum quam quis, facilisis augue.', '2020-11-15');