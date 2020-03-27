package com.vti.template.utils.validate;

import com.vti.template.form.EmplyeeInput;
import com.vti.template.form.LoginInput;
import com.vti.template.form.ManagerInput;
import com.vti.template.form.UserInput;


/**
 * This class is ValidateForm. 
 * 
 * @Description: .
 * @author: NVAnh
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: NVAnh
 * @modifer_date: Mar 25, 2020
 */
public class ValidateForm {

	/**
	 * This method check ValidateLoginInputForm. 
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
	public boolean isValidateLoginInputForm(LoginInput input) {

		if (null == input) {
			return false;
		}

		if (!Validate.isEmail(input.getEmail())) {
			return false;
		}

		if (!Validate.isPassword(input.getPassword())) {
			return false;
		}

		return true;
	}

	
	/**
	 * This method check ValidateUserInputForm. 
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
	public boolean isValidateUserInputForm(UserInput input) {
		if (null == input) {
			return false;
		}

		if (!Validate.isEmail(input.getEmail())) {
			return false;
		}

		if (!Validate.isPassword(input.getPassword())) {
			return false;
		}
		if (!Validate.isPhone(input.getPhone())) {
			return false;
		}

		return true;
	}

	
	/**
	 * This method check ValidateEmplyeeInputForm . 
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
	public boolean isValidateEmplyeeInputForm(EmplyeeInput input) {
		if (null == input) {
			return false;
		}
		if (!Validate.isProjectName(input.getProjectName())) {
			return false;

		}
		return true;
	}

	/**
	 * This method check ValidateManagerInputExpForm . 
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
	public boolean isValidateManagerInputExpForm(ManagerInput input) {
		if (null == input) {
			return false;
		}
		if (!Validate.isExpInYear(input.getExpInYear())) {
			return false;
		}

		return true;
	}

}
