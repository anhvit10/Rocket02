//
package com.vti.template.form;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: NVAnh
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: NVAnh
 * @modifer_date: Mar 25, 2020
 */
public class UserInput {

	private String  firstName, passWord, lastName, email, phone;
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param firstName the firstName to set
	 * @return
	 */
	public UserInput setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * @param lastName the lastName to set
	 * @return
	 */
	public UserInput setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param phone the phone to set
	 * @return
	 */
	public UserInput setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	/**
	 * @param email the email to set
	 * @return
	 */
	public UserInput setEmail(String email) {
		this.email = email;
		return this;
	}

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 25, 2020
	 * @return
	 */
	public String getPassword() {
		return passWord;
	}

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @param passWord 
	 * @modifer: NVAnh
	 * @modifer_date: Mar 25, 2020
	 * @param password2
	 * @return
	 */
	public UserInput setPassword(String passWord) {
		this.passWord = passWord;
		return this;
	}

}
