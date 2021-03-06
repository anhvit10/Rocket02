package assignment_5_bai_1;

public class SelectionSort extends SequenceNumber implements Sort{

	SelectionSort(int n) {
		super(n);
	}

	@Override
	public void sort() {
		for(int i=0; i<arr.length; i++) {
			int minArr = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[minArr]>arr[j]) {
					minArr = j;
				}
			}
			if(i!=minArr)
				hoanVi(arr, minArr, i);
			}
		System.out.print("Mang sau selectionSort la: ");
	}
	
	private void hoanVi(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
}
