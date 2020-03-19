package assignment_6_7;

import java.util.List;
import java.util.Scanner;

public class nhanVien {
	
	Scanner sc = new Scanner(System.in);
	
	protected String fullName; // ten day du
	protected int salaryMultiplier; //he so luong
	protected int salary; // tien luong
	
	public String getFullName() {
		return fullName;
	}
	
	protected void find(List<canBo> list){
		System.out.println("Nhap ten nguoi can tim : ");
		String fullName = sc.nextLine();
		System.out.println("Nhap ten phong ban : ");
		String department = sc.nextLine();
		
		for(int i=0;i<list.size();i++){
			if((list.get(i).fullName).equals(fullName) && (list.get(i).department).equals(department)){
				System.out.println(list.get(i));
			}else{
				continue;
			}	
		}
	}
	
	protected void print(List<giaoSu> list){
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

}
