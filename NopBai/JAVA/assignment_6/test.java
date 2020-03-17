package assignment_6;

import java.util.Hashtable;

public class test {
	
	public static void main(String[] args) {
		
		nhanVien nv1 = new canBo("Doan Van Hau", "marketing", "departmentHead", 365, 7);
		nhanVien nv2 = new canBo("Que Ngoc Hai", "entertainment", "viceHead", 100, 4);	
		nhanVien nv3 = new canBo("Dang Van Lam", "advertisement", "staff", 770, 10);
		nhanVien nv4 = new giaoSu("Nguyen Quang Hai", "tot", "bachelor", 240, 9);
		nhanVien nv5 = new giaoSu("Do Duy Manh", "tot", "master", 200, 6);
		nhanVien nv6 = new giaoSu("Bui Tien Dung", "tot", "doctor", 225, 7);

			
        Hashtable<String, nhanVien> hashtable = new Hashtable<String, nhanVien>();
        hashtable.put(nv1.fullName, nv1);
        hashtable.put(nv2.fullName, nv2);
        hashtable.put(nv3.fullName, nv3);
        hashtable.put(nv4.fullName, nv4);
        hashtable.put(nv5.fullName, nv5);
        hashtable.put(nv6.fullName, nv6);

	}
	
	
}