package assignment_6_7;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class searchAndSort {

	Scanner sc = new Scanner(System.in);

	public  void search(List<canBo> list){
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
	
	public void sort(List<giaoSu> giaoSus) {
		Collections.sort(giaoSus);
		System.out.println("*****************************");
		System.out.println("Day sau khi da sap xep la: ");
		for (int i = 0; i < giaoSus.size(); i++) {
			giaoSus.get(i).print();
		}
	}

	
	
	
}
