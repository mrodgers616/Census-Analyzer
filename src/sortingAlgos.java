import java.util.*;

public class sortingAlgos {

	public static float[] bubbleSort(float A[]) {
            int num = A.length; 
            for (int i = 0; i < num-1; i++)  {
                for (int j = 0; j < (num-i-1); j++) {
                    if (A[j] > A[j+1]) { 
                        float temp = A[j]; 
                        A[j] = A[j+1]; 
                        A[j+1] = temp; 
                    } 
                }
            } 
            return A;
	}
	
	public static float[] mergeSort(float A[], int l, int r) {
            if (l < r) { 
                int m = (l+r)/2;
                mergeSort(A, l, m); 
                mergeSort(A , m+1, r);
                merge(A, l, m, r); 
            } 
            return A;
	}
	
	public static float[] merge(float A[], int l, int m, int r) {
            int n1 = m - l + 1; 
            int n2 = r - m; 

            float L[] = new float [n1]; 
            float R[] = new float [n2]; 

            for (int i=0; i<n1; ++i) {
                L[i] = A[l + i]; 
            }
            for (int j=0; j<n2; ++j) {
                R[j] = A[m + 1+ j]; 
            }

            int i = 0;
            int j = 0; 
            int k = l; 
            while (i < n1 && j < n2) { 
                if (L[i] <= R[j]) { 
                    A[k] = L[i]; 
                    i++; 
                } 
                else { 
                    A[k] = R[j]; 
                    j++; 
                } 
                k++; 
            } 

            while (i < n1) { 
                A[k] = L[i]; 
                i++; 
                k++; 
            } 

            while (j < n2)  { 
                A[k] = R[j]; 
                j++; 
                k++; 
            }
            return A;
	}
	
	public static int partition(float A[], int low, int high) { 
            float pivot = A[high];  
            int i = (low-1);  
            for (int j = low; j < high; j++) { 
                if (A[j] <= pivot) { 
                    i++;
                    float temp = A[i]; 
                    A[i] = A[j]; 
                    A[j] = temp; 
                } 
            } 

            float temp = A[i+1]; 
            A[i+1] = A[high]; 
            A[high] = temp; 

            return i+1; 
    } 
  
  
    public static float[] quickSort(float A[], int low, int high)  { 
        if (low < high) { 
            int p = partition(A, low, high);
            quickSort(A, low, p-1); 
            quickSort(A, p+1, high); 
        }
        return A;
    } 
    
    public static int partitionImproved(float A[], int low, int high) 
    { 
    	Random rand = new Random();
    	int num = low + rand.nextInt(high - low);
        float pivot = A[num];  
        int j = (low-1);  
        for (int i = low; i < high; i++) { 
            if (A[i] <= pivot) { 
                j++; 
  
                float temp = A[j]; 
                A[j] = A[i]; 
                A[i] = temp; 
            } 
        } 
  
        float temp = A[j+1]; 
        A[j+1] = A[high]; 
        A[high] = temp; 
  
        return j+1; 
    } 
    
    public static float[] quickSortImproved(float A[], int low, int high)  { 
        if (low < high) { 
            int p = partition(A, low, high); 
  
            quickSort(A, low, p-1); 
            quickSort(A, p+1, high); 
        }
        return A;
    } 
	
}

