package assignment_6_7;

import java.util.Hashtable;

public class empManagement extends nhanVien {
	
	public static void main(String[] args) {
		
		hashtable = new Hashtable<String, nhanVien>();

		hashtable.put("Doan Van Hau", new canBo("Doan Van Hau", "marketing", "departmentHead", 365, 7));
		hashtable.put("Que Ngoc Hai", new canBo("Que Ngoc Hai", "entertainment", "viceHead", 100, 4));
		hashtable.put("Dang Van Lam", new canBo("Dang Van Lam", "advertisement", "staff", 770, 10));
		hashtable.put("Nguyen Quang Hai", new giaoSu("Nguyen Quang Hai", "tot", "bachelor", 240, 9));
		hashtable.put("Do Duy Manh", new giaoSu("Do Duy Manh", "tot", "master", 200, 6));
		hashtable.put("Bui Tien Dung", new giaoSu("Bui Tien Dung", "tot", "doctor", 225, 7));
		
		nhanVien st1 = new nhanVien();
       st1.search();
	}
	
	
}