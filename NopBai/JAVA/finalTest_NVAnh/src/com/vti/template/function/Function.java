//

package com.vti.template.function;

import java.util.Scanner;

import com.vti.template.controller.LoginController;
import com.vti.template.controller.RegisterController;
import com.vti.template.dto.LoginDto;
import com.vti.template.form.EmplyeeInput;
import com.vti.template.form.LoginInput;
import com.vti.template.form.ManagerInput;
import com.vti.template.form.UserInput;
import com.vti.template.utils.Constant;
import com.vti.template.utils.ScannerUtil;



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
public class Function {
	
	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 25, 2020
	 * @param controller
	 */
	public void Login(LoginController controller) {
		Scanner scanner = new Scanner(System.in);
		LoginInput input = null;
		String email, password;

		System.out.println(" Login Program");
		// input Email
		System.out.println("Nhap Email: ");
		email = ScannerUtil.readString(scanner, Constant.ERROR_VALIDATE_STRING);

		// input Password
		System.out.println("Nhap Password: ");
		password = ScannerUtil.readString(scanner, Constant.ERROR_VALIDATE_STRING);

		// design pattern Builder
		input = new LoginInput().setEmail(email).setPassword(password);

		LoginDto dto = controller.Login(input);
		if (dto != null) {
			System.out.println("Login Success!!!");
			System.out.println("Chao mung " + dto.getFullName());

		} else {
			System.out.println("Login Fail!!!");
		}

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
	 * @param controller
	 */
	public void register(RegisterController controller) {
		Scanner scanner = new Scanner(System.in);
		UserInput input = null;
		EmplyeeInput input2 = null;
		ManagerInput input3 = null;
		String email, password, phone, firstName, lastName;
		String projectName = "";
		int exp = 0;
		int kind, kind1;

		System.out.println(" Register Program");
		// input Email
		System.out.println("Nhap Email: ");
		email = ScannerUtil.readString(scanner, Constant.ERROR_VALIDATE_STRING);

		// input Password
		System.out.println("Nhap Password: ");
		password = ScannerUtil.readString(scanner, Constant.ERROR_VALIDATE_STRING);
		// input Password
		System.out.println("Nhap Phone: ");
		phone = ScannerUtil.readString(scanner, Constant.ERROR_VALIDATE_STRING);

		// input firsname
		System.out.println("Nhap firsName: ");
		firstName = ScannerUtil.readString(scanner, Constant.ERROR_VALIDATE_STRING);
		// input lastName
		System.out.println("Nhap lastName: ");
		lastName = ScannerUtil.readString(scanner, Constant.ERROR_VALIDATE_STRING);
		
		System.out.println(" Register Employee or Manager?");
		System.out.println("1.Employee");
		System.out.println("2.Manager");
		kind = ScannerUtil.readInt(scanner, Constant.ERROR_VALIDATE_INT);
		switch (kind) {
		case 1: {
			// input Password
			System.out.println("Nhap projectName: ");
			System.out.println("1.Testing System");
			System.out.println("2.CRM");
			System.out.println("3.TimeSheet");
			kind1 = ScannerUtil.readInt(scanner, Constant.ERROR_VALIDATE_INT);
			switch (kind1) {
			case 1: {
				projectName = "Testing System";
				break;
			}
			case 2: {
				projectName = "CRM";
				break;
			}
			case 3: {
				projectName = "TimeSheet";
				break;
			}
			default:
				break;
			}
			// design pattern Builder
			input = new UserInput()
					.setEmail(email)
					.setPassword(password)
					.setPhone(phone)
					.setFirstName(firstName)
					.setLastName(lastName);

			input2 = new EmplyeeInput()
					.setProjectName(projectName);
			if (controller.RegisterEmplyee(input2) && controller.RegisterUser(input)) {
				System.out.println("Register Success");
			} else {
				System.out.println("Register fail");
			}

			break;
		}
		case 2: {
			// input ExpInYear
			System.out.println("Nhap ExpInYear: ");
			exp = ScannerUtil.readInt(scanner, Constant.ERROR_VALIDATE_INT);

			// design pattern Builder
			input = new UserInput()
					.setEmail(email)
					.setPassword(password)
					.setPhone(phone)
					.setFirstName(firstName)
					.setLastName(lastName);
			input3=new ManagerInput()
					.setExpInYear(exp);
			if (controller.RegisterManager(input3)&&controller.RegisterUser(input)) {
				System.out.println("Register Success");
			} else {
				System.out.println("Register fail");
			}
			break;
		}

		default:
			break;
		}

	}
}
