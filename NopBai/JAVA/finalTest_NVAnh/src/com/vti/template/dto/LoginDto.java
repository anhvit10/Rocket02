
package com.vti.template.dto;

import com.vti.template.view.CandidateView;



/**
 * This class is LoginDto. 
 * 
 * @Description: .
 * @author: NVAnh
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: NVAnh
 * @modifer_date: Mar 25, 2020
 */
public class LoginDto {
	private String account, fullName;

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
	public LoginDto setAccount(String account) {
		this.account = account;
		return this;
	}

	/**
	 * @param role the role to set
	 * @return
	 */

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
	public LoginDto setFullName(String fullName) {
		this.fullName = fullName;
		return this;
	}

	
	/**
	 * Constructor for class LoginDto.
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 25, 2020
	 * @param view
	 */
	public LoginDto(CandidateView view) {
		account = view.getAccount();
		fullName = view.getFullName();
	}

	
	/**
	 * This method is LoginDto . 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 25, 2020
	 * @param dto
	 * @return
	 */
	public CandidateView toEntity(LoginDto dto) {
		return new CandidateView()
				.setAccount(dto.getAccount())
				.setFullName(dto.getFullName());
	}

}
