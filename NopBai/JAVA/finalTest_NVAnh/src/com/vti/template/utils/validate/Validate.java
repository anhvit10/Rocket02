package com.vti.template.utils.validate;

import com.mysql.jdbc.StringUtils;
import com.vti.template.utils.Constant;
import com.vti.template.utils.MessageUtil;
import com.vti.template.utils.MethodUtil;


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
public class Validate {

	
	/**
	 * This method is . 
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
	public static boolean isEmail(final String input) {
		// empty
		if (StringUtils.isNullOrEmpty(input)) {
			showError(MessageUtil.VALIDATE_EMAIL_EMPTY);
			return false;
		}

		// max length, min length
		if (!isSatisfyMaxLength(input, 30) || !isSatisfyMinLength(input, 6)) {
			showError(MessageUtil.VALIDATE_EMAIL_MAX_AND_MIN_LENGTH);
			return false;
		}

		// regular expression
		boolean result = MethodUtil.checkRegularExpression(input, Constant.PATTERN_EMAIL);
		if (!result) {
			showError(MessageUtil.VALIDATE_EMAIL_RULE);
		}
		return result;
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
	 * @param input
	 * @return
	 */
	public static boolean isPassword(final String input) {
		// empty
		if (StringUtils.isNullOrEmpty(input)) {
			showError(MessageUtil.VALIDATE_PASSWORD_EMPTY);
			return false;
		}

		// regular expression
		boolean result = MethodUtil.checkRegularExpression(input, Constant.PATTERN_PASSWORD);
		if (!result) {
			showError(MessageUtil.VALIDATE_PASSWORD_RULE);
		}
		return result;
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
	 * @param input
	 * @return
	 */
	public static boolean isPhone(final String input) {
		// empty
		if (StringUtils.isNullOrEmpty(input)) {
			showError(MessageUtil.VALIDATE_PHONE_EMPTY);
			return false;
		}

		// max length, min length
		if (!isSatisfyMaxLength(input, 12) || !isSatisfyMinLength(input, 9)) {
			showError(MessageUtil.VALIDATE_PHONE_MAX_AND_MIN_LENGTH);
			return false;
		}

		// regular expression
		boolean result = MethodUtil.checkRegularExpression(input, Constant.PATTERN_PHONE);
		if (!result) {
			showError(MessageUtil.VALIDATE_PHONE_RULE);
		}
		return result;

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
	 * @param input
	 * @return
	 */
	public static boolean isProjectName(final String input) {
		// empty
		if (StringUtils.isNullOrEmpty(input)) {
			showError(MessageUtil.VALIDATE_PROJECT_EMPTY);
			return false;
		}

		return true;
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
	 * @param input
	 * @return
	 */
	public static boolean isProSkill(final String input) {
		// empty
		if (StringUtils.isNullOrEmpty(input)) {
			showError(MessageUtil.VALIDATE_PROSKILL_EMPTY);
			return false;
		}

		return true;
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
	 * @param input
	 * @return
	 */
	public static boolean isExpInYear(final int input) {

		// input interger number
		if (input < 0 || input > 10) {
			showError(MessageUtil.VALIDATE_EXP_NUMBER);
			return false;
		}
		return true;
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
	 * @param input
	 * @param maxLength
	 * @return
	 */
	public static boolean isSatisfyMaxLength(String input, int maxLength) {
		if (!StringUtils.isNullOrEmpty(input) && input.length() <= maxLength) {
			return true;
		}
		return false;
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
	 * @param input
	 * @param minLength
	 * @return
	 */
	public static boolean isSatisfyMinLength(String input, int minLength) {
		if (!StringUtils.isNullOrEmpty(input) && input.length() >= minLength) {
			return true;
		}
		return false;
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
	 * @param message
	 */
	public static void showError(String message) {
		System.out.println("Error: " + message);
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
	 * @param message
	 */
	public static void showSuccess(String message) {
		System.out.println("Success: " + message);
	}

}
