package assignment_5_bai_1;

public class QuickSort extends SequenceNumber implements Sort{
	
	QuickSort(int n) {
		super(n);
	}

	@Override
	public void Sort() {
	}
	
	public void Sort(int[] arr, int left, int right) {
		if (arr == null || arr.length == 0)
		      return;

		    if (left >= right)
		      return;

		    int middle = left + (right - left) / 2;
		    int pivot = arr[middle];
		    int i = left, j = right;

		    while (i <= j) {
		      while (arr[i] < pivot) {
		        i++;
		      }

		      while (arr[j] > pivot) {
		        j--;
		      }

		      if (i <= j) {
		        int temp = arr[i];
		        arr[i] = arr[j];
		        arr[j] = temp;
		        i++;
		        j--;
		      }
		    }

		    if (left < j)
		      Sort(arr, left, j);

		    if (right > i)
		      Sort(arr, i, right);
	}
	
	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort(5);
		quickSort.input();
		
		int left = 0;
	    int right = arr.length - 1;
	    
	    quickSort.Sort();
	    quickSort.Sort(arr, left, right);
	    System.out.print("Mang sau quickSort la: ");
	    quickSort.print();
	}

}
