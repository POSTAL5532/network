CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE users
(
    id        VARCHAR(36)  NOT NULL,
    full_name VARCHAR(255) NOT NULL,
    email     VARCHAR(255) NOT NULL UNIQUE,
    password  VARCHAR(255) NOT NULL,
    reg_date  TIMESTAMP    NOT NULL,
    status    VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE posts
(
    id        VARCHAR(36) NOT NULL,
    user_id   VARCHAR(36) NOT NULL,
    text      TEXT        NOT NULL,
    post_date TIMESTAMP   NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE subscriptions
(
    id             VARCHAR(36) NOT NULL,
    user_id        VARCHAR(36) NOT NULL,
    target_user_id VARCHAR(36) NOT NULL,
    subscribe_date TIMESTAMP   NOT NULL,
    PRIMARY KEY (id)
);
