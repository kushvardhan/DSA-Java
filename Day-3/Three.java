import java.util.*;

public class Three {

    public static void palindromeString(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.println(str + " is not a Palindrome.");
                return;
            }
        }
        System.out.println(str + " is a Palindrome.");
    }

    public static void shortestPath(String str) {
        int x = 0, y = 0;
    
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toUpperCase(str.charAt(i)); 

            if (ch == 'N') y++;
            else if (ch == 'S') y--;
            else if (ch == 'W') x--;
            else if (ch == 'E') x++;
            else {
                System.out.println("Invalid input! Use only 'W, N, E, S' (case insensitive).");
                return;
            }
        }
    
        double shortestDistance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Shortest Distance: " + shortestDistance);
    }
    
    public static void SubString(String str,int s,int e){
        StringBuilder s2 = new StringBuilder("");
        for(int i=s;i<e;i++){
            s2.append(str.charAt(i));
        }
        System.out.println("Substring: "+ s2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        
        // palindromeString(str);
        // shortestPath(str);
        // SubString(str,2,6);
        String fruits[] = {"Apple","Mango","Guava","Kiwi","Avacado"};
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.print("Largest in the fruits: "+largest);
    }
}
