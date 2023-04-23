// 12S21004 - Estomihi Pangaribuan
import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn, judul, penulis, tahunterbit, penerbit, formatbukuelektranik;
        
        isbn = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunterbit = input.nextLine();
        penerbit = input.nextLine();
        formatbukuelektranik = input.nextLine();
        double hargapembelian, minimummargin, rating;
        int stok;
        
        hargapembelian = input.nextDouble();
        minimummargin = input.nextDouble();
        stok = input.nextInt();
        rating = input.nextDouble();
        System.out.print(isbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbukuelektranik + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + rating);
    }
}
