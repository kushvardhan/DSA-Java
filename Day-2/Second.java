import java.util.*;

public class Second {

    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        System.out.println("Sorted Array using Optimized Bubble Sort: " + Arrays.toString(arr));
    }
    
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] =arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted Array using Selection Sort: " + Arrays.toString(arr));
        
    }

    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr ) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        System.out.println("Sorted Array using Insertion Sort: " + Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter n: ");
        // int n = sc.nextInt();
        int[] arr = {11,-9,-01,34,9,10};
        // bubbleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);
    }
}
