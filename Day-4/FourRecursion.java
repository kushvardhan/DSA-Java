import java.util.*;

public class FourRecursion {

    public static void printName5Times(int n){
        if(n == 0) return;
        n--;
        printName5Times(n);
        System.out.println("Kush "+n);
    }
    public static void Print1toN(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        Print1toN(n-1);
        System.out.println(n);
    }
    public static void PrintNto1(int n){
        if(n==1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        PrintNto1(n-1);
    }
    public static int Factorial(int n){
        if(n==0) return 1;
        int fn1 = Factorial(n-1);
        int fn = n * Factorial(n-1);
        return fn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        // printName5Times(n);
        // Print1toN(n);
        // System.out.println();
        // PrintNto1(n);
        System.out.println(Factorial(n));
    }
}
