CREATE TABLE IF not EXISTS account_user (
  id serial not null primary key,
  username varchar(255) NOT NULL,
  password varchar(255)
);
create sequence account_user_sequence start with 100 increment by 1;