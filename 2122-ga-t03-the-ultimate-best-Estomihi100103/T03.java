// 12S21004 - Estomihi Pangaribuan
// 12S21011 - Aldi  simamora
import java.util.*;
import java.lang.Math;

public class T03{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, tahunTerbit, penerbit, formatBuku, kategori, tipeDiskon;
        double diskon, harga, rating, margin;
        int stok;
        String tUB;
        
        do {
            iSBN = input.nextLine();
            if (!iSBN.equals("---")) {
                judul = input.nextLine();
                penulis = input.nextLine();
                tahunTerbit = input.nextLine();
                penerbit = input.nextLine();
                formatBuku = input.nextLine();
                harga = Double.parseDouble(input.nextLine());
                margin = Double.parseDouble(input.nextLine());
                stok = Integer.parseInt(input.nextLine());
                rating = Double.parseDouble(input.nextLine());
                if (penerbit.equals("---")) {
                    penerbit = "---";
                }
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
                diskon = -(margin / harga) * 100;
                if (margin > 0) {
                    tipeDiskon = "---";
                } else {
                    if (diskon > 40.00) {
                        tipeDiskon = "Once in a lifetime";
                    } else {
                        if (diskon > 20.00) {
                            tipeDiskon = "Never come twice";
                        } else {
                            tipeDiskon = "No regret";
                        }
                    }
                }
                if (tipeDiskon.equals("Once in a lifetime") && kategori.equals("Best Pick")) {
                    tUB = "The ultimate best";
                } else {
                    tUB = "---";
                }
                System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBuku + "|" + harga + "|" + margin + "|" + stok + "|" + rating + "|" + kategori + "|" + tipeDiskon + "|" + tUB);
            }
        } while (!iSBN.equals("---"));
    }
}
