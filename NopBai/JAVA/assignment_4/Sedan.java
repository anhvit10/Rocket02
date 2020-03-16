package assignment_4;

public class Sedan extends Car{
	
	private int length;
	
	Sedan(int Speed, double regularPrice, String color, int length){
		super(Speed, regularPrice, color);
		this.length = length;
	}
	
	public double getSalePrice(){
		if(this.length > 20){
			return (super.regularPrice - super.regularPrice * 0.05);
		}else{
			return (super.regularPrice - super.regularPrice * 0.1);
		}
	}
	
}
