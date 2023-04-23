// 12S21004- Estomihi Pangaribuan
import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn;
        double price;
        int quantity;
        double totaltransaksi;
        
        totaltransaksi = 0;
        do {
            isbn = input.nextLine();
            if (!isbn.equals("---")) {
                price = Double.parseDouble(input.nextLine());
                quantity = Integer.parseInt(input.nextLine());
                totaltransaksi = price * quantity + totaltransaksi;
            } else {
                System.out.println(toFixed(totaltransaksi,2));
            }
        } while (!isbn.equals("---"));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
