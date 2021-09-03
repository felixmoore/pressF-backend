USE FToPayRespectsDB;
DROP TABLE IF EXISTS Test_Table;
CREATE TABLE Test_Table (
 ID INT PRIMARY KEY auto_increment NOT NULL,
 TestMessage VARCHAR(250) NOT NULL
);

INSERT INTO Test_Table VALUES (1, 'This is a TEST!');
INSERT INTO Test_Table VALUES (2, 'This is another TEST!');


SELECT * FROM Test_Table;



