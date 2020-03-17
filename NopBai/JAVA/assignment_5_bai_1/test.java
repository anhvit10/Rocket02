package assignment_5_bai_1;

public class test {
	public static void main(String[] args) {
		
		SequenceNumber quickSort = new QuickSort(5);
		quickSort.input();
		
		int left = 0;
	    int right = quickSort.arr.length - 1;
	    
	    ((QuickSort) quickSort).sort(quickSort.arr, left, right);
	    System.out.print("Mang sau quickSort la: ");
	    quickSort.print();
	}

}
