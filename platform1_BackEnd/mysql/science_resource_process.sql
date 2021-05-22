create table process
(
    process_id      int          not null
        primary key,
    service_id      int          not null,
    process_title   varchar(255) null,
    process_context varchar(255) null
);

