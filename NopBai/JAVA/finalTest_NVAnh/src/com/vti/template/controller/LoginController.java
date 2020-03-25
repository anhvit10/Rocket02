
package com.vti.template.controller;

import com.vti.template.dto.LoginDto;
import com.vti.template.form.LoginInput;
import com.vti.template.service.LoginService;
import com.vti.template.service.LoginServiceImpl;
import com.vti.template.utils.validate.ValidateForm;


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
public class LoginController {
	private LoginService service;
	private ValidateForm validate;

	
	/**
	 * Constructor for class LoginController.
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 25, 2020
	 */
	public LoginController() {
		service = new LoginServiceImpl();
		validate = new ValidateForm();
	}

	public LoginDto Login(LoginInput input) {
		if (validate.isValidateLoginInputForm(input)) {
			return service.login(input);
		}
		return null;

	}

}
