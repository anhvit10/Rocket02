package assignment_4;

public class MyOwnAutoShop {
	
	public static void main(String[] args) {
		
		Sedan s = new Sedan(200, 1000000000, "Black", 30);
		System.out.println("sedans discount " + s.getSalePrice() + "%");
		
		Ford f1 = new Ford(250, 2000000000, "Red", 2018, 30);
		System.out.println("ford 1 discounts " + f1.getSalePrice(50) + "%");
		
		Ford f2 = new Ford(300, 2100000000, "White", 2019, 40);
		System.out.println("ford 2 discounts " + f2.getSalePrice(50) + "%");
		
		Car c = new Car(300, 2000000000, "Brown");
		c.Speed = 300;
		c.regularPrice = 2000000000;
		System.out.println("cars discount " + c.getSalePrice(50) + "%");
		
	}
	
}





