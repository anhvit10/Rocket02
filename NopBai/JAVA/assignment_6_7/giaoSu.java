package assignment_6_7;

import java.util.regex.Pattern;

public class giaoSu extends nhanVien implements Comparable<Object>{
	
	String faculty; //nang luc
	AcademicDegree academicDegree; //bang cap
	int monthlyTeachingTime; //so gio day hang thang
	
	class AcademicDegree {
		String academicDegree;
		String bachelor;
		String master;
		String doctor;

		@Override
		public String toString() {
			String result = "";
			if (bachelor != null && !bachelor.isEmpty()) {
				result += "bachelor";
			}
			if (master != null && !master.isEmpty()) {
				result += "master";
			}
			if (doctor != null && !doctor.isEmpty()) {
				result += "doctor";
			}
			return result;
		}
	
	}

	@Override
	protected void input(){
		super.input();
		System.out.println("Nang Luc: ");
		faculty = sc.nextLine();
		faculty = sc.nextLine();
		
		academicDegree = new AcademicDegree();

		System.out.println("Bang cap: ");
		academicDegree.academicDegree = sc.nextLine();

		System.out.println("Thoi gian day hang thang: ");
		monthlyTeachingTime = sc.nextInt();
	}
	
	public void setAllowance() {

		if (academicDegree.doctor != null) {
			allowance = 1000;

		} else if (academicDegree.master != null) {
			allowance = 500;

		} else {
			allowance = 300;
		}
	}
	
	public void setSalary() {
		salary = salaryMultiplier*730 + allowance + monthlyTeachingTime*45;
	}
	
	public void print() {
		super.print();
		setAllowance();
		setSalary();
		System.out.println("Nang Luc: " + faculty);
		System.out.println("Bang Cap: " + academicDegree.academicDegree);
		System.out.println("Thoi gian day hang thang: " + monthlyTeachingTime);
		System.out.println("Tien phu cap : " + allowance);
		System.out.println("Tien Luong: " + salary);
	}
	
	@Override
	public int compareTo(Object obj) {
		giaoSu giaoSu = (giaoSu) obj;

		String professionalName1 = reverseWords(fullName);
		String professionalName2 = reverseWords(giaoSu.fullName);

		return professionalName2.compareToIgnoreCase(professionalName1) * (-1);
	}

	String reverseWords(String str) {

		// chi dinh ki tu khoang trang don de tach chuoi
		Pattern pattern = Pattern.compile("\\s");

		// tach chuoi va luu vao mang
		String[] temp = pattern.split(str);
		String result = "";

		// luu mang theo thu nguoc lai
		for (int i = 0; i < temp.length; i++) {
			if (i == temp.length - 1)
				result = temp[i] + result;
			else
				result = " " + temp[i] + result;
		}
		// mang theo thu tu nguoc lai
		return result;
	}
}

