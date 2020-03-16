package assignment_4;

public class Truck extends Car{

	private int weight;
	
	Truck(int Speed, double regularPrice, String color, int weight){
		super(Speed, regularPrice, color);
		this.weight = weight;
	}
	
	public double getSalePrice(){	
		if(this.weight > 2000){
			return (super.regularPrice - super.regularPrice * 0.1);
		}else{
			return (super.regularPrice - super.regularPrice * 0.2);
		}
	}
	
}
