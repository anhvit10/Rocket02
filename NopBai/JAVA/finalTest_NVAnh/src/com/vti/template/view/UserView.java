package com.vti.template.view;


/**
 * This class is UserView. 
 * 
 * @Description: .
 * @author: NVAnh
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: NVAnh
 * @modifer_date: Mar 25, 2020
 */
public class UserView {

	private String account,fullName;
	

	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 * @return
	 */
	/**
	 * This method set account . 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 25, 2020
	 * @param account
	 * @return
	 */
	public UserView setAccount(String account) {
		this.account = account;
		return this;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 * @return 
	 */
	public UserView setFullName(String fullName) {
		this.fullName = fullName;
		return this;
	}

	
	

}
