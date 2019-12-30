DROP DATABASE IF EXISTS BT6;
CREATE DATABASE IF NOT EXISTS BT6;
USE BT6;

-- QUESTION 1
DROP TABLE IF EXISTS 	Employee;
CREATE TABLE IF NOT EXISTS 	Employee (
    EmployeeID 					TINYINT AUTO_INCREMENT PRIMARY KEY,
    EmployeeFistName			VARCHAR(30) NOT NULL,
    EmployeeLastName 			VARCHAR(30) NOT NULL,
    EmployeeHireDate 			DATE NOT NULL,
    EmployeeStatus 				VARCHAR(30),
    SupervisorID			 	CHAR(5) NOT NULL,													
    SocialSecurityNumber		CHAR(5) NOT NULL
);
INSERT INTO Employee (EmployeeFistName, EmployeeLastName, EmployeeHireDate, EmployeeStatus, SupervisorID, SocialSecurityNumber)
VALUES 
					 ('NGUYEN VIET' ,   'ANH'   ,  '2000-01-01', 	'CON LAM VIEC',	 '111', 	'12345'),
					 ('NGUYEN TAT'  ,   'THANH' ,  '2001-01-01', 	'CON LAM VIEC',	 '112', 	'45678'),
					 ('BUI VAN'     ,   'TIEN'  ,  '2002-01-01', 	'CON LAM VIEC',	 '113', 	'12398'),
                     ('LE VAN'      ,   'THANH' ,  '1999-05-06', 	'CON LAM VIEC',	 '114', 	'45698');

DROP TABLE IF EXISTS 	Projects;
CREATE TABLE IF NOT EXISTS  Projects (
    ProjectID 					TINYINT AUTO_INCREMENT PRIMARY KEY,
    EmployeeID 					TINYINT,
    ProjectName					VARCHAR(30),
    ProjectStartDate 			DATE,
    ProjectDescription 			VARCHAR(255),
    ProjectDetailt 				VARCHAR(255),
    ProjectCompletedOn 			DATE,
    FOREIGN KEY (EmployeeID)
        REFERENCES Employee (EmployeeID)
        ON DELETE CASCADE
);
INSERT INTO Projects( EmployeeID, ProjectName, ProjectStartDate, ProjectDescription              ,ProjectDetailt    ,ProjectCompletedOn    )
VALUES 
					(	1, 	'QUAN LY BAN HANG' , '2017-11-03' , 'QUAN LY BAN HANG SIEU THI'      , 'QUAN TRONG'		, '2018-02-01'			),
					(	2, 	'QUAN LY NHAN VIEN', '2016-01-03' , 'QUAN LY NHAN VIEN TRONG CONG TY', 'BINH THUONG'	,      NULL	  			),
					(	3, 	'QUAN LY TAI SAN'  , '2018-08-08' , 'QUAN LY TAI SAN THUA KE'        , 'RAT QUAN TRONG' ,      NULL	  			);

DROP TABLE IF EXISTS 	Project_Modules;
CREATE TABLE IF NOT EXISTS  Project_Modules (
    ModuleID 					TINYINT AUTO_INCREMENT PRIMARY KEY,
    ProjectID 					TINYINT,
    EmployeeID 					TINYINT,
    ProjectModulesDate 			DATE,
    ProjectModulesCompledOn 	DATE,
    ProjectModulesDescription 	VARCHAR(255),
    FOREIGN KEY (ProjectID)
        REFERENCES Projects (ProjectID)
        ON DELETE CASCADE,
    FOREIGN KEY (EmployeeID)
        REFERENCES Employee (EmployeeID)
        ON DELETE CASCADE
);
INSERT INTO Project_Modules( ProjectID, EmployeeID, ProjectModulesDate, ProjectModulesCompledOn, ProjectModulesDescription )
VALUES
						   (	 1,		   1, 			'2020-01-01',		 '2018-02-15', 		'VIET CHUC NANG LOG IN'	   ),
						   (	 2, 	   2, 			'2020-01-03', 		 '2017-05-10', 		'VIET CHUC NANG DIEM DANH' ),
						   (	 3, 	   3, 			'2020-01-01', 		 		 NULL, 		'VIET CHUC NANG TINH TIEN' ); 

DROP TABLE IF EXISTS 	Work_Done;
CREATE TABLE IF NOT EXISTS  Work_Done (
    WorkDoneID 					TINYINT AUTO_INCREMENT PRIMARY KEY,
    EmployeeID 					TINYINT,
    ModuleID 					TINYINT,
    WorkDoneDate 				DATE,
    WorkDoneDescription 		VARCHAR(255),
    WorkDoneStatus 				VARCHAR(255),
    FOREIGN KEY (EmployeeID)
        REFERENCES Employee (EmployeeID)
        ON DELETE CASCADE,
    FOREIGN KEY (ModuleID)
        REFERENCES Project_Modules (ModuleID)
        ON DELETE CASCADE
);
INSERT INTO Work_Done( EmployeeID, ModuleID, WorkDoneDate, WorkDoneDescription	 , WorkDoneStatus	 )
VALUES 
					 (		1,		 1, 	'2018-02-20',  'LAM GIAO DIEN LOG IN', 	'HOAN THANH 100%'),
					 (		2, 	  	 2, 		NULL	,   	 NULL  		 	 , 		  NULL 		 ),
					 (		3, 		 3, 	'2016-06-20',   'LAM GIAO DIEN'		 ,        NULL		 ),
					 (		4, 		 3, 	'2016-06-20',   'LAM GIAO DIEN'		 ,        NULL		 );

-- QUESTION 2
DROP PROCEDURE IF EXISTS REMOVE_PROJECT;
DELIMITER $$
CREATE PROCEDURE REMOVE_PROJECT()
BEGIN
DROP TEMPORARY TABLE IF EXISTS REMOVE_PROJECT;
CREATE TEMPORARY TABLE REMOVE_PROJECT ( 
		PROJECT_ID 				TINYINT,
        EMPLOYEEID			    TINYINT, 
        PROJECTNAME 			VARCHAR(30), 
        PROJECTSTARTDATE 		DATE, 
        PROJECTDESCRIPTION		VARCHAR(30),
        PROJECTDETAILT 			VARCHAR(30),
        PROJECTCOMPLETEDON 		DATE );
INSERT INTO REMOVE_PROJECT ( PROJECT_ID, EMPLOYEEID, PROJECTNAME, PROJECTSTARTDATE, PROJECTDESCRIPTION ,PROJECTDETAILT ,PROJECTCOMPLETEDON )
SELECT * FROM Projects WHERE SUBDATE(ProjectCompletedOn, INTERVAL 90 DAY) = ProjectStartDate;
SELECT * FROM REMOVE_PROJECT;

DROP TEMPORARY TABLE IF EXISTS REMOVE_PROJECT_MODULE;
CREATE TEMPORARY TABLE REMOVE_PROJECT_MODULE ( 
		MODULE_ID 					TINYINT,
		ProjectID 					TINYINT,
		EmployeeID 					TINYINT,
		ProjectModulesDate 			DATE,
		ProjectModulesCompledOn 	DATE,
		ProjectModulesDescription 	VARCHAR(255) );
INSERT INTO REMOVE_PROJECT_MODULE (MODULE_ID, ProjectID, EmployeeID, ProjectModulesDate, ProjectModulesCompledOn, ProjectModulesDescription)
SELECT * FROM Project_Modules WHERE ProjectID = (SELECT PROJECT_ID FROM REMOVE_PROJECT );
SELECT * FROM REMOVE_PROJECT_MODULE;

DROP TEMPORARY TABLE IF EXISTS REMOVE_WORK_DONE;
CREATE TEMPORARY TABLE REMOVE_WORK_DONE ( 
		WORK_DONE_ID 				TINYINT,
		EmployeeID 					TINYINT,
		ModuleID 					TINYINT,
		WorkDoneDate 				DATE,
		WorkDoneDescription 		VARCHAR(255),
		WorkDoneStatus 				VARCHAR(255));
INSERT INTO REMOVE_WORK_DONE ( WORK_DONE_ID, EmployeeID, ModuleID, WorkDoneDate, WorkDoneDescription, WorkDoneStatus )
SELECT * FROM Work_Done WHERE ModuleID = (SELECT MODULE_ID FROM REMOVE_PROJECT_MODULE);
SELECT * FROM REMOVE_WORK_DONE;
END$$
DELIMITER ;

CALL REMOVE_PROJECT();

DELETE FROM Work_Done 		WHERE 	ModuleID 	= 	( SELECT MODULE_ID FROM REMOVE_PROJECT_MODULE ) ;
DELETE FROM Project_Modules WHERE 	ProjectID 	= 	( SELECT PROJECT_ID FROM REMOVE_PROJECT  ) ;
DELETE FROM Projects 		WHERE SUBDATE( ProjectCompletedOn, INTERVAL 90 DAY ) = ProjectStartDate ;


-- QUESTION 3
DROP PROCEDURE IF EXISTS module;
DELIMITER $$
CREATE PROCEDURE module()
BEGIN
SELECT pm.EmployeeID, pm.ProjectModulesDate, pm.ProjectModulesCompledOn, pm.ProjectModulesDescription,
		p.ProjectName, p.ProjectStartDate, p.ProjectDescription , p.ProjectDetailt, p.ProjectCompletedOn
FROM 
Project_Modules pm
JOIN 
Projects p  ON pm.EmployeeID = p.EmployeeID
WHERE pm.ProjectModulesCompledOn IS NULL ;
END$$
DELIMITER ;

CALL module();


-- QUESTION 4
SELECT  wd.EmployeeID, wd.ModuleID, wd.WorkDoneDate, wd.WorkDoneDescription, wd.WorkDoneStatus,
		pm.ProjectID, pm.ProjectModulesDate, pm.ProjectModulesCompledOn, pm.ProjectModulesDescription
FROM Work_Done wd
LEFT JOIN Project_Modules pm ON wd.EmployeeID = pm.EmployeeID
WHERE pm.EmployeeID IS NULL;


 


