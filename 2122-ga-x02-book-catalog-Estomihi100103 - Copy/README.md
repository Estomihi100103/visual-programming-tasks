# X02 Book Catalog (Paired)

Juragan Buku besutan Ucok dan Butet kian melebarkan sayapnya dengan fitur pemesanan. Fitur ini ditujukan bagi mereka yang ingin melakukan preorder buku sebelum buku benar-benar terbit atau untuk edisi cetak ulang buku.

Setiap akhir bulan, Ucok dan Butet perlu merekapitulasi preorder buku untuk selanjutnya dikirimkan ke penerbit. Di lain pihak, di setiap awal bulan, penerbit akan memberikan katalog buku yang akan tersedia pada akhir bulan dan dapat dipesan (preorder). Dengan demikian, di sepanjang bulan tersebut Ucok dan Butet dapat menerima preorder.

Katalog terdiri atas satu atau lebih informasi buku. Untuk setiap buku diidentifikasi dengan ISBN yang dilengkapi dengan harga dalam USD. Ucok dan Butet kemudian dapat mengumpulkan preorder buku-buku yang berada pada katalog.

Dalam melakukan pencatatan predorder, Ucok dan Butet memerlukan identifikasi buku dalam bentuk ISBN dan jumlah eksemplar yang dipesan. Selanjutnya, program akan menampilkan rekapitulasi dari pemesanan. Rekapitulasi dapat dilihat lebih langjut pada contoh.

**Batasan**
Untuk keperluan penyederhanaan, katalog yang diberikan penerbit akan selalu terdiri atas tepat 5 buku. Dengan demikian, pemesanan yang dapat dilakukan paling banyak untuk kelima buku pada katalog.

## Cara Kerja Program
Program terlebih dahulu akan membaca 10 baris masukan yang merepresentasikan 5 buah buku dalam katalog. Setiap buku informasinya disampaikan dalam dua baris masukan. Baris pertama merepresentasikan ISBN sementara baris kedua merupakan harga dari buku. Karena setiap buku direpresentasikan dengan dua baris, maka 5 buku akan direpresentasikan dengan 10 baris masukan.

Setelah katalog terisi, tahap berikutnya adalah mencatat preorder buku yang ada pada katalog. Program mampu menerima pemesanan satu atau lebih buku. Untuk setiap pemesanan direpresentasikan dalam dua baris masukan. Masukan baris pertama adalah ISBN dari buku yang ingin dipesan, sementara baris kedua mencerminkan jumlah eksemplar yang dipesan. Untuk menghentikan masukan, pengguna akan memberi ```---```.

## Tugas Anda

### Tugas 1 (10 pts)
Pada main flow, definisikan array variables yang akan digunakan di sepanjang eksekusi program.

### Tugas 2 (20 pts)
Kembangkan sebuah fungsi untuk menginisialisasi default value dari setiap array.

### Tugas 3 (20 pts) 
Kembangkan sebuah fungsi untuk membaca atau mengisi katalog.

### Tugas 4 (20 pts)
Kembangkan sebuah fungsi untuk membaca atau mengisi pesanan buku.

### Tugas 5 (30 pts)
Kembangkan sebuah fungsi untuk menghitung total harga buku pesanan dalam dua digit nilai presisi. Hint: gunakan builtin function ToFixed() yang telah disediakan.

### Example 1

**Input**:
```bash
979-8700048361
31.02
978-0130895929
6.11
978-0439708180
24.88
978-0593238295
41.01
978-0000000000
5.13
979-8700048361
2
978-0130895929
1
978-0439708180
5
---

```

**Output**:
```bash
192.55

```

### Example 2

**Input**:
```bash
979-8700048361
31.02
978-0130895929
6.11
978-0439708180
24.88
978-0593238295
41.01
978-0000000000
5.13
979-8700048361
2
978-0439708180
1
---

```

**Output**:
```bash
86.92

```

## Code Generation

Pada saat mengekspor Java code, gunakan template yang telah diberikan ```java-program-template.fpgt```.

## Reporting

Lakukan pertemuan dengan pair anda untuk mendiskusikan persoalan dan pengembangan solusi. Rekaman dari pertemuan tersebut menjadi bagian dari artefak tugas yang harus dikumpulkan. Durasi rekaman minimal 20 menit.

Presentasikan pekerjaan anda dalam sebuah video.
1. Setiap pair member harus berkontribusi dalam presentasi.
2. Jabarkan desain unit (functions) yang dikembangkan (mengapa unit tersebut perlu dikembangkan, apa parameternya, dsb.)
2. Jabarkan solusi anda (Flowgorithm).
3. Jabarkan kesulitan yang anda hadapi dalam rangka pengembangan solusi.

**Note**: Semakin tajam argumen dan penjabaran anda semakin mudah penilaian dilakukan.

**Kriteria Video Presentasi**:
+ 1080p/30fps, min. 10 menit.
+ Suara jernih dan dapat dengan jelas terdengar.
+ Posting video anda di YouTube, di-set "Not For Kids" dengan visibility Unlisted.

## Submissions:

1. X02.java
2. X02.fprg
3. changelog.txt

## How to Submit?

Please see https://youtu.be/cU546lAL9g8