package assignment_4;

import java.util.ArrayList;
import java.util.List;

public class MyOwnAutoShop {
	
	public static void main(String[] args) {
		
		List<String> myOwnAutoShop = new ArrayList<String>();
		
		Sedan VinFastLuxA = new Sedan(300, 112900, "Black", 4973);		
		Ford RangerRaptor = new Ford(250, 123000, "Blue", 2019, 4000);
		Ford FordEverest = new Ford(300, 139900, "Black", 2019, 3000);
		Car TeslaModel3 = new Car(100, 120000, "Black");
		
		myOwnAutoShop.add("VinFastLuxA");
		myOwnAutoShop.add("RangerRaptor");
		myOwnAutoShop.add("FordEverest");
		myOwnAutoShop.add("TeslaModel3");
		
		System.out.println(myOwnAutoShop.get(0) +" "+ VinFastLuxA.getSalePrice());
		System.out.println(myOwnAutoShop.get(1) +" "+ RangerRaptor.getSalePrice());
		System.out.println(myOwnAutoShop.get(2) +" "+ FordEverest.getSalePrice());
		System.out.println(myOwnAutoShop.get(3) +" "+ TeslaModel3.getSalePrice());
		
	}
	
}





