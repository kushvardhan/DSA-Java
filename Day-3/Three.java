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
    
    public static void stringComparison(){
        String s1 = "Kush";
        String s2 = "Kush";
        StringBuilder s3 = new StringBuilder("Kush");

        if(s1==s2){ System.out.println("s1 and s2 are equal");}
        else{ System.out.println("s1 and s2 aren't equal.");}

        // if(s1 == s3.toString()){     // we cant compare String to StringBuilder
        if(s1.equals(s3)){     
        System.out.println("s1 and s3 are equal.");
        }
        else{
            System.out.println("S1 and s3 aren't equal.");
        }

    }
    
    public static void convertEveryFirstLetterIntoUpperCase(String str) {
        StringBuilder s = new StringBuilder();
        s.append(Character.toUpperCase(str.charAt(0))); 
    
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i + 1 < str.length()) { 
                s.append(' ');
                s.append(Character.toUpperCase(str.charAt(i + 1)));  
                i++;
            } else {
                s.append(str.charAt(i));
            }
        }
    
        System.out.println(s);
    }
    
    public static void anagramString(String s1, String s2) {
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray(); 
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        String sortedString1 = new String(charArray1);
        String sortedString2 = new String(charArray2);
        
        System.out.println(sortedString1 + " " + sortedString2);
        
        if (sortedString1.equals(sortedString2)) {
            System.out.print("Both Strings are Anagram");
        } else {
            System.out.print("Not anagram.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        
        // palindromeString(str);
        // shortestPath(str);
        // SubString(str,2,6);
        // String fruits[] = {"Apple","Mango","Guava","Kiwi","Avacado"};
        // String largest = fruits[0];
        // for(int i=1;i<fruits.length;i++){
        //     if(largest.compareTo(fruits[i])<0){
        //         largest = fruits[i];
        //     }
        // }
        // System.out.print("Largest in the fruits: "+largest);
        // stringComparison();
        // convertEveryFirstLetterIntoUpperCase("hello namaste chalo, eie   ");
        anagramString("listen", "silent");
    }
}
