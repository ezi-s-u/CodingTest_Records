import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String res = "";
        
        for(int i = 0; i < a.length(); i++) {
            char c = a.substring(i, i+1).charAt(0);
            if(c >= 65 && c <= 90)
                res += String.valueOf((char)(c+32));
            else
                res += String.valueOf((char)(c-32));
        }
        
        System.out.println(res);
    }
}