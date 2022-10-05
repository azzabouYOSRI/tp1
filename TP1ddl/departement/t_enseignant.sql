create table t_enseignant
(
    id               bigint auto_increment
        primary key,
    address          varchar(30) null,
    grade            varchar(30) null,
    nom              varchar(30) null,
    numero_telephoen varchar(30) null,
    prenom           varchar(30) null,
    departement_id   bigint      not null,
    constraint FKb5pb7oifblahdiui6vn2o6at0
        foreign key (departement_id) references t_departement (id)
            on delete cascade
);