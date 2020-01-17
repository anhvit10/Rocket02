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
			if(i==0)
			{
				int b = 5 + rd.nextInt(3);
				String B = String.valueOf(b);
				int c = 3 + rd.nextInt(2);
				String C = String.valueOf(c);
				int d = 1 + rd.nextInt(2);
				String D = String.valueOf(d);
				int e = 0;
				String E = String.valueOf(e);
				float avg = (float) (c+b+c+d+e)/5;
				RA[i] = C;
				SD[i] = B;
				CP[i] = C;
				CUT[i] = D;
				FMT[i] = E;
				AVG[i] = avg;
			}
			if(i==1)
			{
				int b = 5 + rd.nextInt(3);
				String B = String.valueOf(b);
				int c = 3 + rd.nextInt(2);
				String C = String.valueOf(c);
				int d = 1 + rd.nextInt(2);
				String D = String.valueOf(d);
				int e = 0;
				String E = String.valueOf(e);
				float avg = (float) (b+b+d+e+c)/5;
				RA[i] = B;
				SD[i] = B;
				CP[i] = D;
				CUT[i] = E;
				FMT[i] = C;
				AVG[i] = avg;
			}
			if(i==2)
			{
				int a = 8 + rd.nextInt(3);
				String A = String.valueOf(a);
				int b = 5 + rd.nextInt(3);
				String B = String.valueOf(b);
				int c = 3 + rd.nextInt(2);
				String C = String.valueOf(c);
				int d = 1 + rd.nextInt(2);
				String D = String.valueOf(d);
				int e = 0;
				String E = String.valueOf(e);
				float avg = (float) (c+d+e+a+b)/5;
				RA[i] = C;
				SD[i] = D;
				CP[i] = E;
				CUT[i] = A;
				FMT[i] = B;
				AVG[i] = avg;
			}
			if(i==3)
			{
				int b = 5 + rd.nextInt(3);
				String B = String.valueOf(b);
				int c = 3 + rd.nextInt(2);
				String C = String.valueOf(c);
				int d = 1 + rd.nextInt(2);
				String D = String.valueOf(d);
				int e = 0;
				String E = String.valueOf(e);
				float avg = (float) (e+c+b+b+d)/5;
				RA[i] = E;
				SD[i] = C;
				CP[i] = B;
				CUT[i] = B;
				FMT[i] = D;
				AVG[i] = avg;
			}
			if(i==4)
			{
				int a = 8 + rd.nextInt(3);
				String A = String.valueOf(a);
				int b = 5 + rd.nextInt(3);
				String B = String.valueOf(b);
				int c = 3 + rd.nextInt(2);
				String C = String.valueOf(c);
				int d = 1 + rd.nextInt(2);
				String D = String.valueOf(d);
				int e = 0;
				String E = String.valueOf(e);
				float avg = (float) (d+e+b+c+a)/5;
				RA[i] = D;
				SD[i] = E;
				CP[i] = B;
				CUT[i] = C;
				FMT[i] = A;
				AVG[i] = avg;
			}
			if(i==5)
			{
				int a = 8 + rd.nextInt(3);
				String A = String.valueOf(a);
				int b = 5 + rd.nextInt(3);
				String B = String.valueOf(b);
				int c = 3 + rd.nextInt(2);
				String C = String.valueOf(c);
				int d = 1 + rd.nextInt(2);
				String D = String.valueOf(d);
				float avg = (float) (d+c+a+c+b)/5;
				RA[i] = D;
				SD[i] = C;
				CP[i] = A;
				CUT[i] = C;
				FMT[i] = B;
				AVG[i] = avg;
			}
			if(i==6)
			{
				int b = 5 + rd.nextInt(3);
				String B = String.valueOf(b);
				int c = 3 + rd.nextInt(2);
				String C = String.valueOf(c);
				int d = 1 + rd.nextInt(2);
				String D = String.valueOf(d);
				float avg = (float) (b+b+c+b+c)/5;
				RA[i] = B;
				SD[i] = D;
				CP[i] = C;
				CUT[i] = B;
				FMT[i] = C;
				AVG[i] = avg;
			}
			if(i==7)
			{
				int a = 8 + rd.nextInt(3);
				String A = String.valueOf(a);
				int b = 5 + rd.nextInt(3);
				String B = String.valueOf(b);
				int c = 3 + rd.nextInt(2);
				String C = String.valueOf(c);
				int d = 1 + rd.nextInt(2);
				String D = String.valueOf(d);
				float avg = (float) (b+a+d+c+b)/5;
				RA[i] = B;
				SD[i] = A;
				CP[i] = D;
				CUT[i] = C;
				FMT[i] = B;
				AVG[i] = avg;
			}
			if(i==8)
			{
				int b = 5 + rd.nextInt(3);
				String B = String.valueOf(b);
				int c = 3 + rd.nextInt(2);
				String C = String.valueOf(c);
				int d = 1 + rd.nextInt(2);
				String D = String.valueOf(d);
				float avg = (float) (c+b+c+d+c)/5;
				RA[i] = C;
				SD[i] = B;
				CP[i] = C;
				CUT[i] = D;
				FMT[i] = C;
				AVG[i] = avg;
			}
			if(i==9)
			{
				int a = 8 + rd.nextInt(3);
				String A = String.valueOf(a);
				int b = 5 + rd.nextInt(3);
				String B = String.valueOf(b);
				int c = 3 + rd.nextInt(2);
				String C = String.valueOf(c);
				int d = 1 + rd.nextInt(2);
				String D = String.valueOf(d);
				float avg = (float) (a+c+b+b+d)/5;
				RA[i] = A;
				SD[i] = C;
				CP[i] = B;
				CUT[i] = B;
				FMT[i] = D;
				AVG[i] = avg;
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
