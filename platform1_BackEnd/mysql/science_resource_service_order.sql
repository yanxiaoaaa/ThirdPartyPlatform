use science_resource;
create table service_order
(
    order_id                     int auto_increment
        primary key,
    service_id                   int           not null,
    create_time                  datetime      not null,
    server_id                    int           not null,
    customer_id                  int           not null,
    s_conversation_comment_score int           null,
    s_conversation_comment_text  varchar(255)  null,
    c_conversation_comment_score int           null,
    c_conversation_comment_text  varchar(255)  null,
    process_id                   int default 0 not null,
    completeness                 int           null,
    punctuality                  int           null,
    c_evaluation_score           int           null,
    professional_level           int           null,
    response_speed               int           null,
    service_experience           int           null,
    comment_context              varchar(255)  null,
    s_cooperate_score            int           null,
    s_evaluation_score           int           null,
    note                         varchar(255)  null,
    apply_id                     int           null,
    c_cooperate_score            int           null,
    protocal                     varchar(255)  null,
    is_done                      int default 0 null,
    result_file                  varchar(255)  null,
    trace_file                   varchar(255)  null
);

INSERT INTO science_resource.service_order (order_id, service_id, create_time, server_id, customer_id, s_conversation_comment_score, s_conversation_comment_text, c_conversation_comment_score, c_conversation_comment_text, process_id, completeness, punctuality, c_evaluation_score, professional_level, response_speed, service_experience, comment_context, s_cooperate_score, s_evaluation_score, note, apply_id, c_cooperate_score, protocal, is_done, result_file, trace_file) VALUES (1081495302, 1, '2021-03-30 21:28:53', 1, 3, 4, 'sdf', 4, 'sdf', 1, 5, 5, 4, 4, 5, 5, '非官方个', null, null, '请于两个工作日内确认', 1, 2, null, 0, null, null);
INSERT INTO science_resource.service_order (order_id, service_id, create_time, server_id, customer_id, s_conversation_comment_score, s_conversation_comment_text, c_conversation_comment_score, c_conversation_comment_text, process_id, completeness, punctuality, c_evaluation_score, professional_level, response_speed, service_experience, comment_context, s_cooperate_score, s_evaluation_score, note, apply_id, c_cooperate_score, protocal, is_done, result_file, trace_file) VALUES (1081495303, 1, '2021-03-30 21:29:37', 1, 3, null, null, 4, 'huu', 5, 4, 4, 4, 4, 5, 5, 'FFDF', null, null, '请于两个工作日内确认', 2, 0, null, 0, null, null);
INSERT INTO science_resource.service_order (order_id, service_id, create_time, server_id, customer_id, s_conversation_comment_score, s_conversation_comment_text, c_conversation_comment_score, c_conversation_comment_text, process_id, completeness, punctuality, c_evaluation_score, professional_level, response_speed, service_experience, comment_context, s_cooperate_score, s_evaluation_score, note, apply_id, c_cooperate_score, protocal, is_done, result_file, trace_file) VALUES (1081495304, 2, '2021-03-31 14:43:30', 2, 3, 4, 'dfdfd', 3, 'dsd', 5, 5, 4, 4, 4, 5, 5, 'rtter', 0, 0, '请于两个工作日内确认', 3, 0, null, 1, null, null);
INSERT INTO science_resource.service_order (order_id, service_id, create_time, server_id, customer_id, s_conversation_comment_score, s_conversation_comment_text, c_conversation_comment_score, c_conversation_comment_text, process_id, completeness, punctuality, c_evaluation_score, professional_level, response_speed, service_experience, comment_context, s_cooperate_score, s_evaluation_score, note, apply_id, c_cooperate_score, protocal, is_done, result_file, trace_file) VALUES (1081495305, 2, '2021-04-01 16:26:14', 2, 3, 5, 'eer', 2, 'ded', 1, null, null, null, null, null, null, null, null, null, '请于两个工作日内确认', 4, null, null, 0, null, null);
INSERT INTO science_resource.service_order (order_id, service_id, create_time, server_id, customer_id, s_conversation_comment_score, s_conversation_comment_text, c_conversation_comment_score, c_conversation_comment_text, process_id, completeness, punctuality, c_evaluation_score, professional_level, response_speed, service_experience, comment_context, s_cooperate_score, s_evaluation_score, note, apply_id, c_cooperate_score, protocal, is_done, result_file, trace_file) VALUES (1081495306, 2, '2021-04-01 16:32:51', 2, 3, 1, 'dwwe', null, '', 2, null, null, 2, 2, 4, 4, 'ereer', null, null, '请于两个工作日内确认', 5, 0, '', 0, null, null);
INSERT INTO science_resource.service_order (order_id, service_id, create_time, server_id, customer_id, s_conversation_comment_score, s_conversation_comment_text, c_conversation_comment_score, c_conversation_comment_text, process_id, completeness, punctuality, c_evaluation_score, professional_level, response_speed, service_experience, comment_context, s_cooperate_score, s_evaluation_score, note, apply_id, c_cooperate_score, protocal, is_done, result_file, trace_file) VALUES (1081495307, 2, '2021-04-01 16:47:57', 2, 3, null, '', 0, 'efeff', 2, null, null, 2, 2, 4, 4, 'dffdfdf', 1, 5, '请于两个工作日内确认', 6, 0, '["resource/storage/science/storage/fetch/1618411583755.jpg"]', 1, null, null);
INSERT INTO science_resource.service_order (order_id, service_id, create_time, server_id, customer_id, s_conversation_comment_score, s_conversation_comment_text, c_conversation_comment_score, c_conversation_comment_text, process_id, completeness, punctuality, c_evaluation_score, professional_level, response_speed, service_experience, comment_context, s_cooperate_score, s_evaluation_score, note, apply_id, c_cooperate_score, protocal, is_done, result_file, trace_file) VALUES (1081495308, 2, '2021-04-13 17:09:01', 2, 1, 4, 'dfdfdf', 4, 'dfdfdf', 4, null, null, null, null, null, null, null, 2, 5, null, 23, null, '["resource/storage/science/storage/fetch/1618468340377.docx","resource/storage/science/storage/fetch/1618468340390.jpg"]', 0, '["resource/storage/science/storage/fetch/1618462432422.jpg"]', null);