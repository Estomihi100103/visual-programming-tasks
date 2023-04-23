# X01 Start Buying (Paired)

Pengguna aplikasi Juragan Buku semakin banyak, Ucok dan Butet pun mulai mendapat pesanan dari rekan-rekannya, para pengguna aplikasi. Awalnya pesanan dicatat dan dihitung secara manual oleh Ucok dan Butet, transaksi juga dilakukan secara manual melalui mekanisme transfer. Dengan semakin banyaknya pesanan dan variasi isi pesanan, Ucok dan Butet pun mulai kesulitan dalam merekapitulasi nilai dari transaksi. Ucok menyadari bahwa mereka memerlukan suatu metode yang membantu mereka merekapitulasi transaksi.

Pada hari Minggu, sepulang dari kota bersama Ayah, Butet mampir ke sebuah mini market membeli beberapa keperluan. Setelah melakukan transaksi pembelian, Butet diberikan sebuah struk bukti pembelian. Ia terinspirasi dengan konsep penghitungan dan pencatatan transaksi di mini market untuk dapat diimplementasikan juga dalam aplikasi Juragan Buku.

Keesokan harinya di kampus, Butet menceritakan inspirasi yang diperolehnya kepada Ucok. Menurut Ucok, hal tersebut akan sangat memudahkan mereka dalam merekapitulasi transaksi buku. Kemudian Ucok merancang struktur input yang akan diaplikasikan dengan ketentuan sebagai berikut:
1. Buku diidentifikasi dengan International Standard Book Number (```isbn```) yang unik dan dihargai dengan mata uang USD.
2. Minimum pembelian adalah satu eksemplar dari suatu buku.
3. Diperbolehkan membeli lebih dari satu buku masing-masing dapat dengan jumlah eksemplar yang berbeda.
4. Untuk setiap buku terdiri atas tiga baris masukan yaitu ```isbn```, ```price``` per eksemplar, ```quantity``` dari eksemplar.
5. Aplikasi akan membaca masukan buku secara terus menerus hingga diperintahkan untuk berhenti. Perintah berhenti ditandai dengan ```---``` pada saat membaca masukan ```isbn```.

Selanjutnya, Ucok mendefinisikan luaran setelah semua masukan diterima. Aplikasi akan menampilkan total nilai transaksi yang ditulis dalam dua digit nilai presisi.

Sebagai contoh (Example 1) terjadi sebuah transaksi terhadap dua buah buku berbeda (```979-8700048361``` dan ```978-0439708180```) dengan harga yang juga berbeda (```35.98``` dan ```14.15```). Jumlah eksemplar yang ditransaksikan adalah ```1``` buah untuk buku pertama dan ```3``` buah untuk buku kedua. Dengan demikian maka nilai transaksi adalah ```(36.98 x 1) + (14.15 x 3) = 78.43```. Perlu diingat bahwa tidak dibatasi mengenai jumlah buku yang boleh ditransaksikan.

### Example 1

**Input**:
```bash
979-8700048361
35.98
1
978-0439708180
14.15
3
---

```

**Output**:
```bash
78.43

```

### Example 2

**Input**:
```bash
978-0130895929
50.19
3
978-0593238295
22.11
2
---

```

**Output**:
```bash
194.79

```

HINT: untuk menulis dalam format presisi, silakan melihat fungsi ToFixed(r, i) yang dapat diakses di: http://www.flowgorithm.org/documentation/intrinsic-functions.html 

## Code Generation

Pada saat mengekspor Java code, gunakan template yang telah diberikan ```java-program-template.fpgt```.

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

1. X01.java
2. X01.fprg
3. changelog.txt

## How to Submit?

Please see https://youtu.be/cU546lAL9g8