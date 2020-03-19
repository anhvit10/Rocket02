package assignment_6_7;

public class canBo extends nhanVien {
	
	public String department; //phong ban
	private int workingTime; // so ngay lam viec
	private String position; // chuc vu
	private enum Position {
		departmentHead, viceHead, staff; //truong phong, pho tp, nhan vien
	}
	
	protected canBo(String fullName, String department, String position, int workingTime, int salaryMultiplier){
		this.fullName = fullName;
		this.department = department;
		this.position = position;
		this.workingTime = workingTime;
		this.salaryMultiplier = salaryMultiplier;
		
		if ((this.position).equals(Position.departmentHead)){
			salary = this.salaryMultiplier*730 + 2000 + this.workingTime*30;
		}else if ((this.position).equals(Position.viceHead)){
			salary = this.salaryMultiplier*730 + 1000 + this.workingTime*30;
		}else{
			salary = this.salaryMultiplier*730 + 500 + this.workingTime*30;
		}
	}
	
	@Override
	public String toString(){
		return "Name : " + fullName + "\ndepartment : " + department +"\nposition : " + position + "\nworkingTime : " + workingTime + "\nsalaryMultiplier : " + salaryMultiplier + "\nsalary : " + salary;
	}

}






