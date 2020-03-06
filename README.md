# JavaDemo

#### Database Setup

```$sql
create database demo_database;
create user demo_user with encrypted password 'demo_user';
grant all privileges on database demo_database to demo_user;
```

#### Schema Setup
```sql
create table user_info (id integer primary key, user_uuid UUID not null, first_name varchar(255), last_name varchar(255), user_location varchar(255), creation_date timestamp default current_timestamp, user_enabled boolean);
alter table user_info add constraint user_info_unq1 unique(user_uuid);
ALTER TABLE user_info OWNER TO demo_user;


create table user_authentication (id integer primary key, user_uuid UUID not null, username varchar(255), user_password varchar(255), last_login timestamp, account_locked boolean, password_reset boolean, failed_login_attempts boolean, auth_url varchar(255));
alter table user_authentication add constraint user_authentication_ref1 foreign key (user_uuid) references user_info(user_uuid);
ALTER TABLE user_authentication OWNER TO demo_user;

create table course (id integer primary key, course_code varchar(32) not null, course_name varchar(255) not null, course_description varchar(1024), course_length integer);
ALTER TABLE course OWNER TO demo_user;

create table course_detail (id bigint primary key, course_id integer, instructor_ref UUID, academic_year integer, reference_material varchar(2048), batch varchar(32), instructor_role varchar(128) not null);
alter table course_detail add constraint course_detail_ref1 foreign key (instructor_ref) references user_info(user_uuid);
alter table course_detail add constraint course_detail_ref2 foreign key (course_id) references course(id);
ALTER TABLE course_detail OWNER TO demo_user;

create table audit (id bigint primary key, user_uuid UUID, audit_type varchar(255) not null, description varchar(2048), event_time timestamp default current_timestamp);
alter table audit add constraint audit_ref1 foreign key (user_uuid) references user_info(user_uuid);
ALTER TABLE audit OWNER TO demo_user;

```

