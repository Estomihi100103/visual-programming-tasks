# Q01 Everybody Loves (Paired Programming Quiz)

Sudah menjadi kebiasaan Ucok untuk membaca mading (majalah dinding) pasca sarapan pagi di kantin. Ada hal menarik yang ditemui Ucok pada posting mading hari ini, ada **Book Bazaar** di akhir pekan ini! Ucok biasa membeli buku-buku referensi pada event seperti ini karena banyaknya potongan harga alias diskon. Everybody loves discount.

Dalam benaknya Ucok berpikir mengapa tidak menyediakan fitur diskon pada simulatornya? Diskon akan menjadi daya tarik tersendiri bagi pengunjung. Seperti biasa, Ucok pun menemui Butet pada saat reses kuliah.

Dalam diskusinya dengan Butet, ia menyampaikan ide agar nilai ```margin``` keuntungan dapat diset negatif untuk menunjukkan diskon. Diskon dihitung dalam bentuk persentase dari nilai ```margin``` terhadap ```price``` (harga pembelian). Misal, sebuah buku seharga ```30.00``` USD dikenai ```margin``` sebesar ```-14.00``` USD mendapatkan diskon ```46.67%```. Butet kemudian mengusulkan agar dilakukan pengkategorian diskon berdasarkan nilai persentase diskon. Berikut usul Butet:
1. Diskon lebih dari 40.00% dikategorikan sebagai **Once in a lifetime**;
2. Diskon lebih dari 20.00% dikategorikan sebagai **Never come twice**; dan
3. Diskon mulai dari 20.00% ke bawah dikategorikan sebagai **No regret**;

Dengan jiwa enterpreneur yang meluap-luap, Ucok kemudian menyampaikan analisis perubahan yang perlu dilakukan pada simulator yang sudah dikembangkan. Menurut Ucok, tidak ada perubahan yang perlu dilakukan pada input. Sebaliknya, akan ditambahkan satu segmen kategori diskon pada akhir luaran. Perhatikan Example 1. Perlu diperhatikan bahwa solusi yang dihasilkan adalah pengembangan dari **T02**.

Untuk buku yang nilai ```margin```-nya positif tidak diberi kategori. Sebagai pengganti, diberi ```---``` (tripledashes) pada segmen kategori diskon. Perhatikan Example 2.

### Example 1

**Input**:
```bash
979-8700048361
The Science of Self-Control
Menno Henselmans
2021
---
no
35.98
-14.11
41
5.0

```

**Output**:
```bash
979-8700048361|The Science of Self-Control|Menno Henselmans|2021|---|no|35.98|-14.11|41|5.0|Best Pick|Never come twice

```

### Example 2

**Input**:
```bash
978-0130895929
C: A Reference Manual
Samuel Harbison, Guy Steele Jr.
2002
Pearson
no
50.19
11.05
21
4.1

```

**Output**:
```bash
978-0130895929|C: A Reference Manual|Samuel Harbison, Guy Steele Jr.|2002|Pearson|no|50.19|11.05|21|4.1|Recommended|---

```

## Reporting

Lakukan pertemuan dengan pair anda untuk mendiskusikan persoalan dan pengembangan solusi. Rekaman dari pertemuan tersebut menjadi bagian dari artefak tugas yang harus dikumpulkan. Durasi rekaman minimal 20 menit.

Presentasikan pekerjaan anda dalam sebuah video.
1. Setiap pair member harus berkontribusi dalam presentasi.
2. Jabarkan solusi anda (Flowgorithm).
3. Jabarkan kesulitan yang anda hadapi dalam rangka pengembangan solusi.

**Note**: Semakin tajam argumen dan penjabaran anda semakin mudah penilaian dilakukan.

**Kriteria Video Presentasi**:
+ 1080p/30fps, min. 10 menit.
+ Suara jernih dan dapat dengan jelas terdengar.
+ Posting video anda di YouTube, di-set "Not For Kids" dengan visibility Unlisted.

## Submissions:

1. Q01.java
2. Q01.fprg
3. changelog.txt

## How to Submit?

Please see https://youtu.be/cU546lAL9g8