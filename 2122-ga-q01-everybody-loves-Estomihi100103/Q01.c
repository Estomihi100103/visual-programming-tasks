#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void getstring(char *teks)
{

    teks[0] = '\0';
    int c = 0;
    while (1)
    {
        char x = getchar();
        if (x == '\r')
        {
            continue;
        }
        if (x == '\n')
        {
            break;
        }
        teks[c] = x;
        teks[++c] = '\0';
    }
}

int main()
{
    char kategori[13];
    float diskon;

    char ISBN[20];
    printf("masukkan ISBN: ");
    getstring(ISBN);

    char judul[50];
    printf("masukkan judul: ");
    getstring(judul);

    char penulis[40];
    printf("masukkan penulis: ");
    getstring(penulis);

    char tahun_terbit[5];
    printf("masukkan tahun terbit:");
    getstring(tahun_terbit);
    int tahun;
    tahun=atoi(tahun_terbit);

    char penerbit[10];
    printf("masukkan penerbit: ");
    getstring(penerbit);

    char format_buku_elektronik[5];
    printf("masukkan format buku: ");
    getstring(format_buku_elektronik);
    

    float harga_pembelian;
    printf("masukkan harga pembelian: ");
    scanf("%f", &harga_pembelian);

    float minimum_margin;
    printf("masukkan minimum margin: ");
    scanf("%f", &minimum_margin);

    int stok;
    printf("masukkan stok: ");
    scanf("%d", &stok);

    float rating;
    printf("masukkan rating: ");
    scanf("%f", &rating);

    printf("\n%s|%s|%s|%d|%s|%s|%.2f|%.2f|%d|%.1f|", ISBN, judul, penulis, tahun, penerbit, format_buku_elektronik, harga_pembelian, minimum_margin, stok, rating);

    // untuk tipe rating
    if (rating >= 4.7)
    {
        printf("Best Pick");
    }
    else if (rating >= 4.5)
    {
        printf("Must Read");
    }
    else if (rating >= 4.0)
    {
        printf("Recommended");
    }
    else if (rating >= 3.0)
    {
        printf("Average");
    }
    else if (rating < 3.0)
    {
        printf("Low");
    }

    // untuk diskon tipe diskon
    diskon = minimum_margin * 100 / harga_pembelian * -1;
    if (minimum_margin > 0)
    {
        printf("|---\n");
    }

    else if (diskon > 40.00)
    {
        printf("|Once in a lifetime\n");
    }
    else if (diskon > 20.00 && diskon <= 40.00)
    {
        printf("|Never come twice\n");
    }
    else if (diskon <= 20.00)
    {
        printf("|No regret\n");
    }

    return 0;
}