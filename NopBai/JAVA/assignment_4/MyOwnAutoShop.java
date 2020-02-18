package assignment_4;

public class MyOwnAutoShop {
	
	public static void main(String[] args) {
		
		Sedan vinFastLuxA = new Sedan(300, 1129000000, "Black", 4973);
		System.out.println("vinFastLuxA discount " + vinFastLuxA.getSalePrice(1129000000));
		
		Ford RangerRaptor = new Ford(250, 1230000000, "Blue", 2019, 40000000);
		System.out.println("Ranger Raptor discounts " + RangerRaptor.getSalePrice(1230000000));
		
		Ford Everest = new Ford(300, 1399000000, "Black", 2019, 300000000);
		System.out.println("Everest discounts " + Everest.getSalePrice(1399000000));
		
		Car TeslaModel3 = new Car(100, 1200000000, "Black");
		System.out.println("TeslaModel3 discount " + TeslaModel3.getSalePrice(1200000000));
		
	}
	
}





