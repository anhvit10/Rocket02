//

package com.vti.template.repository;

import com.vti.template.form.EmplyeeInput;
import com.vti.template.form.ManagerInput;
import com.vti.template.form.UserInput;



/**
 * This class is interface RegisterRepository. 
 * 
 * @Description: .
 * @author: NVAnh
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: NVAnh
 * @modifer_date: Mar 25, 2020
 */
public interface RegisterRepository {

	
	/**
	 * This method is RegisterEmplyee. 
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
	public int RegisterEmplyee(EmplyeeInput input);

	
	/**
	 * This method is RegisterManager. 
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
	public int RegisterManager(ManagerInput input);

	
	/**
	 * This method is RegisterUser. 
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
	public int RegisterUser(UserInput input);

	/**
	 * This method check email exist . 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 25, 2020
	 * @param email
	 * @return
	 */
	public boolean existEmail(String email);
}
