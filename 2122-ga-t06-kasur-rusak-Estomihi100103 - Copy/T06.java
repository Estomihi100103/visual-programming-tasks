// 12S21004 - Estomihi Pangaribuan
import java.util.*;
import java.lang.Math;

public class T06 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String s;
        
        s = input.nextLine();
        System.out.println(checkPalindrom(s, 0));
    }
    
    public static String checkPalindrom(String s, int i) {
        String suitable;
        
        if (i >= (double) s.length() / 2) {
            suitable = "YA";
        } else {
            if (String.valueOf(s.charAt(i)).equals(String.valueOf(s.charAt(s.length() - 1 - i)))) {
                suitable = checkPalindrom(s, i + 1);
            } else {
                suitable = "BUKAN";
            }
        }
        
        return suitable;
    }
}

