
DROP DATABASE IF EXISTS `user`;

CREATE DATABASE IF NOT EXISTS `user`;
USE user;


DROP TABLE IF EXISTS 	`User`;
CREATE TABLE	`User` (
		`ID`				SMALLINT AUTO_INCREMENT PRIMARY KEY,
        `Password`			NVARCHAR(30) NOT NULL,
        FirstName			NVARCHAR(30) NOT NULL,
        LastName			NVARCHAR(30) NOT NULL,
        Phone				VARCHAR(12) NOT NULL,
        Email				CHAR(30) UNIQUE NOT NULL
        );
        

DROP TABLE IF EXISTS 	Manager;
CREATE TABLE	Manager (
		`ID`				SMALLINT AUTO_INCREMENT PRIMARY KEY,
		ExpInYear			TINYINT NOT NULL,
        IDuser				SMALLINT NOT NULL,
        FOREIGN KEY (IDuser) REFERENCES `User` (`ID`) ON DELETE CASCADE
        );	
        

DROP TABLE IF EXISTS 	Employee;
CREATE TABLE	Employee (
		`ID`				SMALLINT AUTO_INCREMENT PRIMARY KEY,
		ProSkill			ENUM('dev','Test','java'),
		ProjectName 		NVARCHAR(30) NOT NULL,
        IDuser			SMALLINT NOT NULL,
        FOREIGN KEY (IDuser) REFERENCES `User` (`ID`) ON DELETE CASCADE
        ); 
        