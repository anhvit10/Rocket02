package assignment_4;

public class Sedan extends Car{
	
	int length;
	
	Sedan(int Speed, double regularPrice, String color, int length){
		super(Speed, regularPrice, color);
		this.length = length;
	}
	
	double getSalePrice(){
		if(length > 20){
			return (super.regularPrice - (super.regularPrice * 0.05));
		}else{
			return (super.regularPrice - (super.regularPrice * 0.1) );
		}
	}
	
}
