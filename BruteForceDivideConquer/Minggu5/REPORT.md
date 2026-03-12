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
2. Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan! 
3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); ! 
4. Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF()  dan faktorialDC()! 


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
2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan! 
3. Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat, apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method pangkatBF() yang tanpa parameter? 
4. Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!

## 5.4 Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer
Di dalam percobaan ini, kita akan mempraktekkan bagaimana proses divide, conquer, dan combine diterapkan pada studi kasus penjumlahan keuntungan suatu perusahaan dalam beberapa bulan.

### 5.4.1. Langkah-langkah Percobaan 

### 5.4.2. Verifikasi Hasil Percobaan 

### 5.4.3. Pertanyaan 