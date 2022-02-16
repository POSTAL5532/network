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