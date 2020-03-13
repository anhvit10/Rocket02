package assignment_4;

public class MyOwnAutoShop {
	
	public static void main(String[] args) {
		
		Sedan vinFastLuxA = new Sedan(300, 112900, "Black", 4973);
		System.out.println("vinFastLuxA discount " + vinFastLuxA.getSalePrice());
		
		Ford RangerRaptor = new Ford(250, 123000, "Blue", 2019, 4000);
		System.out.println("Ranger Raptor discounts " + RangerRaptor.getSalePrice());
		
		Ford Everest = new Ford(300, 139900, "Black", 2019, 3000);
		System.out.println("Everest discounts " + Everest.getSalePrice());
		
		Car TeslaModel3 = new Car(100, 120000, "Black");
		System.out.println("TeslaModel3 discount " + TeslaModel3.getSalePrice());
		
	}
	
}





