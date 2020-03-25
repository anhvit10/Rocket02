package com.vti.template.program;

import java.util.Scanner;

import com.vti.template.controller.LoginController;
import com.vti.template.controller.RegisterController;
import com.vti.template.function.Function;
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
public class Program {
	public static void main(String[] args) {
		Function function = new Function();
		LoginController controller = new LoginController();
		RegisterController controller2 = new RegisterController();
		int kind;
		
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("Manager Candidate");
			System.out.println("1. Login");
			System.out.println("2. Register");
			kind=ScannerUtil.readInt(scanner, Constant.ERROR_VALIDATE_INT);
			switch (kind) {
			case 1:
			{
				function.Login(controller);
				break;
			}
			case 2:{
				
				function.register(controller2);
				break;
			}
			default:
				break;
			}
			
		}
		
		
		

	}
}
