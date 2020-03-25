//

package com.vti.template.repository;

import com.vti.template.form.LoginInput;
import com.vti.template.view.CandidateView;



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
public interface LoginRepository  {
	public CandidateView login(LoginInput input);
}
