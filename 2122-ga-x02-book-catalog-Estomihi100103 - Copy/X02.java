// 12S21004 - Estomihi Pangaribuan
import java.util.*;
import java.lang.Math;

public class X02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] myISBN = new String[10];
        double[] myPrice = new double[5];
        int[] myQuantity = new int[5];
        int i;
        double currentPrice;
        
        currentPrice = 0;
        double totPrice;
        
        totPrice = 0;
        for (i = 0; i <= 9; i++) {
            myISBN[i] = input.nextLine();
            if (myISBN[i].equals("---")) {
                i = 9;
            } else {
                if (i > 4) {
                    if (myISBN[i].equals(myISBN[0])) {
                        myQuantity[0] = Integer.parseInt(input.nextLine());
                        currentPrice = myPrice[0] * myQuantity[0];
                    } else {
                        if (myISBN[i].equals(myISBN[1])) {
                            myQuantity[1] = Integer.parseInt(input.nextLine());
                            currentPrice = myPrice[1] * myQuantity[1];
                        } else {
                            if (myISBN[i].equals(myISBN[2])) {
                                myQuantity[2] = Integer.parseInt(input.nextLine());
                                currentPrice = myPrice[2] * myQuantity[2];
                            } else {
                                if (myISBN[i].equals(myISBN[3])) {
                                    myQuantity[3] = Integer.parseInt(input.nextLine());
                                    currentPrice = myPrice[3] * myQuantity[3];
                                } else {
                                    if (myISBN[i].equals(myISBN[4])) {
                                        myQuantity[4] = Integer.parseInt(input.nextLine());
                                        currentPrice = myPrice[4] * myQuantity[4];
                                    }
                                }
                            }
                        }
                    }
                } else {
                    myPrice[i] = Double.parseDouble(input.nextLine());
                }
                totPrice = totPrice + currentPrice;
            }
        }
        System.out.println(toFixed(totPrice,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}


