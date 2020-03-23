package assignment_6_7;

public class canBo extends nhanVien {
	
	public String department; //phong ban
	private int workingTime; // so ngay lam viec
	private Position position; // chuc vu
	enum Position {
		departmentHead, viceHead, staff;
	}
	
	public void input(){
		super.input();
		System.out.println("Phong ban: ");
		department = sc.nextLine();
		department = sc.nextLine();
		
		System.out.println("Thoi gian lam viec: ");
		workingTime = sc.nextInt();

		System.out.println("Chuc Vu : 1--departmentHead  2--viceHead  3--staff ");
		switch (sc.nextInt()) {
		case 1:
			position = Position.departmentHead;
			break;
		case 2:
			position = Position.viceHead;
			break;
		case 3:
			position = Position.staff;
			break;
		}	
	}
	
	public void setAllowance() {
		if (position == Position.departmentHead) {
			allowance = 2000;
		} else if (position == Position.viceHead) {
			allowance = 1000;
		} else {
			allowance = 500;
		}

	}
	
	public void setSalary() {
		salary = salaryMultiplier * 730 + allowance + workingTime * 30;
	}
	
	public void print() {
		super.print();
		setSalary();
		setAllowance();
		System.out.println("Phong ban: " + department);
		System.out.println("Chuc Vu: " + position);
		System.out.println("Thoi gian lam viec: " + workingTime);
		System.out.println("Tien phu cap: " + allowance);
		System.out.println("Tien Luong : " + salary);
	}

	public String getDepartment() {
		return department;
	}
	
	@Override
	public String toString(){
		return "Ho va ten : " + fullName + "\nPhong ban : " + department +"\nChuc vu : " + position + "\nThoi gian lam viec : " + workingTime + "\nHe so luong : " + salaryMultiplier + "\nTien phu cap : " + allowance + "\nTien luong : " + salary;
	}
	
}






