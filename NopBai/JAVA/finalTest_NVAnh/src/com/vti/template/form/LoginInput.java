//
package com.vti.template.form;

/**
 * This class is LoginInput. 
 * 
 * @Description: .
 * @author: NVAnh
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: NVAnh
 * @modifer_date: Mar 25, 2020
 */
public class LoginInput {
	private String email, password;

	/**
	 * @return the account
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param account the account to set
	 * @return 
	 */
	public LoginInput setEmail(String email) {
		this.email = email;
		return this;
	}

	/**
	 * @param password the password to set
	 * @return 
	 */
	public LoginInput setPassword(String password) {
		this.password = password;
		return this;
	}

}
