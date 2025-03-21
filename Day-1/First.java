import java.util.*;

public class First{

    public static int fact(int n){
        int i=1;
        int fact =1;
        while(i<=n){
            fact *= i;
            i++;
        }
        return fact;
    }

    public static void binomialCoeffeicent(int n,int r){
        if (r > n || n < 0 || r < 0) {
            System.out.println("Invalid input: Ensure n >= r >= 0");
            return;
        }
        int factN = fact(n);
        int factR = fact(r);
        int minNR = fact(n-r);
        int Ans = factN / (factR * minNR);
        System.out.println("binomial Cof: "+ Ans );
    }

    public static void isPrime(int n) {
        if (n <= 1) {
            System.out.println("Not prime");
            return;
        }
        if (n == 2) {
            System.out.println("Number is Prime");
            return;
        }
        if (n % 2 == 0) {
            System.out.println("Not prime");
            return;
        }
        boolean prime = true;
        for (int i = 3; i <= Math.sqrt(n); i += 2) { 
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Not prime");
        }
    }

    public static void binaryToDecimal(int n){
        int rem=0;
        int sum =0;
        int i = 0;
        while(n>0){
            rem = n % 10;
            sum += rem*((int)Math.pow(2, i));
            n = n/10;
            i++;
        }
        System.out.println(sum);
    }

    public static void decimalToBinary(int n){
        String binary = ""; 
        
        while (n > 0) {
            int rem = n % 2;
            binary = rem + binary; 
            n /= 2;
        }
        
        System.out.println( binary);
    }

    public static void averageOfThreeNum(int a,int b,int c){
        double avg = (a+b+c)/3;
        System.out.println(avg);
    }
    
    public static void isPalindrome(int n){
        int palin =n;
        int rem =0;
        int sum =0;
        while(n>0){
            rem = n%10;
            n /= 10;
            sum = (sum*10) + rem; 
        }
        if(palin == sum){ System.out.println("Number is Palindrome."); }
        else{
            System.out.println("Non Palindrome");
        }
    }
    
    public static int LinearSearch(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k) return i;
        }
        return 0;
    }

    public static void largestNum(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        System.out.println("Largest number: "+max);
    }

    public static int BinarySearch(int[] arr,int k){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s + (e - s) / 2;
            if(arr[mid] == k) { System.out.println(arr[mid]+" found the element at index: "+mid); return mid;}
            else if(k>arr[mid]){
                s = mid+1;
            }   
            else if(k<arr[mid]){
                e = mid-1;
            }
        }
        return -1;
        
    }
    
    public static int[] swapNum(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        
        return new int[]{a, b}; 
    }
    
    public static void reverseArr(int[] arr){
        int s=0,e=arr.length-1;
        while (s < e) { 
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void pairsInAnArray(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+", "+arr[j]+")");
            }
            System.out.println();
        }
    }
    
    public static void subArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("(");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + (k < j ? ", " : ""));
                }
                System.out.print(") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter n: ");
        // int n = sc.nextInt();

        // System.out.print("Enter r: ");
        // int r = sc.nextInt();
        // binomialCoeffeicent(n, r);
        // // System.out.print("Factorial: "+ fact(n));
        // isPrime(n);
        // binaryToDecimal(n);
        // decimalToBinary(n);
        // isPalindrome(n);
        int[] arr = {2,4,6,8,10};
        // System.out.println(LinearSearch(arr,0));
        // largestNum(arr);
        // System.out.println(BinarySearch(arr,10901));
        // reverseArr(arr);
        // pairsInAnArray(arr);
        subArray(arr);
    }
}
