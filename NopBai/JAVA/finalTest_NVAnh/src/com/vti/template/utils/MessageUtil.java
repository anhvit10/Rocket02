package com.vti.template.utils;


/**
 * This class is MessageUtil 
 * 
 * @Description: .
 * @author: NVAnh
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: NVAnh
 * @modifer_date: Mar 25, 2020
 */
public class MessageUtil {

	// validate form
	// email
	public static final String VALIDATE_EMAIL_EMPTY = "Email must not be empty";
	public static final String VALIDATE_EMAIL_MAX_AND_MIN_LENGTH = "Email must has 6 to 30 characters";
	public static final String VALIDATE_EMAIL_RULE = "Email must has 6 to 30 characters and include @, lower, upper characters, ...";

	// password
	public static final String VALIDATE_PASSWORD_EMPTY = "Password must not be empty";
	public static final String VALIDATE_PASSWORD_MAX_AND_MIN_LENGTH = "Email must has 6 to 30 characters";
	public static final String VALIDATE_PASSWORD_RULE = "Password must has 6 to 12 characters and include 1 upper characters, ...";
	// phone
	public static final String VALIDATE_PHONE_EMPTY = "Phone number must not be empty";
	public static final String VALIDATE_PHONE_MAX_AND_MIN_LENGTH = "Phone number must has 9 to 12 numbers";
	public static final String VALIDATE_PHONE_RULE = "Phone number must has 9 to 12 numbers and include 0-9";

	// expInYear

	public static final String VALIDATE_EXP_NUMBER = "Exp number has integer number";

	// graduationRank
	public static final String VALIDATE_PROJECT_EMPTY = "projectName  must not be empty";
	// ProSkill
	public static final String VALIDATE_PROSKILL_EMPTY = "ProSkill  must not be empty";
	// ID
}
