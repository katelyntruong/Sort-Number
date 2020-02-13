
public class Sort {
	//Merge Sort
	public static void mergesort(int [] input) {
		int[] temp = new int[input.length];
		myMergeSort(input, temp, 0, input.length - 1);
	}
	
	//recursively merge 
	public static void myMergeSort(int[] input, int[] temp, int start, int end) {
		if (start >= end) { 
			return;
		}
		else {
			int middle = (start + end)/2;
			myMergeSort(input, temp, start, middle);
			myMergeSort(input, temp, middle+1, end);
			merge(input, temp, start, middle, middle+1, end);
		}
	}
	
	//merge 2 subarrays
	public static void merge (int[] input, int[] temp, int leftStart, int leftEnd, int rightStart, int rightEnd)  {
		int i = leftStart; // index into left subarray
		int j = rightStart; // index into right subarray
		int k = leftStart; // index into temp
		while (i  <= leftEnd && j <= rightEnd) {
	       if (input[i] <= input[j]) {
	    	   temp[k] = input[i];
	    	   i++;
	       }
	       else {
	    	   temp[k] = input[j];
	    	   j++;
	       }
	       k++;
		}
		while (i <= leftEnd) {
			temp[k] = input[i];
			i++;
			k++;
		}
		while (j <= rightEnd) {
			temp[k] = input[j];
			j++;
			k++;
		}
		for (int x = leftStart; x <= rightEnd; x++) {
			input[x] = temp[x];
		}
	}
	
	
	//Quick Sort
	public static void quicksort(int[] input) {
		myQuickSort(input, 0, input.length-1);
	}
	
	public static void myQuickSort(int[] input, int first, int last) {
		if (first >= last) {
			return;
		}
		else {
			int split = partision (input, first, last);
			myQuickSort(input, first, split);
			myQuickSort(input, split+1, last);
		}
	}
	
	//partitioning
	public static int partision(int[] input, int first, int last) {
		int pivot = input[(first + last)/2];
		int i = first - 1;// index going from left to right
		int j = last + 1;// index going from right to left
		while (true) {
			do {
				i++;
			} while (input[i] < pivot);
			do {
				j--;
			} while (input[j] > pivot);
			if (i<j) {
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
			}
			else {
				return j;
			}
		}
	}
	
	
	//select kth smallest element
	public static int kthSmallest(int[] input, int k) {  
		Sort.quicksort(input); 
		return input[k]; 
	}  
}
