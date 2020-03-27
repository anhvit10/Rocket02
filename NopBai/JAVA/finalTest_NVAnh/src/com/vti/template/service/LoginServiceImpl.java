//

package com.vti.template.service;

import com.vti.template.dto.LoginDto;
import com.vti.template.form.LoginInput;
import com.vti.template.repository.LoginRepository;
import com.vti.template.repository.LoginRepositoryImpl;
import com.vti.template.view.UserView;

/**
 * This class is LoginServiceImpl. 
 * 
 * @Description: .
 * @author: NVAnh
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: NVAnh
 * @modifer_date: Mar 25, 2020
 */
public class LoginServiceImpl implements LoginService{
	private LoginRepository repository;
	/* 
	* @see com.vti.template.service.LoginService#login(com.vti.template.form.LoginInput)
	*/
	
	/**
	 * Constructor for class LoginServiceImpl.
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 25, 2020
	 */
	public LoginServiceImpl() {
		repository=new LoginRepositoryImpl();
	}
	@Override
	public LoginDto login(LoginInput input) {
		UserView userView=repository.login(input);
		//check userView not null
		if (userView==null) {
			return null;
		}
		//convert to dto
		return new LoginDto(userView);
	}

}
