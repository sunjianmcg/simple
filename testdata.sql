insert into sys_user (id, user_name, user_password, user_email, user_info, head_img, create_time) values (1, 'admin', '123456', 'admin@163.com', 'admi', '', '2018-04-01 9:44:56');
insert into sys_user (id, user_name, user_password, user_email, user_info, head_img, create_time) values (1001, 'test', '123456', 'test@163.com', 'test', '', '2018-04-01 11:39:22');

insert into sys_role (id, role_name, enabled, create_by, create_time) values (1, '管理员', 1, 1, '2018-04-018:4:4');
insert into sys_role (id, role_name, enabled, create_by, create_time) values (2, '普通用户', 1, 1, '2018-04-01 4:13:22');


insert into sys_privilege (id, privilege_name, privilege_url) values (1, '用户管理', '/users');
insert into sys_privilege (id, privilege_name, privilege_url) values (2, '角色管理', '/roles');
insert into sys_privilege (id, privilege_name, privilege_url) values (3, '系统日志', '/logs');
insert into sys_privilege (id, privilege_name, privilege_url) values (4, '人员维护', 'persons');
insert into sys_privilege (id, privilege_name, privilege_url) values (5, '单位维护', 'companies');


insert into sys_user_role (user_id, role_Id) values (1, 1);
insert into sys_user_role (user_id, role_Id) values (1, 2);
insert into sys_user_role (user_id, role_Id) values (101, 2);


insert into sys_role_privilege (role_id, privilege_id) values (1, 1);
insert into sys_role_privilege (role_id, privilege_id) values (1, 3);
insert into sys_role_privilege (role_id, privilege_id) values (1, 2);
insert into sys_role_privilege (role_id, privilege_id) values (2, 4);
insert into sys_role_privilege (role_id, privilege_id) values (2, 5);


175423534  5859a8db6fed5723
175423330  20d90a6a9aa2705f

/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/7/9 16:09:28                            */
/*==============================================================*/


drop table if exists sys_privilege;

drop table if exists sys_role;

drop table if exists sys_role_privilege;

drop table if exists sys_user;

drop table if exists sys_user_role;

/*==============================================================*/
/* Table: sys_privilege                                         */
/*==============================================================*/
create table sys_privilege
(
   id                   bigint not null auto_increment comment '权限ID',
   privilege_name       varchar(50) comment '权限名称',
   privilege_url        varchar(200) comment '权限URL',
   primary key (id)
);

alter table sys_privilege comment '权限表';

/*==============================================================*/
/* Table: sys_role                                              */
/*==============================================================*/
create table sys_role
(
   id                   int not null auto_increment comment '角色ID',
   role_name            varchar(50) comment '角色名',
   enabled              int comment '有效标志',
   create_by            bigint comment '创建人',
   create_time          datetime comment '创建时间',
   primary key (id)
);

alter table sys_role comment '角色表';

/*==============================================================*/
/* Table: sys_role_privilege                                    */
/*==============================================================*/
create table sys_role_privilege
(
   role_id              bigint comment '角色ID',
   privilege_id         bigint comment '角色ID'
);

alter table sys_role_privilege comment '角色权限关联表';

/*==============================================================*/
/* Table: sys_user                                              */
/*==============================================================*/
create table sys_user
(
   id                   int not null auto_increment comment '用户ID',
   user_name            varchar(50) comment '用户名',
   user_password        varchar(50) comment '密码',
   user_email           varchar(50) comment '邮箱',
   user_info            text comment '简介',
   head_img             blob comment '头像',
   create_time          datetime comment '创建时间',
   primary key (id)
);

alter table sys_user comment '用户表';

/*==============================================================*/
/* Table: sys_user_role                                         */
/*==============================================================*/
create table sys_user_role
(
   user_id              bigint comment '用户ID',
   role_Id              bigint comment '角色ID'
);

alter table sys_user_role comment '用户角色关联表';
