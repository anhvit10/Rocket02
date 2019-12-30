USE BT6;

DROP TRIGGER IF EXISTS CHECK_DATE;
DELIMITER $$
CREATE TRIGGER CHECK_DATE
BEFORE INSERT ON project_modules FOR EACH ROW
BEGIN 
 DECLARE V_StartDate DATE;
 DECLARE V_CompletedOn DATE;

 SELECT ProjectStartDate INTO V_StartDate 
		FROM projects JOIN project_modules
			 WHERE projects.ProjectID = project_modules.ProjectID LIMIT 1;
 SELECT ProjectCompletedOn INTO V_CompletedOn 
		FROM projects JOIN project_modules
			 WHERE projects.ProjectID = project_modules.ProjectID LIMIT 1;
 
  IF NEW.ProjectModulesDate < V_StartDate OR NEW.ProjectModulesCompledOn > V_CompletedOn
  THEN SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'NHAP SAI DU LIEU NGAY THANG';
  END IF;
END $$
DELIMITER ;

INSERT INTO Project_Modules ( ProjectID, EmployeeID, ProjectModulesDate, ProjectModulesCompledOn, ProjectModulesDescription )
VALUES (  3 , 4, '2018-08-01', '2019-01-01' , 'TOT' );

SELECT * FROM Project_Modules;