package assignment_5_bai_2;

class NormalEmployee extends BonusEmployee {
	
	NormalEmployee(){
		bonusSalary = 1000000;
	}
	
	public int getMonthlySalary() {
		 return basicSalary + bonusSalary;
	}
	
	public static void main(String[] args) {
		NormalEmployee NV1 = new NormalEmployee();
		NV1.setName("Nguyen Viet Anh");
		System.out.println("Ten :" + NV1.getName());
		
		NV1.setAddress("Ha Noi");
		System.out.println("Dia Chi :" + NV1.getAddress());
		
		NV1.setBasicSalary(8000000);
		System.out.println("Luong co ban :" + NV1.getBasicSalary());
			
		System.out.println("Luong thuong :" + NV1.bonusSalary);
		
		NV1.getMonthlySalary();
		System.out.println("Luong hang thang :" + NV1.getMonthlySalary());
	}
	
}
