//

package com.vti.template.service;

import com.vti.template.form.EmplyeeInput;
import com.vti.template.form.ManagerInput;
import com.vti.template.form.UserInput;



/**
 * This class is interface RegisterService. 
 * 
 * @Description: .
 * @author: NVAnh
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: NVAnh
 * @modifer_date: Mar 25, 2020
 */
public interface RegisterService {
	
	/**
	 * This method check RegisterUserInput. 
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
	public boolean RegisterUserInput(UserInput input);
	
	/**
	 * This method check RegisterEmplyeeInput . 
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
	public boolean RegisterEmplyeeInput(EmplyeeInput input);

	/**
	 * This method check RegisterManagerInput. 
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
	public boolean RegisterManagerInput(ManagerInput input);

	
}
