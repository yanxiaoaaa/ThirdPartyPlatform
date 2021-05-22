create table science_resource.patent
(
    CPC_type           varchar(200) null,
    IPC_type           varchar(200) null,
    patent_number      varchar(200) null,
    patent_id          int          not null
        primary key,
    patent_name        varchar(200) null,
    patent_text        mediumtext   null,
    publication_date   date         null,
    publication_number varchar(200) null,
    family_number      int          null,
    citation_number    int          null,
    patent_abstract    mediumtext   null,
    status             varchar(200) null,
    apply_number       varchar(200) null,
    apply_date         date         null,
    cited_number       int          null,
    language           varchar(200) null
);


