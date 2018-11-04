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