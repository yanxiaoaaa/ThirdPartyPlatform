create table science_resource.platform_information
(
    id                   int auto_increment
        primary key,
    name                 varchar(135)  null,
    status               int default 0 null,
    url                  varchar(300)  null,
    phone                varchar(60)   null,
    mail                 varchar(300)  null,
    address              varchar(300)  null,
    service_type         varchar(300)  null,
    registration_time    date          null,
    registration_address varchar(300)  null,
    staff_size           int           null,
    legal_representative varchar(135)  null,
    profession_domain    varchar(300)  null,
    user_account         varchar(20)   null
);


