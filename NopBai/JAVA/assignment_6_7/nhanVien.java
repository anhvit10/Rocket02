package assignment_6_7;

import java.util.Hashtable;
import java.util.Scanner;

public class nhanVien {
	
	Scanner sc = new Scanner(System.in);
	static Hashtable<String, nhanVien> hashtable;
	
	protected String fullName; // ten day du
	protected int salaryMultiplier; //he so luong
	protected int salary; // tien luong
	
	protected void search()
	{
		System.out.println("Nhap ten nguoi can tim : ");
		String s = sc.nextLine();
		System.out.println(hashtable.get(s));	
	}
	
}
