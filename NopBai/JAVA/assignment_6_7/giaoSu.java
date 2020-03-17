package assignment_6_7;

public class giaoSu extends nhanVien{
	
	private String faculty; //nang luc
	private String academicDegree; //bang cap
	private enum AcademicDegree{
		bachelor, master, doctor;
	}
	private int monthlyTeachingTime; //so gio day hang thang	
	
	giaoSu(String fullName, String faculty, String academicDegree, int monthlyTeachingTime, int salaryMultiplier ){
		this.fullName = fullName;
		this.faculty = faculty;
		this.academicDegree = academicDegree;
		this.salaryMultiplier = salaryMultiplier;
		this.monthlyTeachingTime = monthlyTeachingTime;
		
		if ((this.academicDegree).equals(AcademicDegree.bachelor)){
			salary = this.salaryMultiplier*730 + 300 + this.monthlyTeachingTime*45;
		}else if ((this.academicDegree).equals(AcademicDegree.master)){
			salary = this.salaryMultiplier*730 + 500 + this.monthlyTeachingTime*45;
		}else{
			salary = this.salaryMultiplier*730 + 1000 + this.monthlyTeachingTime*45;
		}
	}
	
	@Override 
	public String toString(){
		return "Name : " + fullName + "\nfaculty : " + faculty +"\nacademicDegree : " + academicDegree + "\nmonthlyTeachingTime : " + monthlyTeachingTime +"\nsalaryMultiplier : " + salaryMultiplier;
	}

	
}

