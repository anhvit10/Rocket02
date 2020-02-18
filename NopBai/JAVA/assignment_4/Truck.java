package assignment_4;

public class Truck extends Car{

	int weight;
	
	Truck(int Speed, double regularPrice, String color, int weight){
		super(Speed, regularPrice, color);
		this.weight = weight;
	}
	
	int getSalePrice(){	
		if(weight > 2000){
			return(10);
		}else{
			return(20);
		}
	}
	
}
