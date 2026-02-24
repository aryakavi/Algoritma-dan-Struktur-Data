|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020087 |
| Nama |  Aryakavi Raditya Imaran |
| Kelas | TI - 1F |
| Repository | ([https://github.com/aryakavi/Algoritma-dan-Struktur-Data]) |

# JOBSHEET 2 : OBJECT
Mengenal objek dan class sebagai konsep mendasar pada pemrograman berorientasi objek

## 2.1 Percobaan 1: Deklarasi Class, Atribut dan Method  
Pada Percobaan 1 ini dilakukan pembuatan class beserta atribut dan method yang dimilikinya.

### 2.1.1 Langkah-langkah percobaan
Kode java untuk langkah langkah percobaan pertama sebagai berikut.

![Screenshot](Images/Percobaan1.png)

### 2.1.2 Verifikasi Hasil Percobaan
Sementara saat di jalankan kode tersebut akan mengeluarkan error seperti ini :

![Screenshot](Images/Errorpercobaan1.png)

### 2.1.3 Pertanyaan
- Sebutkan dua karakteristik class atau object!
Atribut : Data atau variabel yang mendefinisikan keadaan atau ciri dari objek (contoh : nama4, nim4, ipk4).
Method : Fungsi atau prosedur yang mendefinisikan perilaku atau apa yang dapat dilakukan oleh objek tersebut (contoh : tampilkanInformasi(), updateIpk()).

- Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class 
Mahasiswa? Sebutkan apa saja atributnya!
1. nama4 (String)
2. nim4 (String)
3. kelas4 (String)
4. ipk4 (double)

- Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
1. tampilkanInformasi()
2. ubahKelas(String kelasBaru4)
3. updateIpk(double ipkBaru4)
4. nilaiKinerja()



## 2.2 Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method
Sampai tahap ini, class Mahasiswa telah berhasil dibuat pada Percobaan 1. Selanjutnya, apabila 
class Mahasiswa tersebut ingin digunakan dan diakses atribut serta method-nya, maka perlu dibuat 
object/instance dari class Mahasiswa terlebih dahulu melalui proses instansiasi. 

### 2.2.1 Langkah-langkah percobaan
Kode java untuk langkah langkah percobaan pertama sebagai berikut.

![Screenshot](Images/Percobaan2.png)

### 2.2.2 Verifikasi Hasil Percobaan
Sementara saat di jalankan kode tersebut akan mengeluarkan hasil seperti ini :

![Screenshot](Images/Outputpercobaan2.png)

### 2.2.3 Pertanyaan
- Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?
```java
Mahasiswa04 mhs1 = new Mahasiswa04();
```
dan nama objek yang dihasulkan adalah mhs1.

- Bagaimana cara mengakses atribut dan method dari suatu objek?
Cara mengakses atribut dan method dari suatu objek adalah menggunakan operator titik (.) setelah nama objeknya. dengan sintaks **namaObjek.namaAtribut** atau **namaObjek.namaMethod()**
_contoh :_
_mengakses atribut:  mhs1.nama4 = "Muhammad Ali Farhan";_
_mengakses method: mhs1.tampilkanInformasi();_

- Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?
hasil output berbeda karena terjadi perubahan data pada objek mhs1 di antara pemanggil pertama dan kedua. 
1. Pada pemanggilan pertama, method tampilkanInformasi() mencetak data awal (Kelas: "SI 2J", IPK: 3.55).
2. Setelah itu, baris kode mhs1.ubahKelas("SI 2K"); dan mhs1.updateIpk(3.60); dijalankan. Kedua method ini mengubah nilai kelas4 dan ipk4 yang tersimpan di dalam mhs1.
Oleh karena itu, saat tampilkanInformasi() dipanggil kedua kalinya, ia mencetak data yang sudah diperbarui (Kelas: "SI 2K", IPK: 3.60).

## 2.3 Percobaan 3: Membuat Konstruktor
Pada percobaan ini, dilakukan pembuatan kode program untuk mengimplementasikan berbagai 
macam konstruktor berdasarkan parameternya. 

### 2.3.1 Langkah-langkah percobaan
Kode java untuk langkah langkah percobaan pertama sebagai berikut.

- Untuk perubahan pertama

![Screenshot](Images/Percobaan3A.png)

- Untuk perubahan kedua

![Screenshot](Images/Percobaan3B.png)

### 2.3.2 Verifikasi Hasil Percobaan
Sementara saat di jalankan kode tersebut akan mengeluarkan hasil seperti ini :

![Screenshot](Images/Outputpercobaan3.png)

### 2.3.3 Pertanyaan



## 2.4 Latihan Praktikum

### 2.4.1 Latihan 1 : MataKuliah
Kode java untuk langkah langkah percobaan pertama sebagai berikut.

![Screenshot](Images/Latihanpraktikum1A.png)
![Screenshot](Images/Latihanpraktikum1B.png)

Sementara saat di jalankan kode tersebut akan mengeluarkan hasil seperti ini :

![Screenshot](Images/Outputlatihanpraktikum1.png)

### 2.4.1 Latihan 2 : Dosen
Kode java untuk langkah langkah percobaan pertama sebagai berikut.

![Screenshot](Images/Latihanpraktikum2A.png)
![Screenshot](Images/Latihanpraktikum2B.png)

Sementara saat di jalankan kode tersebut akan mengeluarkan hasil seperti ini :

![Screenshot](Images/Outputlatihanpraktikum2.png)

# OUTRO
Sekian saya lampirkan kode saya untuk di nilai dan diberikan arahan, apabila ada masukkan atau kesalahan bisa kontak saya melalui

Whatsapp : 081358358676
Email    : aryakaviimaran2007@gmail.com

Terimakasih
