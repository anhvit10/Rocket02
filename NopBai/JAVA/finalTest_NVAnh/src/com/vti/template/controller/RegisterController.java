//

package com.vti.template.controller;

import com.vti.template.form.EmplyeeInput;
import com.vti.template.form.ManagerInput;
import com.vti.template.form.UserInput;
import com.vti.template.service.RegisterService;
import com.vti.template.service.RegisterServiceImpl;
import com.vti.template.utils.validate.ValidateForm;


/**
 * This class is RegisterController. 
 * 
 * @Description: .
 * @author: NVAnh
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: NVAnh
 * @modifer_date: Mar 25, 2020
 */
public class RegisterController {
	private RegisterService service;
	private ValidateForm validate;

	
	/**
	 * Constructor for class RegisterController.
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 25, 2020
	 */
	public RegisterController() {
		service = new RegisterServiceImpl();
		validate = new ValidateForm();
	}

	
	/**
	 * This method check RegisterEmplyee. 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 25, 2020
	 * @param input
	 * @return
	 */
	public boolean RegisterEmplyee(EmplyeeInput input) {
		if (validate.isValidateEmplyeeInputForm(input)) {
			return service.RegisterEmplyeeInput(input);
		}
		return false;

	}

	
	/**
	 * This method check RegisterManager. 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 25, 2020
	 * @param input
	 * @return
	 */
	public boolean RegisterManager(ManagerInput input) {
		if (validate.isValidateManagerInputExpForm(input)) {
			return service.RegisterManagerInput(input);
		}
		return false;
	}

	
	/**
	 * This method check RegisterUser. 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 25, 2020
	 * @param input
	 * @return
	 */
	public boolean RegisterUser(UserInput input) {
		if (validate.isValidateUserInputForm(input)) {
			return service.RegisterUserInput(input);
		}
		return false;
	}

}
