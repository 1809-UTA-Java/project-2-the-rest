create user produce
identified by password03
default tablespace users
temporary tablespace temp
quota 10m on users;

grant connect to produce;
grant resource to produce;
grant create session to produce;
grant create table to produce;
grant create view to produce;

create table produce_type (
   id integer primary key,
   produce_type varchar2(35)
);

INSERT INTO produce_type (id, produce_type)
VALUES (20, 'lettuce');

INSERT INTO produce_type (id, produce_type)
VALUES (21, 'tomato');

INSERT INTO produce_type (id, produce_type)
VALUES (22, 'cucumber');

INSERT INTO produce_type (id, produce_type)
VALUES (23, 'spinach');

INSERT INTO produce_type (id, produce_type)
VALUES (24, 'avocado');

INSERT INTO produce_type (id, produce_type)
VALUES (25, 'pickle');

INSERT INTO produce_type (id, produce_type)
VALUES (26, 'banana');

INSERT INTO produce_type (id, produce_type)
VALUES (27, 'mushroom');

commit;