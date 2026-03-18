|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020087 |
| Nama |  Aryakavi Raditya Imaran |
| Kelas | TI - 1F |
| Repository | [https://github.com/aryakavi/Algoritma-dan-Struktur-Data] |

# JOBSHEET 5 : BRUTE FORCE DAN DIVIDE CONQUER
Setelah melakukan praktikum ini mahasiswa diharapkan mampu membuat algoritma bruteforce dan divide-conquer.

## 5.1 Tujuan Praktikum 
Setelah melakukan materi praktikum ini, mahasiswa mampu: 
1. Mahasiswa mampu membuat algoritma bruteforce dan divide-conquer 
2. Mahasiswa mampu menerapkan penggunaan algorima bruteforce dan divide-conquer 

## 5.2 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer 
Didalam praktikum ini, kita mencoba membuat kode untuk menghitung nilai faktorial suatu angka menggunakan 2 jenis algorita, Brute Fore dan Divide-conquer..

### 3.2.1 Langkah-langkah Percobaan
Berikut ini adalah kode sayah

faktorial.java
```java
package BruteForceDivideConquer.Minggu5;

public class Faktorial {
    int faktorialBF(int n){
        int fakto = 1;
        for(int i=1; i<=n; i++){
            fakto = fakto * i;
        }
    return fakto;
    }
    int faktorialDC(int n){
        if(n==1){
            return 1;
        }else{
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}
```

MainFaktorial.java
```java
package BruteForceDivideConquer.Minggu5;
import java.util.Scanner;
public class MainFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai: ");
        int nilai = input.nextInt();

        Faktorial fk = new Faktorial();
        System.out.println("Nilai faktorial "+nilai+" menggunakan BF: "+fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial "+nilai+" menggunakan DC: "+fk.faktorialDC(nilai));
        
    }
}
```


### 5.2.2. Verifikasi Hasil Percobaan 

Hasil running

```
Masukkan nilai: 5
Nilai faktorial 5 menggunakan BF: 120
Nilai faktorial 5 menggunakan DC: 120
PS D:\Algoritma-dan-Struktur-Data> 
```

### 5.2.3. Pertanyaan 
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else! 

    Penggunaan If pada facktorialDC() adalah sebagai base case, yaitu kembalian saat semua fungsi berjalan dan mengembalikan nilai tersebut. Dimana jika di kode tersebut n= 1, maka akan mengembalikan n bernilai 1 dan menghentikan rekursi. Sementara else digunakan untuk rekursif, yaitu saat nilai n>1 akan memecahkan masalah di n*faktorialDC(n-1) hingga n menjadi 1 dan menjalankan base case.

2. Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan!
    
    perulangan pada faktorialBF() bisa diganti dengan menggunakan while, yaitu dengan megubah kode FOR menjadi
    ```java
    while(i <= n){       // kondisi sama seperti for
        fakto = fakto * i;
        i++;             // increment manual
    }
    ```

3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); ! 
    
    | fakto *=i |   fakto = n*faktorialDC(n-1) |
    |---|---|
    | Perkalian iteratif (perulangan) |  Perkatlian rekursih (memanggil diri sendiri) |
    | Mengalikan fakto dengan i yang terus bertambah didalam loop | Mengalikan n dengan hasil pemanggil fungsi yang sama untuk n-1 |
    | Brute force | Divide & Conquer |
    | 1 -> 1x1 -> 2x3 -> 2x3 -> 6x4 = 24 | 4x (3x (2x (1))) = 24 |

4. Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF()  dan faktorialDC()!

    A. faktorialBF() merupakan method yang berjalan secara iteratif dengan perulangan for, dan arah hitunganya 1 -> n.
    B. faktorialDC() merupakan method yang berjalan secara rekursif dengan pemanggilan dirinya sendiri, dan arah hitungnya n -> 1.

## 5.3 Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer 
Pada praktikum ini kita akan membuat program class dalam Java, untuk menghitung nilai pangkat suatu angka menggunakan 2 jenis algoritma, Brute Force dan Divide and Conquer. 

### 5.3.1. Langkah-langkah Percobaan 

class Pangkat

```java
package BruteForceDivideConquer.Minggu5;

public class Pangkat {
    int nilai, pangkat;

    Pangkat(int n, int p){
        nilai = n;
        pangkat = p;
    }
    int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil*a;
        }
    return hasil;
    }
    int pangkatDC(int a, int n){
        if(n==1){
            return a;
        }else{
            if(n%2==1){
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2)*a);
            }else{
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2));
            }
        }
    }
}
```

class MainPangkat

```java
package BruteForceDivideConquer.Minggu5;
import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i <  elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-"+(i+1)+": ");
            int basis = input.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-"+(i+1)+": ");
            int pangkat = input.nextInt();
            png[i] = new Pangkat(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORE: ");
        for(Pangkat p : png){
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER: ");
        for(Pangkat p : png){
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
        }   
    }
}
```

### 5.3.2. Verifikasi Hasil Percobaan

hasil running

```
Masukkan jumlah elemen: 3
Masukkan nilai basis elemen ke-1: 2
Masukkan nilai pangkat elemen ke-1: 3
Masukkan nilai basis elemen ke-2: 4
Masukkan nilai pangkat elemen ke-2: 5
Masukkan nilai basis elemen ke-3: 6
Masukkan nilai pangkat elemen ke-3: 7
HASIL PANGKAT BRUTEFORE: 
2^3: 8
4^5: 1024
6^7: 279936
HASIL PANGKAT DIVIDE AND CONQUER: 
2^3: 8
4^5: 1024
6^7: 279936
PS D:\Algoritma-dan-Struktur-Data> 
```

### 5.3.3. Pertanyaan
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()! 

    | pangkatBF() | pangkatDC() |
    |---|---|
    | Perkalian iteratif (Brute Force) |  Perkatlian rekursif (Divide & Conquer) |
    | Kalikan a sebanyak n kali secara berulang | Pecah pangkat menjadi setengahnya, selesaikan, lalu gabungkan |
    | Perulangan for | Percabangan if-else + rekursi |

2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan! 

    Tahap combine sudah termasuk di tahapan Devide & Conquer di pangkat DC, sebagimana tahapan Devide & Conquer berupa :
        
        a. Divide   -> Membagi masalah menjadi masalah lebih kecil.
        b. Conquer  -> Menyelesaikan setiap sub masalah (rekursi).
        c. Combine  -> Menggabungkan hasil sub-masalah menjadi solusi akhir.

    ```java
    int pangkatDC(int a, int n){
    if(n == 1){
        return a;                           
    } else {
        if(n % 2 == 1){
            return (pangkatDC(a, n/2) * pangkatDC(a, n/2) * a);
        // Conquer dilakukan di pangkatDC(a, n/2) dan pangkatDC(a, n/2) * a)
        // Combine dilakukan dengan mengkalikan kedua rekursif tersebut dengan a

        } else {
            return (pangkatDC(a, n/2) * pangkatDC(a, n/2));
        // Conquer dilakukan di pangkatDC(a, n/2) dan pangkatDC(a, n/2) * a)
        // Combine dilakukan dengan mengkalikan kedua rekursif tersebut     
        }
    }
}
    ```

3. Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat, apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method pangkatBF() yang tanpa parameter? 

a. Relevansi parameter    
Menurut saya parameter kurang releva, karena nilai yang dikirim (p.nilai, p.pangkat) adalah atribut yang sudah dimiliki objek itu sendiri. Menyebabkan data yang sama disimpan dua kali 
```java
// Method memiliki parameter (a,n)
int pangkatBF(int a, int n) { ... }
// Dipanggil di :
p.pangkatBF(p.nilai, p.pangkat)
// atribut kelas (p.nilai, p.pangkat) dioper dengan atribut yang sudah ada di kelas
```

b. Bukti pangkatBF() bisa Dibuat Tanpa Parameter

```java
// Method tanpa parameter langsung akses atribut kelas
int pangkatBF() {
    int hasil = 1;
    for (int i = 0; i < pangkat; i++) {  // langsung pakai atribut 'pangkat'
        hasil = hasil * nilai;            // langsung pakai atribut 'nilai'
    }
    return hasil;
}
```

c. Penyesuaian di MainPangkat.java
```java
// Sebelum
System.out.println("HASIL PANGKAT BRUTEFORE: ");
        for(Pangkat p : png){
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF(p.nilai, p.pangkat));
        }

// Sesudah 
System.out.println("HASIL PANGKAT BRUTEFORE: ");
        for(Pangkat p : png){
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF());
        }
```


4. Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!

| pangkatBF() | pangkatDC() |
|---|---|
| Brute Force |  Divide & Conquer |
| Iterasi  | Rekursi |
| Perulangan for | Percabangan if-else + rekursi |
| Maju (1 → n) | Turun (n → 1) |
| 0(n) | 0(log n) |

a. pangkatBF() bekerja dengan cara sederhana dan langsung: kalikan basis (a) sebanyak n kali menggunakan perulangan.

b. pangkatDC() bekerja dengan strategi pecah dan gabungkan pangkat dibagi dua di setiap level rekursi sehingga jumlah perkalian berkurang secara drastis.


## 5.4 Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer
Di dalam percobaan ini, kita akan mempraktekkan bagaimana proses divide, conquer, dan combine diterapkan pada studi kasus penjumlahan keuntungan suatu perusahaan dalam beberapa bulan.

### 5.4.1. Langkah-langkah Percobaan 

class sum

```java
package BruteForceDivideConquer.Minggu5;

public class Sum {
    double keuntungan[];
    Sum(int el){
        keuntungan = new double[el];
    }
    double totalBF(){
        double total=0;
        for (int i = 0; i < keuntungan.length; i++) {
            total = total+keuntungan[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r){
        if(l==r){
            return arr[l];
        }

        int mid = (l+r)/2;
        double lsum = totalDC(arr, l, mid);
        double rsum = totalDC(arr, mid+1, r);
        return lsum+rsum;
    }
}
```

class mainsum 

```java
package BruteForceDivideConquer.Minggu5;
import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();
        Sum sm = new Sum(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = input.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan Bruteforce: "+sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: "+sm.totalDC(sm.keuntungan, 0 , elemen-1)); 
    }
}
```


### 5.4.2. Verifikasi Hasil Percobaan 

Hasil running kode

```
Masukkan jumlah elemen: 5
Masukkan keuntungan ke-1: 10
Masukkan keuntungan ke-2: 20
Masukkan keuntungan ke-3: 30
Masukkan keuntungan ke-4: 40
Masukkan keuntungan ke-5: 50
Total keuntungan menggunakan Bruteforce: 150.0
Total keuntungan menggunakan Divide and Conquer: 150.0
PS D:\Algoritma-dan-Struktur-Data> 
```


### 5.4.3. Pertanyaan 
1. Kenapa dibutuhkan variable mid pada method TotalDC()? 

    mid berfungsi sebagai titik tengah array yang memisahkan array menjadi dua bagian kiri dan kanan agar bisa diproses secara terpisah.

    ```java
    int mid = (l + r) / 2;
    ```
    ```
    Contoh array dengan 6 elemen `[10, 20, 30, 40, 50, 60]`:
    
    Index :  0    1    2    3    4    5
    Array : [10,  20,  30,  40,  50,  60]
    
    mid = (0+5)/2 = 2
    Kiri  : [10, 20, 30]   -> index 0 sampai 2  (l=0, r=mid=2)
    Kanan : [40, 50, 60]   -> index 3 sampai 5  (l=mid+1=3, r=5)

    Tanpa mid, tidak ada cara untuk menentukan batas pembagian array, sehingga proses Divide & Conquer tidak bisa dilakukan.
    ```

2. Untuk apakah statement di bawah ini dilakukan dalam TotalDC()? 
```java
double lsum = totalDC(arr, l, mid);
double rsum = totalDC(arr, mid+1, r);
```

| Variabel | Tahap | Fungsi |
|----------|-------|--------|
| `lsum` | Divide + Conquer | Memecah dan menghitung total separuh kiri array secara rekursif |
| `rsum` | Divide + Conquer | Memecah dan menghitung total separuh kanan array secara rekursif |

Setiap pemanggilan rekursif terus memecah array hingga tersisa 1 elemen (base case), lalu hasilnya dikembalikan ke atas.

3. Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini? 
```java
return lsum+rsum;
```

Karena agar Divide and Conquer bisa berkerja maka di hasil akhir memerlukan tahapan combine, dengan menggabungkan hasil dari dua sub-masalah menjadi  satu jawaban akhir.

Tanpa lsum + rsum, hasil dari sub-masalah tidak pernah digabungkan, sehingga jawaban akhir tidak akan pernah terbentuk.

4. Apakah base case dari totalDC()?

```java
if(l==r){
    return arr[1];
}
```

Base case terjadi ketika 'l == r', yaitu saay bagian array yang sedang diproses hnya tinggal 1 elemen. Pada kondisi ini, tidak diperlukan lagi membagi array langsung kembalikan nilai elemen tersebut.


5. Tarik Kesimpulan tentang cara kerja totalDC() 

| JENIS | PENGERTIAN |
|---|---|
| DIVIDE | Hitung mid, bagi array menjadi kiri dan kanan |
| CONQUER | Panggil totalDC() rekursif pada tiap bagian |
| COMBINE | Jumlahkan lsum + rsum untuk hasil akhir |

## 4.4 Latihan Praktikum
1. Sebuah kampus memiliki daftar nilai mahasiswa dengan data sesuai tabel di bawah ini
    Tentukan: 
    
    a) Nilau UTS tertinggi tertinggi menggunakan Divide and Conquer! 
    
    b) Nilai UTS terendah menggunakan Divide and Conquer! 
    
    c) Rata-rata nilai UAS dari semua mahasiswa menggunakan Brute Force!


Class Mahasiswa
```java
package BruteForceDivideConquer.Minggu5;

public class Mahasiswa {
    String nama;
    int nim, tahunMasuk, nilaiUTS, nilaiUAS;

    Mahasiswa(String nama, int nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama       = nama;
        this.nim        = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS   = nilaiUTS;
        this.nilaiUAS   = nilaiUAS;
    }

    int maxUTSDC(Mahasiswa[] arr, int l, int r) {
        if (l == r) {                          
            return arr[l].nilaiUTS;
        }
        int mid   = (l + r) / 2;
        int lMax  = maxUTSDC(arr, l, mid);    
        int rMax  = maxUTSDC(arr, mid + 1, r);
        return Math.max(lMax, rMax);           
    }

    int minUTSDC(Mahasiswa[] arr, int l, int r) {
        if (l == r) {                          
            return arr[l].nilaiUTS;
        }
        int mid   = (l + r) / 2;
        int lMin  = minUTSDC(arr, l, mid);    
        int rMin  = minUTSDC(arr, mid + 1, r);
        return Math.min(lMin, rMin);           
    }

    double rataUASBF(Mahasiswa[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i].nilaiUAS;   
        }
        return total / arr.length;           
    }
}
```


class MainMahasiswa
```java
package BruteForceDivideConquer.Minggu5;

public class MainMahasiswa {
    public static void main(String[] args) {

        Mahasiswa[] mhs = {
            new Mahasiswa("Ahmad", 220101001, 2022, 78, 82),
            new Mahasiswa("Budi",  220101002, 2022, 85, 88),
            new Mahasiswa("Cindy", 220101003, 2021, 90, 87),
            new Mahasiswa("Dian",  220101004, 2021, 76, 79),
            new Mahasiswa("Eko",   220101005, 2023, 92, 95),
            new Mahasiswa("Fajar", 220101006, 2020, 88, 85),
            new Mahasiswa("Gina",  220101007, 2023, 80, 83),
            new Mahasiswa("Hadi",  220101008, 2020, 82, 84)
        };

        Mahasiswa m = new Mahasiswa("", 0, 0, 0, 0);
        int n = mhs.length;

        int maxUTS = m.maxUTSDC(mhs, 0, n - 1);
        System.out.println("a) Nilai UTS Tertinggi (DC) : " + maxUTS);

        int minUTS = m.minUTSDC(mhs, 0, n - 1);
        System.out.println("b) Nilai UTS Terendah  (DC) : " + minUTS);

        double rataUAS = m.rataUASBF(mhs);
        System.out.println("c) Rata-rata UAS (BF)       : " + rataUAS);
    }
}
```


Hasil Running
```
a) Nilai UTS Tertinggi (DC) : 92
b) Nilai UTS Terendah  (DC) : 76
c) Rata-rata UAS (BF)       : 85.375
PS D:\Algoritma-dan-Struktur-Data> 
```
    