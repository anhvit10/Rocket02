//

package com.vti.template.service;

import com.vti.template.dto.LoginDto;
import com.vti.template.form.LoginInput;



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
public interface LoginService {
	public LoginDto login(LoginInput input);
}
