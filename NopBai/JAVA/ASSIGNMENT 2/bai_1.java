package assignment_1;

import java.util.Random;

public class bai_1 {

	public static void main(String[] args) {
		
		String[] FirstNameArray = {"Nguyen ", "Tran ", "Pham ", "Vu ", "Ha ", "Bui ", "Ngo "};
		
		String[] MiddleNameArray = {"Viet ", "Thi ", "Duy ", "Van ", "Thu ", "Tien ", "Trung "};
				
		String[] LastNameArray = {"Anh	 ", "Trang	", "Thang	", "Thanh	", "Tra	", "Dung	", "Nhat	"};
		
// question 1		
		String[] Name = new String[10];
		Random rd = new Random();
			for(int i=0;i<=9;i++)
				{
					int x = rd.nextInt(7);
					int y = rd.nextInt(7);
					int z = rd.nextInt(7);
					Name[i] = FirstNameArray[x] + MiddleNameArray[y] + LastNameArray[z];
				}
			
//question 2	
		String[] ID = new String[10];
		int id = 1111111;
			for(int i=0;i<=9;i++)
				{
					ID[i] = "SV" + id +"     ";
					id++;
				}
		
// question 3
		String[] BirthDate = new String[10];
			for(int i=0;i<=9;i++)
				{
					int x = 2 + rd.nextInt(29);
					int y = 3 + rd.nextInt(9);
					BirthDate[i] = x + "/" + y + "/" + "1991";
				}
			
// question 4 
		System.out.println("Full Name       " + "ID            " + "Date");
		System.out.println("-------------------------------------------");
			for(int i=0;i<=9;i++)
				{
					System.out.println(Name[i] + ID[i] + BirthDate[i]);
				}			
	}
}
