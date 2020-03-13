package assignment_5_bai_1;

public class InsertSort extends SequenceNumber implements Sort{

	InsertSort(int n) {
		super(n);
	}

	@Override
	public void Sort() {
		for(int i=1; i<arr.length; i++) {
			int x = arr[i];
			int y = i;
			while( y > 0 && arr[ y - 1 ] > x ) {
				arr[y] = arr[y-1];
				y--;
			}
			arr[y]=x;
		}
		System.out.print("Mang sau insertSort la: ");
	}
	
	public static void main(String[] args) {
		InsertSort insertSort = new InsertSort(4);
		insertSort.input(); 
		insertSort.Sort();
		insertSort.print();
	}
	

}
