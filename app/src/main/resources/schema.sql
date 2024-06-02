-- create user_service schema if not exists
CREATE SCHEMA IF NOT EXISTS user_service;

-- create user_service.users table if not exists
CREATE TABLE user_service.users
(
    id           SERIAL PRIMARY KEY,
    name         VARCHAR(255)        NOT NULL,
    email        VARCHAR(255) UNIQUE NOT NULL,
    password     VARCHAR(255)        NOT NULL,
    phone_number VARCHAR(20)         NOT NULL,
    created_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);