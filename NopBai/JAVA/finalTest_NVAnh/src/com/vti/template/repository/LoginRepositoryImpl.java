//

package com.vti.template.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.template.form.LoginInput;
import com.vti.template.utils.jdbc.JdbcUtil;
import com.vti.template.utils.jdbc.SqlParameter;
import com.vti.template.utils.jdbc.SqlStatement;
import com.vti.template.view.UserView;



/**
 * This class is LoginRepositoryImpl. 
 * 
 * @Description: .
 * @author: NVAnh
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: NVAnh
 * @modifer_date: Mar 25, 2020
 */
public class LoginRepositoryImpl implements LoginRepository {
	private JdbcUtil jdbc;

	
	/**
	 * Constructor for class LoginRepositoryImpl.
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 25, 2020
	 */
	public LoginRepositoryImpl() {
		jdbc = JdbcUtil.getInstance();
	}

	/**
	 * @return the jdbc
	 */
	private JdbcUtil getJdbc() {
		return jdbc;
	}

	/*
	 * @see com.vti.template.repository.LoginRepository#login(com.vti.template.form.
	 * LoginInput)
	 */

	@Override
	public UserView login(LoginInput input) {
		List<SqlParameter> parameters = new ArrayList<SqlParameter>();

		// add parameter
		parameters.add(new SqlParameter(1, input.getEmail()));
		parameters.add(new SqlParameter(2, input.getPassword()));

		// excute sql
		ResultSet resultSet = getJdbc().selectPreparationStatement(SqlStatement.LOGIN_FORM, parameters);

		if (resultSet == null) {
			getJdbc().disconnect();
			return null;

		}
		
		//get data
		try {
			while (resultSet.next()) {
				return new UserView()
						.setAccount(resultSet.getString("Email"))
						.setFullName(resultSet.getString("Fullname"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}



}
