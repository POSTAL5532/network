CREATE TABLE users
(
    id             VARCHAR(36)  NOT NULL,
    full_name      VARCHAR(255) NOT NULL,
    email          VARCHAR(255) NOT NULL UNIQUE,
    password       VARCHAR(255) NOT NULL,
    reg_date       TIMESTAMP    NOT NULL,
    status         VARCHAR(255) NOT NULL,
    confirm_status VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE messages
(
    id               VARCHAR(36)  NOT NULL,
    from_user_id     VARCHAR(36)  NOT NULL,
    to_user_id       VARCHAR(36)  NOT NULL,
    text             TEXT         NOT NULL,
    sent_date        TIMESTAMP    NOT NULL,
    delivered_status VARCHAR(255) NOT NULL,
    read_status      VARCHAR(255) NOT NULL,
    confirm_status   VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE post
(
    id        VARCHAR(36) NOT NULL,
    user_id   VARCHAR(36) NOT NULL,
    text      TEXT        NOT NULL,
    post_date TIMESTAMP   NOT NULL,
    PRIMARY KEY (id)
);
