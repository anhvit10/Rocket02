package com.vti.template.utils.jdbc;


/**
 * This class is SqlStatement. 
 * 
 * @Description: .
 * @author: NVAnh
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: NVAnh
 * @modifer_date: Mar 25, 2020
 */
public class SqlStatement {
	
	public static final String LOGIN_FORM = 
		      "SELECT Email , concat(FirstName,LastName)AS Fullname "
		      + "FROM user"
		      + " WHERE Email= ? AND Password= ? ";
	

	
	
  public static final String SQL_SELECT_ALL_USER = 
      "SELECT FirstName, LastName, BirthDate, Address, Phone, Email, ExperienceInYear, ProSkill "
      + "FROM user "
      + "WHERE user_type = 0";
  
  
 
  public static final String SQL_INSERT_MANAGER = 
      "INSERT INTO MANAGER (ExpInYear) " 
      + "VALUES (?)";

  public static final String SQL_INSERT_EMPLOYEE = 
      "INSERT INTO EMPLOYEE ( ProjectName,ProSkill) " 
      + "VALUES (?, ?)";

  public static final String SQL_INSERT_USER = 
  "INSERT INTO Candidate ( Email,FirstName,LastName,Phone ) " 
  + "VALUES (?, ?, ?, ?)";
  
  public static final String SQL_CHECK_EMAIL_EXITS = 
      "SELECT * "
      + "FROM user "
      + "WHERE Email = ?";

  

  
}
