package assignment_5_bai_1;

import java.util.Scanner;

public class SequenceNumber {
	
	protected static Scanner sc = new Scanner(System.in);
	protected static int[] arr;
	
	SequenceNumber(int n){
		arr = new int[n];
	}
	
	protected void input() {
        System.out.print("Nhap cac phan tu cua mang :\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        	}
        System.out.print("Cac phan tu cua mang: ");
        print();
        System.out.println();
	}
        
    protected void print(){
    	 for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] + " ");
         }
     }
     
     
}
