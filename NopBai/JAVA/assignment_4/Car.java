package assignment_4;

public class Car {
	
	protected int Speed;
	protected double regularPrice;
	protected String color;
	
	Car(int Speed, double regularPrice, String color){
		this.Speed = Speed;
		this.regularPrice = (int) regularPrice;
		this.color = color;
	}
	
	public double getSalePrice() {
		return regularPrice;
	}
	
}
