use science_resource;
create table server
(
    id          int auto_increment
        primary key,
    contact     varchar(50)  null,
    institution varchar(255) null,
    location    varchar(255) null,
    phone       varchar(50)  null,
    email       varchar(20)  null,
    score       int          null,
    user_id     int          null
);

INSERT INTO science_resource.server (id, contact, institution, location, phone, email, score, user_id) VALUES (1, '刘鑫', '黑龙江康和环保科技有限公司', '黑龙江省哈尔滨市嵩山路111号2号楼4层402-404室', '13853239432', '15285303458@qq.com', 87, 1);
INSERT INTO science_resource.server (id, contact, institution, location, phone, email, score, user_id) VALUES (2, '王晓', '黑龙江康和环保科技有限公司', '黑龙江省哈尔滨市嵩山路111号2号楼4层402-404室', '13853239432', '15285303458@qq.com', 97, 2);
INSERT INTO science_resource.server (id, contact, institution, location, phone, email, score, user_id) VALUES (3, '王良', '齐齐哈尔医学院', '齐齐哈尔市建华区卜奎北大街333号', '15803457682', 'qiyiweijian@163.com', 84, 3);
INSERT INTO science_resource.server (id, contact, institution, location, phone, email, score, user_id) VALUES (4, '谭阳阳', '哈尔滨海关技术中心牡丹江综合实验室', '黑龙江省牡丹江市江南新区卧龙街5号', '13532368643', '1244sf443fr@163.com', 67, 4);