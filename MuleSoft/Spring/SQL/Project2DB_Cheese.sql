CREATE USER Project2_Cheese IDENTIFIED BY Shawn DEFAULT TABLESPACE users TEMPORARY TABLESPACE temp QUOTA 10M ON users;
GRANT connect, resource, create session, create table, create view to Project2_Cheese;

CREATE TABLE Cheese (
    Id INT Primary Key NOT NULL,
    Name VARCHAR2 (50) NOT NULL,
    Stock INT
);

INSERT INTO Cheese VALUES (11, 'Chedder', 50);
    
INSERT INTO Cheese VALUES(22, 'Swiss', 20);
    
INSERT INTO Cheese VALUES(33, 'Mozzarella', 10);
    
INSERT INTO Cheese VALUES(44, 'Blue', 5);
    
INSERT INTO Cheese VALUES(55, 'Gouda', 2);
    
commit;