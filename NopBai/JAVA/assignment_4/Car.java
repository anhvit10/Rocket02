package assignment_4;

public class Car {
	
	int Speed;
	double regularPrice;
	String color;
	
	Car(int Speed, double regularPrice, String color){
		this.Speed = Speed;
		this.regularPrice = (int) regularPrice;
		this.color = color;
	}
	
	double getSalePrice() {
		return regularPrice;
	}
	
}
