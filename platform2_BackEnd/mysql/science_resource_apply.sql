create table apply
(
    id            int auto_increment
        primary key,
    demand        varchar(255) null,
    intro         varchar(255) null,
    institution   varchar(255) null,
    budget        int          null,
    contact_name  varchar(255) null,
    contact_phone varchar(20)  null,
    contact_email varchar(20)  null,
    applicant_id  int          null,
    create_time   date         null,
    service_id    int          null,
    customer_id   int          null
);

INSERT INTO science_resource.apply (id, demand, intro, institution, budget, contact_name, contact_phone, contact_email, applicant_id, create_time, service_id, customer_id) VALUES (1, '需要测试', null, '国家电网', 15, '刘振', '13693459403', '24535583624@qq.com', null, '2021-03-30', 2, 1);
INSERT INTO science_resource.apply (id, demand, intro, institution, budget, contact_name, contact_phone, contact_email, applicant_id, create_time, service_id, customer_id) VALUES (2, '需要测试', '等待', 'ewee', 23, '吴宗', '15842590248', '15627294493@163.com', null, '2021-03-30', 2, 1);
INSERT INTO science_resource.apply (id, demand, intro, institution, budget, contact_name, contact_phone, contact_email, applicant_id, create_time, service_id, customer_id) VALUES (3, '需要申请', 'fdff', '北京', 15, '李玲', '15325629573', '24535583624@qq.com', null, '2021-03-31', 2, 3);
INSERT INTO science_resource.apply (id, demand, intro, institution, budget, contact_name, contact_phone, contact_email, applicant_id, create_time, service_id, customer_id) VALUES (4, '需要仪器', 'ffsdf', '中国电力', 13, '李伟', '13853295350', '153634469238@qq.com', null, '2021-04-01', 2, 3);
INSERT INTO science_resource.apply (id, demand, intro, institution, budget, contact_name, contact_phone, contact_email, applicant_id, create_time, service_id, customer_id) VALUES (5, '申请专利', 'ewee', '中国移动', 43, '段威', '15623579573', '23923451485@qq.com', null, '2021-04-01', 2, 3);
INSERT INTO science_resource.apply (id, demand, intro, institution, budget, contact_name, contact_phone, contact_email, applicant_id, create_time, service_id, customer_id) VALUES (6, '申报项目', 'dfgfg', '中国电力', 23, '陈姗姗', '1563295728', '15631949587@163.com', null, '2021-04-01', 2, 3);
INSERT INTO science_resource.apply (id, demand, intro, institution, budget, contact_name, contact_phone, contact_email, applicant_id, create_time, service_id, customer_id) VALUES (23, 'w21', 'dffer', 'werr', null, 'aaa', '15623579573', '24535583624@qq.com', null, '2021-04-13', 2, 1);