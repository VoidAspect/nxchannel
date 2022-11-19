-- create tables

create table boards
(
    id          serial primary key,
    name        text not null unique,
    description text
);

create table threads
(
    id               bigserial primary key,
    board_id         integer       not null references boards on delete cascade,
    original_post_id bigint unique not null,
    updated_at       timestamp     not null
);

create index on threads (board_id);

create table posts
(
    id         bigserial primary key,
    title      text,
    content    text,
    created_at timestamp not null default current_timestamp,
    thread_id  bigint    not null references posts on delete cascade
);

alter table threads
    add foreign key (original_post_id) references posts;

create index on posts (thread_id);

create table post_attachments
(
    id                 uuid   not null primary key,
    name               text   not null,
    content_type       text   not null,
    location           text   not null,
    thumbnail_location text   not null,
    post_id            bigint not null references posts
);

create index on post_attachments (post_id);

