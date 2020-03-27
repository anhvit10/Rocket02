
package com.vti.template.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.template.form.EmplyeeInput;
import com.vti.template.form.ManagerInput;
import com.vti.template.form.UserInput;
import com.vti.template.utils.jdbc.JdbcUtil;
import com.vti.template.utils.jdbc.SqlParameter;
import com.vti.template.utils.jdbc.SqlStatement;




/**
 * This class is RegisterRepositoryImpl. 
 * 
 * @Description: .
 * @author: NVAnh
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: NVAnh
 * @modifer_date: Mar 25, 2020
 */
public class RegisterRepositoryImpl implements RegisterRepository {
	private JdbcUtil jdbc;

	
	/**
	 * Constructor for class RegisterRepositoryImpl.
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 25, 2020
	 */
	public RegisterRepositoryImpl() {
		jdbc = JdbcUtil.getInstance();
	}

	/**
	 * @return the jdbc
	 */
	private JdbcUtil getJdbc() {
		return jdbc;
	}
	/*
	 * @see
	 * com.vti.template.repository.RegisterRepository#Register(com.vti.template.form
	 * .RegisterInput)
	 */

	@Override
	public int RegisterEmplyee(EmplyeeInput input) {

		List<SqlParameter> parameters = new ArrayList<SqlParameter>();

		// add parameter
		parameters.add(new SqlParameter(1, input.getProjectName()));
		parameters.add(new SqlParameter(2, input.getProSkill()));
		

		// excute sql
		int result = getJdbc().updatePreparationStatement(SqlStatement.SQL_INSERT_EMPLOYEE, parameters);

		return result;
	}

	/*
	 * @see
	 * com.vti.template.repository.RegisterRepository#RegisterExperience(com.vti.
	 * template.form.RegisterInput)
	 */

	@Override
	public int RegisterManager(ManagerInput input) {
		List<SqlParameter> parameters = new ArrayList<SqlParameter>();

		// add parameter
		parameters.add(new SqlParameter(1, input.getExpInYear()));

		// excute sql
		int result = getJdbc().updatePreparationStatement(SqlStatement.SQL_INSERT_MANAGER, parameters);
		return result;
	}

	/* 
	* @see com.vti.template.repository.RegisterRepository#existEmail(java.lang.String)
	*/
	
	@Override
	public boolean existEmail(String email) {
		List<SqlParameter> list = new ArrayList<SqlParameter>();
		
		//add param
		list.add(new SqlParameter(1, email));
		
		//excute sql
		ResultSet result = getJdbc().selectPreparationStatement(SqlStatement.SQL_CHECK_EMAIL_EXITS, list);
		
		if (result == null) {
			getJdbc().disconnect();
			return false;
		}
		
		//get data
		try {
			while (result.next()) {
				getJdbc().disconnect();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		getJdbc().disconnect();
		return false;
	}

	
	/* 
	* @see com.vti.template.repository.RegisterRepository#RegisterCandidate(com.vti.template.form.RegisterCandidateInput)
	*/
	
	@Override
	public int RegisterUser(UserInput input) {
		List<SqlParameter> parameters = new ArrayList<SqlParameter>();

		// add parameter
		parameters.add(new SqlParameter(1, input.getEmail()));
		parameters.add(new SqlParameter(2, input.getFirstName()));
		parameters.add(new SqlParameter(3, input.getLastName()));
		parameters.add(new SqlParameter(4, input.getPhone()));

		// excute sql
		int result = getJdbc().updatePreparationStatement(SqlStatement.SQL_INSERT_USER, parameters);
		return result;
	}

}
