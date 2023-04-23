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
    if (rating >= 4.7)
    {
        strcpy(kategori, "Best Pick");
    }
    else if (rating >= 4.5)
    {
        strcpy(kategori, "Must Read");
    }
    else if (rating >= 4.0)
    {
        strcpy(kategori, "Recommended");
    }
    else if (rating >= 3.0)
    {
        strcpy(kategori, "Average");
    }
    else if (rating < 3.0)
    {
        strcpy(kategori, "Low");
    }

    printf("\n%s|%s|%s|%s|%s|%s|%.2f|%.2f|%d|%.1f|%s\n", ISBN, judul, penulis, tahun_terbit, penerbit, format_buku_elektronik, harga_pembelian, minimum_margin, stok, rating, kategori);
    return 0;
}