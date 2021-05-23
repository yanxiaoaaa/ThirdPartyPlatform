use science_resource;
create table user
(
    userid            int auto_increment
        primary key,
    account           varchar(20)  not null,
    password          varchar(20)  not null,
    name              varchar(20)  null,
    phone             varchar(20)  null,
    email             varchar(30)  null,
    avatar            varchar(255) null,
    country           varchar(20)  null,
    user_type         int          not null comment '0为普通用户，1为接入平台用户',
    access_method     text         null,
    current_authority varchar(20)  null,
    constraint account
        unique (account),
    constraint user_account_index
        unique (account)
)
    comment '用户表';

INSERT INTO science_resource.user (userid, account, password, name, phone, email, avatar, country, user_type, access_method, current_authority) VALUES (1, 'admin', 'admin456', '管理员', null, null, 'https://gw.alipayobjects.com/zos/antfincdn/XAosXuNZyF/BiazfanxmamNRoxxVxka.png', null, 0, null, 'admin');
INSERT INTO science_resource.user (userid, account, password, name, phone, email, avatar, country, user_type, access_method, current_authority) VALUES (2, 'server', 'server123', '服务提供商', null, null, null, null, 0, null, 'server');
INSERT INTO science_resource.user (userid, account, password, name, phone, email, avatar, country, user_type, access_method, current_authority) VALUES (3, 'customer', 'customer123', '客户', '14623782235', null, null, null, 0, null, 'customer');