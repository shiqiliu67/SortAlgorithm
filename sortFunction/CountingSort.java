package sortFunction;

public class CountingSort {
	public static int[] countingSort(int[] array, int max) { // input array and array's max
		int[] result = new int[array.length];
		int[] temp = new int[max + 1];
		//after the for loop, temp[i] stores total amount of array
		for (int i : array) {
			temp[i]++;
		}
		//after these two for loop, temp[i] stores total amount of elements which value smaller than i
		for (int i = 1; i < temp.length; i++) {
			temp[i] += temp[i - 1];
		}
		for (int i = array.length - 1; i > -1; i--) {
			result[temp[array[i]] - 1] = array[i];
			temp[array[i]]--;
		}
		return result;//return the result
	}
	public static int max(int[] t) {
	    int maximum = t[0];   // start with the first value
	    for (int i=1; i<t.length; i++) {
	        if (t[i] > maximum) {
	            maximum = t[i];   // new maximum
	        }
	    }
	    return maximum;
	}//end method max

	/**
	 * print array 
	 */
	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] array = { 2, 5, 3, 0, 2, 3, 0, 3,7};
		int max = CountingSort.max(array);
		printArray(countingSort(array, max));
	}

}
