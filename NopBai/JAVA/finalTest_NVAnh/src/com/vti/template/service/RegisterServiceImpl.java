//

package com.vti.template.service;

import com.vti.template.form.EmplyeeInput;
import com.vti.template.form.ManagerInput;
import com.vti.template.form.UserInput;
import com.vti.template.repository.RegisterRepository;
import com.vti.template.repository.RegisterRepositoryImpl;



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
public class RegisterServiceImpl implements RegisterService {
	private RegisterRepository repository;

	public RegisterServiceImpl() {
		repository = new RegisterRepositoryImpl();
	}
	/*
	 * @see
	 * com.vti.template.service.RegisterService#RegisterFresher(com.vti.template.
	 * form.RegisterInput)
	 */

	@Override
	public boolean RegisterEmplyeeInput(EmplyeeInput input) {

		// check createCandidate
		if (repository.RegisterEmplyee(input) == 1) {
			return true;
		}
		return false;
	}

	/*
	 * @see
	 * com.vti.template.service.RegisterService#RegisterExperience(com.vti.template.
	 * form.RegisterInput)
	 */

	@Override
	public boolean RegisterManagerInput(ManagerInput input) {

		// check createCandidate
		if (repository.RegisterManager(input) == 1) {
			return true;
		}
		return false;
	}

	/*
	 * @see
	 * com.vti.template.service.RegisterService#RegisterCandidate(com.vti.template.
	 * form.RegisterCandidateInput)
	 */

	@Override
	public boolean RegisterUserInput(UserInput input) {
		// check email
		if (repository.existEmail(input.getEmail())) {
			return false;
		}

		// check createUser
		if (repository.RegisterUser(input) == 1) {
			return true;
		}
		return false;
	}

}
