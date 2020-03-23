package assignment_6_7;

import java.util.Scanner;

public class nhanVien {
	
	protected String fullName; // ten day du
	protected int salaryMultiplier; //he so luong
	protected float allowance;
	protected float salary; // tien luong
	
	static Scanner sc = new Scanner(System.in);
	
	protected void input(){
		System.out.println("Ho va ten : ");
		fullName = sc.nextLine();
		
		System.out.println("He so luong : ");
		salaryMultiplier = sc.nextInt();
	}
	
	protected void print(){
		System.out.println("Ten Day Du: " + fullName);
		System.out.println("He so luong: " + salaryMultiplier);
	}
	
	

	
}
