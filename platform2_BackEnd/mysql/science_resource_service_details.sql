use science_resource;
create table service_details
(
    id         int auto_increment
        primary key,
    company_id int          null,
    if_share   tinyint(1)   null,
    product    varchar(255) null,
    remarks    varchar(255) null,
    industry   varchar(255) null,
    field      varchar(50)  null,
    price      int          null,
    cycle      varchar(255) null,
    picture    varchar(255) null,
    add_date   varchar(50)  null,
    server_id  int          null,
    name       varchar(255) null
);

INSERT INTO science_resource.service_details (id, company_id, if_share, product, remarks, industry, field, price, cycle, picture, add_date, server_id, name) VALUES (1, 11, 1, '生活饮用水', null, '农林/食品产业', '化学', 150, '7-10个工作日', null, '2020/6/2 9:42', 1, '生活饮用水质监测');
INSERT INTO science_resource.service_details (id, company_id, if_share, product, remarks, industry, field, price, cycle, picture, add_date, server_id, name) VALUES (2, 122, 1, '生活饮用水', null, '农林/食品产业', '化学', 150, '7-10个工作日', null, '2020/9/3 17:22', 2, '生活饮用水质监测');
INSERT INTO science_resource.service_details (id, company_id, if_share, product, remarks, industry, field, price, cycle, picture, add_date, server_id, name) VALUES (3, 15, 1, '检验检测', null, '农林/食品产业', '化学', 150, '7-10个工作日', null, '2020/10/3 14:02', 3, '检验检测服务');
INSERT INTO science_resource.service_details (id, company_id, if_share, product, remarks, industry, field, price, cycle, picture, add_date, server_id, name) VALUES (4, 21, 1, '食品检验', null, '农林/食品产业', '化学', 150, '7-10个工作日', null, '2020/12/2 8:02', 4, '保健食品菌落数测定');