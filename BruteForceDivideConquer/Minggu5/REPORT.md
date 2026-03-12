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
Pada praktikum ini kita akan membuat program class dalam Java, untuk menghitung nilai pangkat 
suatu angka menggunakan 2 jenis algoritma, Brute Force dan Divide and Conquer. 