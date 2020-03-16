package assignment_4;

public class Ford extends Car{
	
	@SuppressWarnings("unused")
	private int year;
	private int manufacturerDiscount;
	
	Ford(int Speed, double regularPrice, String color, int year, int manufacturerDiscount){
		super(Speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}
	
	public double getSalePrice(){
			return (this.regularPrice - this.manufacturerDiscount);
		}
	
}
