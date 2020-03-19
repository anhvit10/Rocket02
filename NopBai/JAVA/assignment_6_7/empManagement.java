package assignment_6_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class empManagement extends nhanVien {
	
	public static void main(String[] args) {
		
		List<giaoSu> GiaoSu = new ArrayList<giaoSu>();
		GiaoSu.add(new giaoSu("Doan Van Hau", "A+", "bachelor", 365, 7));
		GiaoSu.add(new giaoSu("Dang Van Lam", "A", "master", 365, 7));
		GiaoSu.add(new giaoSu("Do Duy Manh", "B", "bachelor", 365, 7));
		GiaoSu.add(new giaoSu("Que Ngoc Hai", "A+", "master", 365, 7));
		GiaoSu.add(new giaoSu("Tran Dinh Trong", "A+", "bachelor", 365, 7));
		GiaoSu.add(new giaoSu("Bui Tien Dung", "A+", "doctor", 365, 7));
	    GiaoSu.add(new giaoSu("Vu Van Thanh", "B", "bachelor", 365, 7));
	    GiaoSu.add(new giaoSu("Phan Van Duc", "B", "doctor", 365, 7));
		
		List<canBo> CanBo = new ArrayList<canBo>();
		CanBo.add(new canBo("Doan Van Hau", "marketing", "departmentHead", 365, 7));
		CanBo.add(new canBo("Dang Van Lam", "marketing", "departmentHead", 365, 7));
	    CanBo.add(new canBo("Do Duy Manh", "marketing", "departmentHead", 365, 7));
	    CanBo.add(new canBo("Que Ngoc Hai", "marketing", "departmentHead", 365, 7));
	    CanBo.add(new canBo("Tran Dinh Trong", "entertainment", "departmentHead", 365, 7));
	    CanBo.add(new canBo("Bui Tien Dung", "marketing", "departmentHead", 365, 7));
	    CanBo.add(new canBo("Tran Dinh Trong", "marketing", "departmentHead", 365, 7));
	    CanBo.add(new canBo("Nguyen Cong Phuong", "marketing", "departmentHead", 365, 7));
	    
	    empManagement t = new empManagement();
	    t.find(CanBo);
	    
	    System.out.println("\t\tDanh sach Giao Su ");
	    System.out.println("    Name      Faculty      AD   MTTime  SM  salary");
        Collections.sort(GiaoSu, new Comparator<giaoSu>() {
            @Override
            public int compare(giaoSu o1, giaoSu o2) {
                return o1.fullName.compareTo(o2.fullName);
            }
        });
        for (giaoSu student : GiaoSu) {
            System.out.println(student.toString());
        }
	}
	
	
}