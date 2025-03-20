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

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // System.out.print("Enter r: ");
        // int r = sc.nextInt();
        // binomialCoeffeicent(n, r);
        // // System.out.print("Factorial: "+ fact(n));
        isPrime(n);

    }
}
