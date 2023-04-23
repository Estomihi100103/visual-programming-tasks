// 12S21004-Estomihi Pangaribuan
import java.util.*;
import java.lang.Math;

public class Q01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn, judul, penulis, tahunterbit, penerbit, formatbukuelektranik, kategori, keterangan;
        
        isbn = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunterbit = input.nextLine();
        penerbit = input.nextLine();
        if (penerbit.equals("---")) {
            penerbit = "---";
        } else {
            penerbit = penerbit;
        }
        formatbukuelektranik = input.nextLine();
        int stok;
        double hargapembelian, rating, minimummargin;
        
        hargapembelian = input.nextDouble();
        minimummargin = input.nextDouble();
        if (minimummargin > 0) {
            keterangan = "---";
        } else {
            if (minimummargin < -hargapembelian * 40 / 100) {
                keterangan = "Once in a lifetime";
            } else {
                if (minimummargin < -hargapembelian * 20 / 100) {
                    keterangan = "Never come twice";
                } else {
                    keterangan = "No regret";
                }
            }
        }
        stok = input.nextInt();
        rating = input.nextDouble();
        if (rating >= 4.7) {
            kategori = "Best Pick";
        } else {
            if (rating >= 4.5) {
                kategori = "Must Read";
            } else {
                if (rating >= 4.0) {
                    kategori = "Recommended";
                } else {
                    if (rating >= 3.0) {
                        kategori = "Average";
                    } else {
                        kategori = "Low";
                    }
                }
            }
        }
        System.out.println(isbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbukuelektranik + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + rating + "|" + kategori + "|" + keterangan);
    }
}
