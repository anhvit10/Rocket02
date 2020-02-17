package assignment_4;

public class Ford extends Car{
	
	int year;
	int manufacturerDiscount;
	
	Ford(int Speed, double regularPrice, String color, int year, int manufacturerDiscount){
		super(Speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}
	
	double getSalePrice(double salePrice){
			double FordSale = salePrice - manufacturerDiscount;
			return(FordSale);
		}
	
}
