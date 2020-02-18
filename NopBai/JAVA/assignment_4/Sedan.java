package assignment_4;

public class Sedan extends Car{
	
	int length;
	
	Sedan(int Speed, double regularPrice, String color, int length){
		super(Speed, regularPrice, color);
		this.length = length;
	}
	
	int getSalePrice(int salePrice){
		if(length > 20){
			return (int) (salePrice - (salePrice * 0.05));
		}else{
			return (int) (salePrice - (salePrice * 0.1) );
		}
	}
	
}
