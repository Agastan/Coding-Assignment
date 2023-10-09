package array;
import java.util.*;
public class arrsuffle {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7};
	        shuffleArray(arr);
	        System.out.println(Arrays.toString(arr));
	    }

	    public static void shuffleArray(int[] arr) {
	        int n = arr.length;
	        
	        for (int i = n - 1; i > 0; i--) {
	            int index = (int) (Math.random() * (i + 1));
	            int temp = arr[i];
	            arr[i] = arr[index];
	            arr[index] = temp;
	        }
	    }
	}

