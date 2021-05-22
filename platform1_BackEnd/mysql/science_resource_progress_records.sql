create table progress_records
(
    id           int          null comment '监管流程id',
    process_id   int          null comment '流程id',
    order_id     int          null comment '服务id',
    plan_time    datetime     null comment '流程计划时间',
    real_time    datetime     null comment '实际完成时间',
    relate_files varchar(255) null comment '相关文件地址',
    delay        int          null comment '是否延期'
);

