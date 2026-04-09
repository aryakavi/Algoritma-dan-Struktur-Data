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
1. Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class  MahasiswaBerprestasi! 
2. Jelaskan fungsi break pada kode program di bawah ini!  
```JAVA
if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
```
3. Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search? 
4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang  dibuat di atas akan menampilkan data ke berapa? Jelaskan. 
5. Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari kode di atas?

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
2. Tunjukkan pada kode program yang mana proses conquer dijalankan! 
3. Apa fungsi left, right, dan mid? 
4. Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian? 
5. Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai 
6. Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam array. 
7. Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan dari keyboard.