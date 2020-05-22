package sortFunction;
import javax.swing.JFrame;
public class MergeSort {
//	static long startTime, endTime;
	static int count = 0;
	static void merge(int arr[], int l, int m, int r) 
    { 	
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; //n1 is the size of left array
        int n2 = r - m; // n2 is the size of right array
  
        /* Create temp arrays */
        int L[] = new int [n1]; //left array
        int R[] = new int [n2]; //right array
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; // let L[]array be the same of array's left
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; // letR[]array each element same of array's right
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) // do the loop in two array
        { 
            if (L[i] <= R[j]) // compare left and right array same position
            { 
                arr[k] = L[i]; 
                i++; 
                count++;
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
                count++;
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    static void sort(int arr[], int l, int r) 
    {  //startTime = System.currentTimeMillis();//start time
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
       //  endTime = System.currentTimeMillis();//end time
    } 
    //calucate time that the sort need
   // static String printTime() {
    //	return("Sort needs "+String.valueOf(endTime-startTime)+" ms.");
    //}
    
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
    static void printCount(int arr[])
    {
    	 System.out.print("Count: " + count);
    }

    public static void main(String args[]) 
    {//test and run
    	int arr[]= {2,4,6,81,4,6,8,9,12,34,65,26};
    	MergeSort ms = new MergeSort();
    	ms.sort(arr, 1, 5);
    	printArray(arr);
    	printCount(arr);
    	//printTime();
    }
} 
// MergeSort ob = new MergeSort(); 
//ob.sort(arr, 0, arr.length-1); 



