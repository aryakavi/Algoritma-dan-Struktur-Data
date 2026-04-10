|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020087 |
| Nama |  Aryakavi Raditya Imaran |
| Kelas | TI - 1F |
| Repository | [https://github.com/aryakavi/Algoritma-dan-Struktur-Data] |

# JOBSHEET 6 - SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)
Praktikum ini mengajarkan algoritma untuk searching

## 6.1  Tujuan Praktikum 
Setelah melakukan materi praktikum ini, mahasiswa mampu: 
a. Menjelaskan mengenai algoritma Searching. 
b. Membuat dan mendeklarasikan struktur algoritma Searching. 
c. Menerapkan dan mengimplementasikan algoritma Searching. 

## 6.2 Searching/ Pencarian Menggunakan Algoritma Sequential Search
Percobaan sorting Bubble sort, Selection sort, dan Insertion sort

### 6.2.1. Langkah-langkah Percobaan Sequential Search

Penambahan pada class MahasiswaBerprestasi04 dengan menambahkan kode dibawah method bubblesort
```JAVA
(...)
    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("data mahasiswa dengan IPK : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
}
```

Perubahan untuk class MahasiswaDemo04
```JAVA
package BruteForceDivideConquer.Praktikum05;
import java.util.Scanner;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMhs=5;
        MahasiswaBerprestasi04 list = new MahasiswaBerprestasi04(jumlahMhs);

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("\n--- Masukkan Data Mahasiswa ke-" + (i + 1) + " ---");
            
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 
            
            Mahasiswa04 m = new Mahasiswa04(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        list.tampil();
        System.out.println("--------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
        
        sc.close();
}
}
```

### 6.2.2 Verifikasi Hasil Percobaan

Hasil running
```
--- Masukkan Data Mahasiswa ke-1 ---
NIM   : 111
Nama  : adi
Kelas : 2
IPK   : 3.6

--- Masukkan Data Mahasiswa ke-2 ---
NIM   : 222
Nama  : tio
Kelas : 2
IPK   : 3.8

--- Masukkan Data Mahasiswa ke-3 ---
NIM   : 333
Nama  : ila
Kelas : 2
IPK   : 3.0

--- Masukkan Data Mahasiswa ke-4 ---
NIM   : 444
Nama  : liaa
Kelas : 2
IPK   : 3.5

--- Masukkan Data Mahasiswa ke-5 ---
NIM   : 555
Nama  : fia
Kelas : 2
IPK   : 3.3
Nama: adi
NIM: 111
Kelas: 2
IPK: 3.6
-----------------------------
Nama: tio
NIM: 222
Kelas: 2
IPK: 3.8
-----------------------------
Nama: ila
NIM: 333
Kelas: 2
IPK: 3.0
-----------------------------
Nama: liaa
NIM: 444
Kelas: 2
IPK: 3.5
-----------------------------
Nama: fia
NIM: 555
Kelas: 2
IPK: 3.3
-----------------------------
--------------------------------------------------
Pencarian data
--------------------------------------------------
masukkan ipk mahasiswa yang dicari: 
IPK: 3.5
menggunakan sequential searching
data mahasiswa dengan IPK : 3.5 ditemukan pada indeks 3
nim      : 444
nama     : liaa
kelas    : 2
ipk      : 3.5
```

### 6.2.3. Pertanyaan
1. Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class MahasiswaBerprestasi!

- tampilPosisi = Berfungsi hanya untuk memberi informasi letak indeks (posisi) dari data IPK yang dicari di dalam array. Output berupa teks biasa (contohnya : " Ditemukan pada indeks X")
- tampilDataSearch = Berfungsi untuk menampilkan rincian data Mahasiswa dengan lengkap (NIM, Nama, Kelas, dan IPK) yang ada pada indeks hasil pencarian tersebut, dengan mengakses listMhs[pos].

2. Jelaskan fungsi break pada kode program di bawah ini!  
```JAVA
if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
```

Fungsi break adalah untuk menghentikan perulangan (for loop) dengan paksa ketika data yang dicari sudah ditemukan. Break membantu program menjadi lebih efisien dalam waktu karena tidak perlu memerika sisa elemen array di sebelah kanannya.

3. Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?

Variabel pos berfungsi sebagai penunjuk lokasi suatu data di dalam array. Variabel pos digunakan sebagai akses untuk listMhs[pos] mengambil atau mengoutput nilai detail dari objek mahasiswa tersebut. 

4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang  dibuat di atas akan menampilkan data ke berapa? Jelaskan.

Jika ada dua atau lebih mahasiswa dengan IPK yang sama, program akan menampilkan data yang paling awal ditemukan (data dengan nomor indeks terkecil). Ini karena perulangan jalam dari indeks 0 ke indeks akhir, dan perintah break akan langsung menghentikan kode dan menyimpan penemuan pertama dan mengabaikan data kembar di indeks berikutnya

5. Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari kode di atas?

Jika break dihilangkan, maka program akan terus scanning atau memindai array hingga batas akhir (listMhs.length) meski data sudah ditemukan. Jika ada data double atau ganda, nilai variabel posisi akan tertimpa dengan searching terbaru. Sehingga program akan menampilkan data yang paling akhir ditemukan.

## 6.3 Searching/ Pencarian Menggunakan Algoritma Binary Search

### 6.3.1. Langkah-langkah Percobaan Binary Search 

Penambahan method findBinarySearch di class MahasiswaBerprestasi04
```JAVA
(...)
int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            } else if (listMhs[mid].ipk > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
```

Perubahan untuk outputan di bagian MahasiswaDemo04
Sebelum :
```JAVA
(...)
        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
        
        sc.close();
    }
}
```

Sesudah :
```JAVA
(...)
        System.out.println("--------------------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("--------------------------------------------------");
        double posisi2 = list.findBinarySearch(cariBinary, 0, jumMhs - 1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cariBinary, pss2);
        list.tampilDataSearch(cariBinary, pss2);
        
        sc.close();
    }
}
```
### 6.3.2. Verifikasi Hasil Percobaan
```
--- Masukkan Data Mahasiswa ke-1 ---
NIM   : 111
Nama  : adi
Kelas : 2
IPK   : 3.1

--- Masukkan Data Mahasiswa ke-2 ---
NIM   : 222
Nama  : ila
Kelas : 2
IPK   : 3.2

--- Masukkan Data Mahasiswa ke-3 ---
NIM   : 333
Nama  : lia
Kelas : 2
IPK   : 3.3

--- Masukkan Data Mahasiswa ke-4 ---
NIM   : 444
Nama  : susi
Kelas : 2
IPK   : 3.5

--- Masukkan Data Mahasiswa ke-5 ---
NIM   : 555
Nama  : anita
Kelas : 2
IPK   : 3.7
Nama: adi
NIM: 111
Kelas: 2
IPK: 3.1
-----------------------------
Nama: ila
NIM: 222
Kelas: 2
IPK: 3.2
-----------------------------
Nama: lia
NIM: 333
Kelas: 2
IPK: 3.3
-----------------------------
Nama: susi
NIM: 444
Kelas: 2
IPK: 3.5
-----------------------------
Nama: anita
NIM: 555
Kelas: 2
IPK: 3.7
-----------------------------
--------------------------------------------------
Pencarian data
--------------------------------------------------
masukkan ipk mahasiswa yang dicari: 
IPK: 3.7
--------------------------------------------------
menggunakan binary search
--------------------------------------------------
data mahasiswa dengan IPK : 3.7 ditemukan pada indeks 4
nim      : 555
nama     : anita
kelas    : 2
ipk      : 3.7
PS D:\Algoritma-dan-Struktur-Data> 
```

### 6.3.3. Pertanyaan 
1. Tunjukkan pada kode program yang mana proses divide dijalankan! 

Proses devide (pembagian searching) terjadi pada baris titik tengah (mid) dan pemanggilan fungsi rekursif yang membelah array menjadi 2 bagian. Kode  ini ada pada class MahasiswaBerprestasi04 : 
```JAVA
// Menentukan titk tengah untuk dipotong
mid = (left + right) / 2; 
// ...
// Membagi ke bagian kiri
return findBinarySearch(cari, left, mid - 1); 
// ...
// Membagi ke bagian kanan
return findBinarySearch(cari, mid + 1, right); 
```

2. Tunjukkan pada kode program yang mana proses conquer dijalankan! 

Conquer atau penyelesaian masalah dijalankan saat nilai tenga (mid) diverifikasi atau divalidasi dengan dnilai yang dicari, sehingga pencarian dihentikan dan indeks dikembalikan
```JAVA
if (cari == listMhs[mid].ipk) {
    return (mid);
}
```

3. Apa fungsi left, right, dan mid?

A. Left = Indeks batas kiri dari array yang dicari.

B. Right = Indeks batas kanan dari array yang dicari.

C. Mid = Indeks titik tengah antara left dan right yang digunakan untuk acuan pembanding dan area pencarian

4. Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian?

Program akan tetap berjalan namun hasil outputnya akan tetap salah. Algorithm Binary Search bekerja jika data sudah terurut. Jika data acak, logika untuk mengeliminasi setengah array menjadi tidak relevan, sehingga nilai yang sebenarnya ada di dalam array tidak ditemukan.

5. Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai 

Hasil dari kode yang ada saat ini tidak akan sesuai jika memakai descendig. Kode yang ditulis memiliki aasumsi bahwa data ascending. Contohnya mid 3.5 dan mencari 3.2, di kode yanga da saat ini pasti mengevaluasi 3.5 > 3.2 dan bergeser mencari ke kiri (mid - 1). Padahal, di susunan data descending nilai 3.2 ada di sebelah kanan.

Kode yang diubah yaitu pada class MahasiswaBerprestasi04 yang sebelumnya
```JAVA
   int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            } else if (listMhs[mid].ipk > cari) {
                // Jika mid lebih besar dari target, cari ke kiri (karena kiri angka lebih besar)
                return findBinarySearch(cari, left, mid - 1);
            } else {
                // Jika mid lebih kecil dari target, cari ke kanan (karena kanan angka lebih kecil)
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
```

diubah menjadi 
```JAVA
int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            } else if (listMhs[mid].ipk < cari) { 
                // Jika mid lebih kecil dari target, cari ke kiri (karena kiri berisi angka lebih besar)
                return findBinarySearch(cari, left, mid - 1);
            } else {
                // Jika mid lebih besar dari target, cari ke kanan (karena kanan berisi angka lebih kecil)
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
```

6. Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam array.

Data tidak ditemukan apabila batas kiri (left) sudah melewati batas kanan (right). Hal ini dapat diketahui pada kondisi awal di persyaratan if(right >= left). Jika kondisi ini salah (left > right), maka tempat pencarian sudah habis dan tidak ada elemen tersisa untuk dicari atau di cek. Program akan keluar dari blok if dan menjalankan return -1;

7. Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan dari keyboard.
Mengubah bagian awal pada fungsi main di dalam class MahasiswaDemo04 untuk menerima input angka dengan scanner. Kode yang diubah adalah bagian :
```JAVA
(...)
package BruteForceDivideConquer.Praktikum05;
import java.util.Scanner;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumMhs=5;
        MahasiswaBerprestasi04 list = new MahasiswaBerprestasi04(jumMhs);
(...)
```

Diubah menjadi
```JAVA
(...)
package BruteForceDivideConquer.Praktikum05;
import java.util.Scanner;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Menambahkan sout untuk menginput
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt(); //Tempat memasukkan inputan mahsiswa
        sc.nextLine();

        MahasiswaBerprestasi04 list = new MahasiswaBerprestasi04(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
(...)
```