//
package com.vti.template.utils;

import java.util.regex.Pattern;


/**
 * This class is MethodUtil. 
 * 
 * @Description: .
 * @author: NVAnh
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: NVAnh
 * @modifer_date: Mar 25, 2020
 */
public class MethodUtil {

	
	/**
	 * This method check null . 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 25, 2020
	 * @param object
	 * @return
	 */
	public static boolean isNull(Object object) {
		return object == null || "".equals(object);
	}

	
	/**
	 * This method check checkRegularExpression. 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 25, 2020
	 * @param input
	 * @param regular
	 * @return
	 */
	public static boolean checkRegularExpression(String input, String regular) {
		// validate input
		if (isNull(input)) {
			return false;
		}
		// validate success
		return Pattern.compile(regular).matcher(input).matches();
	}
}
