import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] iSBN = new String[3];
        double[] price = new double[3];
        int[] totalBuku = new int[3];
        double totalHargaOutput;
        double[] totalPrice = new double[3];
        
        totalPrice[0] = 0;
        totalPrice[1] = 0;
        totalPrice[2] = 0;
        int n, quantity0, quantity1, quantity2;
        
        n = 0;
        price[0] = 0;
        price[1] = 0;
        price[2] = 0;
        totalBuku[0] = 0;
        totalBuku[1] = 0;
        totalBuku[2] = 0;
        quantity0 = 0;
        quantity1 = 0;
        quantity2 = 0;
        String nama0, nama1, nama2;
        
        nama0 = "good";
        nama1 = "good";
        nama2 = "good";
        int zero, one, two;
        
        zero = 0;
        one = 1;
        two = 2;
        while (n < 3) {
            iSBN[n] = input.nextLine();
            if (iSBN[n].equals("---")) {
                n = 3;
            } else {
                if (iSBN[n].equals(iSBN[0])) {
                    if (zero == 0) {
                        nama0 = iSBN[n];
                    }
                    if (iSBN[0].equals(nama0)) {
                        n = 0;
                        price[n] = Double.parseDouble(input.nextLine());
                        totalBuku[n] = Integer.parseInt(input.nextLine());
                        quantity0 = quantity0 + totalBuku[n];
                        zero = 3;
                        n = n + 1;
                    } else {
                        if (one == 1) {
                            nama1 = iSBN[n];
                        }
                        if (iSBN[0].equals(nama1)) {
                            n = 1;
                            price[n] = Double.parseDouble(input.nextLine());
                            totalBuku[n] = Integer.parseInt(input.nextLine());
                            quantity1 = quantity1 + totalBuku[n];
                            zero = 3;
                            n = n + 1;
                        } else {
                            n = 2;
                            price[n] = Double.parseDouble(input.nextLine());
                            totalBuku[n] = Integer.parseInt(input.nextLine());
                            quantity2 = quantity2 + totalBuku[n];
                            zero = 3;
                            n = 0;
                        }
                    }
                } else {
                    if (iSBN[n].equals(iSBN[1])) {
                        if (one == 1) {
                            nama1 = iSBN[n];
                        }
                        if (iSBN[1].equals(nama1)) {
                            n = 1;
                            price[n] = Double.parseDouble(input.nextLine());
                            totalBuku[n] = Integer.parseInt(input.nextLine());
                            quantity1 = quantity1 + totalBuku[n];
                            one = 3;
                            n = n + 1;
                        } else {
                            n = 2;
                            price[n] = Double.parseDouble(input.nextLine());
                            totalBuku[n] = Integer.parseInt(input.nextLine());
                            quantity2 = quantity2 + totalBuku[n];
                            one = 3;
                            n = 0;
                        }
                    } else {
                        if (iSBN[n].equals(iSBN[2])) {
                            if (two == 2) {
                                nama2 = iSBN[n];
                            }
                            if (iSBN[2].equals(nama2)) {
                                n = 2;
                                price[n] = Double.parseDouble(input.nextLine());
                                totalBuku[n] = Integer.parseInt(input.nextLine());
                                quantity2 = quantity2 + totalBuku[n];
                                two = 3;
                                n = 0;
                            }
                        }
                    }
                }
            }
        }
        if (quantity0 >= 20) {
            price[0] = price[0] - price[0] * 12 / 100;
        } else {
            if (quantity0 >= 10) {
                price[0] = price[0] - price[0] * 5 / 100;
            } else {
                if (quantity0 >= 5) {
                    price[0] = price[0] - price[0] * 2 / 100;
                }
            }
        }
        totalPrice[0] = price[0] * quantity0;
        if (quantity1 >= 20) {
            price[1] = price[1] - price[1] * 12 / 100;
        } else {
            if (quantity1 >= 10) {
                price[1] = price[1] - price[1] * 5 / 100;
            } else {
                if (quantity1 > -5) {
                    price[1] = price[1] - price[1] * 2 / 100;
                }
            }
        }
        totalPrice[1] = price[1] * quantity1;
        if (quantity2 >= 20) {
            price[2] = price[2] - price[2] * 12 / 100;
        } else {
            if (quantity2 >= 10) {
                price[2] = price[2] - price[2] * 5 / 100;
            } else {
                if (quantity2 >= 5) {
                    price[2] = price[2] - price[2] * 2 / 100;
                }
            }
        }
        totalPrice[2] = price[2] * quantity2;
        totalHargaOutput = totalPrice[0] + totalPrice[1] + totalPrice[2];
        System.out.println(toFixed(totalHargaOutput,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
