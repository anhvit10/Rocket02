package assignment_1;

import java.util.Random;

public class bai_2 {

	public static void main(String[] args) {
String[] FirstNameArray = {"Nguyen ", "Tran ", "Pham ", "Vu ", "Ha ", "Bui ", "Ngo "};
		
		String[] MiddleNameArray = {"Viet ", "Thi ", "Duy ", "Van ", "Thu ", "Tien ", "Trung "};
				
		String[] LastNameArray = {"Anh	 ", "Trang	", "Thang	", "Thanh	", "Tra	", "Dung	", "Nhat	"};
				
		String[] Name = new String[10];
		Random rd = new Random();
			for(int i=0;i<=9;i++)
				{
					int x = rd.nextInt(7);
					int y = rd.nextInt(7);
					int z = rd.nextInt(7);
					Name[i] = FirstNameArray[x] + MiddleNameArray[y] + LastNameArray[z];
				}
			
		String[] ID = new String[10];
		int id = 1111111;
			for(int i=0;i<=9;i++)
				{
					ID[i] = "SV" + id +"     ";
					id++;
				}
		
		String[] BirthDate = new String[10];
			for(int i=0;i<=9;i++)
				{
					int x = 2 + rd.nextInt(29);
					int y = 3 + rd.nextInt(9);
					BirthDate[i] = x + "/" + y + "/" + "1991";
				}
//question 5	
		String[] RA = new String[10];
		String[] SD = new String[10];
		String[] CP = new String[10];
		String[] CUT = new String[10];
		String[] FMT = new String[10];
		float[] AVG = new float[10];
		
		for(int i=0;i<10;i++)
		{
			if(i==5)
			{
				int a = 8 + rd.nextInt(3);
				String A = String.valueOf(a);
				int b = 8 + rd.nextInt(3);
				String B = String.valueOf(b);
				int c = 8 + rd.nextInt(3);
				String C = String.valueOf(c);
				int d = 8 + rd.nextInt(3);
				String D = String.valueOf(d);
				int e = 8 + rd.nextInt(3);
				String E = String.valueOf(e);
				float avg = (float) (a+b+c+d+e)/5;
				RA[i] = A;
				SD[i] = B;
				CP[i] = C;
				CUT[i] = D;
				FMT[i] = E;
				AVG[i] = avg;
			}
			if(i==7 || i==2 || i==3)
			{
				int a = 5 + rd.nextInt(3);
				String A = String.valueOf(a);
				int b = 5 + rd.nextInt(3);
				String B = String.valueOf(b);
				int c = 5 + rd.nextInt(3);
				String C = String.valueOf(c);
				int d = 5 + rd.nextInt(3);
				String D = String.valueOf(d);
				int e = 5 + rd.nextInt(3);
				String E = String.valueOf(e);
				float avg = (float) (a+b+c+d+e)/5;
				RA[i] = A;
				SD[i] = B;
				CP[i] = C;
				CUT[i] = D;
				FMT[i] = E;
				AVG[i] = avg;
			}
			if(i==1 || i==9 || i==4)
			{
				int a = 3 + rd.nextInt(2);
				String A = String.valueOf(a);
				int b = 3 + rd.nextInt(2);
				String B = String.valueOf(b);
				int c = 3 + rd.nextInt(2);
				String C = String.valueOf(c);
				int d = 3 + rd.nextInt(2);
				String D = String.valueOf(d);
				int e = 3 + rd.nextInt(2);
				String E = String.valueOf(e);
				float avg = (float) (a+b+c+d+e)/5;
				RA[i] = A;
				SD[i] = B;
				CP[i] = C;
				CUT[i] = D;
				FMT[i] = E;
				AVG[i] = avg;
			}
			if(i==0 || i==6)
			{
				int a = 1 + rd.nextInt(2);
				String A = String.valueOf(a);
				int b = 1 + rd.nextInt(2);
				String B = String.valueOf(b);
				int c = 1 + rd.nextInt(2);
				String C = String.valueOf(c);
				int d = 1 + rd.nextInt(2);
				String D = String.valueOf(d);
				int e = 1 + rd.nextInt(2);
				String E = String.valueOf(e);
				float avg = (float) (a+b+c+d+e)/5;
				RA[i] = A;
				SD[i] = B;
				CP[i] = C;
				CUT[i] = D;
				FMT[i] = E;
				AVG[i] = avg;
			}
			if(i==8)
			{
				int a = 0;
				String A = String.valueOf(a);
				RA[i] = A;
				SD[i] = A;
				CP[i] = A;
				CUT[i] = A;
				FMT[i] = A;
				AVG[i] = 0;
			}
		}
//question 6
		System.out.println("Full Name       " + "ID            " + "Date		"+"RA	"+"SD	"+"CP	"+"CUT	"+"FMT	"+"AVG");
		System.out.println("---------------------------------------------------------------------------------------------");
			for(int i=0;i<=9;i++)
				{
					System.out.println(Name[i] + ID[i] + BirthDate[i] +"         "+ RA[i]+"	"+SD[i]+"	"+CP[i]+"	"+CUT[i]+"	"+FMT[i]+"	"+AVG[i]);
				}
	}

}
