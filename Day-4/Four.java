
public class Four {
    
    public static void swapTwoWithoutThird(int a,int b){
        // using XOR operator
        System.out.println("Before xor      a: "+a+" b: "+b);
        a = a^b;
        b=a^b;
        a=a^b;
        System.out.println("After xor       a: "+a+" b: "+b);
    }
    
    public static void ibitIsSetOrNotUSINGLEFTSHIFT(int n,int i){
         if((n & (1<<i))!=0) System.out.println("Set");
         else System.out.println("Not Set");
    }
    public static void ibitIsSetOrNotUSINGRIGHTSHIFT(int n,int i){
        if(((n>>i) & 1) == 0) System.out.println("Not Set");
        else System.out.println("Set");
   }
   public static void setIthBit(int n,int i){
    n = n | (1<<i) ;
    System.out.println(n);
   }
   public static void checkIfPowerOf2(int n){
    if((n & (n-1)) == 0) System.out.println("is power of 2");
    else System.out.println("Not power of 2");
   }

   public static void divideBy2(int n){
    n=(n>>1);
    System.out.println(n);
   }
   public static void clearEvenOrOdd(int n){
    if((n&1)==1) System.out.println("Odd");
    else System.out.println("Even");
   }
   public static void clearIthBit(int n,int i){
    n=(n&(~(1<<i)));
    System.out.println(n); 
   }
    public static void main(String[] args) {
        swapTwoWithoutThird(6,5);
        ibitIsSetOrNotUSINGLEFTSHIFT(13,1);
        ibitIsSetOrNotUSINGRIGHTSHIFT(13, 2);
        setIthBit(9, 2);
        clearIthBit(13, 2);
        checkIfPowerOf2(64);
        clearEvenOrOdd(60);
        divideBy2(9);
    }
}
