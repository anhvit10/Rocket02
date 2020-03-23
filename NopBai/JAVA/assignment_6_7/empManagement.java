package assignment_6_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class empManagement {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//nhap giao su
		List<giaoSu> giaoSus = new ArrayList<>();

		System.out.print("Ban muon nhap bao nhieu giao su: ");
		int soLuongGiaoSu = sc.nextInt();
		for (int i = 0; i < soLuongGiaoSu; i++) {
			System.out.println("Nhap thong tin giao su thu " + (i + 1) + " :");
			giaoSu giaosu = new giaoSu();
			giaosu.input();
			giaoSus.add(giaosu);
		}

		for (int i = 0; i < giaoSus.size(); i++) {
			System.out.println("Thong tin giao su thu " + (i + 1) + " la:");
			giaoSus.get(i).print();
		}
		
		// nhap can bo:
		List<canBo> canBos = new ArrayList<>();
		System.out.println("Ban muon nhap bao nhieu can bo: ");
		int soLuongCanBo = sc.nextInt();

		for (int i = 0; i < soLuongCanBo; i++) {
			System.out.println("Nhap Thong Tin Can Bo thu " + (i + 1) + " :");
			canBo canbo = new canBo();
			canbo.input();
			canBos.add(canbo);
		}
		
		for (int i = 0; i < canBos.size(); i++) {
			System.out.println("Thong tin can bo thu " + (i + 1) + ": ");
			canBos.get(i).print();
		}
		
		// bai 7 : tim kiem can bo va sap xep giao su 	
		searchAndSort searchPeople = new searchAndSort();
		searchPeople.search(canBos);	
		
		searchAndSort sort = new searchAndSort();
		sort.sort(giaoSus);		
	}
}