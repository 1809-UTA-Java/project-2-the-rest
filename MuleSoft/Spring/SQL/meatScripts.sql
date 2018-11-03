CREATE TABLE meats(
   ID NUMBER NOT NULL,
   TYPE VARCHAR2(20) NOT NULL,
   CALORIES VARCHAR2(20) NOT NULL,
   STOCK NUMBER,
   PRIMARY KEY (ID)
);

insert into meats values (0, 'beef', 100, 50)
insert into meats values (1, 'chicken', 200, 50)
insert into meats values (2, 'pork', 300, 50)