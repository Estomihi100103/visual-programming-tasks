
import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judulBuku, penulis, tahunTerbit, penerbit, formatBuku, kategoriRating;
        double hargaBuku, minimumMargin, rating;
        int stok;
        
        iSBN = input.nextLine();
        judulBuku = input.nextLine();
        penulis = input.nextLine();
        tahunTerbit = input.nextLine();
        penerbit = input.nextLine();
        formatBuku = input.nextLine();
        hargaBuku = input.nextDouble();
        minimumMargin = input.nextDouble();
        stok = input.nextInt();
        rating = input.nextDouble();
        if (rating >= 4.7) {
            kategoriRating = "Best Pick";
        } else {
            if (rating >= 4.5) {
                kategoriRating = "Must Read";
            } else {
                if (rating >= 4.0) {
                    kategoriRating = "Recommended";
                } else {
                    if (rating >= 3.0) {
                        kategoriRating = "Average";
                    } else {
                        kategoriRating = "Low";
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judulBuku + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBuku + "|" + hargaBuku + "|" + minimumMargin + "|" + stok + "|" + rating + "|" + kategoriRating);
    }
}
