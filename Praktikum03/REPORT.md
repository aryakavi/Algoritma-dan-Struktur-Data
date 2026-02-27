|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020087 |
| Nama |  Aryakavi Raditya Imaran |
| Kelas | TI - 1F |
| Repository | [https://github.com/aryakavi/Algoritma-dan-Struktur-Data] |

# JOBSHEET 3 : ARRAY OF OBJECT
Memahami fungsi array yang berisikan variabel object, menerapkan instansiasi array of objects dalam Java, melakukan operasi terhadap elemen dalam array of objects

## 3.1 Tujuan Praktikum 
Setelah melakukan materi praktikum ini, mahasiswa mampu: 
1. Memahami dan menjelaskan fungsi array yang berisikan variabel object. 
2. Mahasiswa mampu menerapkan instansiasi array of objects dalam Java 
3. Mahasiswa mampu melakukan operasi terhadap elemen dalam array of objects.

## 3.2 Membuat Array dari Object, Mengisi dan Menampilkan 
Didalam praktikum ini, kita akan mempraktekkan bagaimana membuat array of objects, kemudian mengisi dan menampilkan array tersebut.

### 3.2.1 Langkah-langkah Percobaan
Berikut ini adalah kode sayah

class Mahasiswa04.java

```Java
package Praktikum03;

public class Mahasiswa04{
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;
}
```

class MahasiswaDemo04.java

```Java
package Praktikum03;

public class MahasiswaDemo04{
    public static void main(String[] args) {
        Mahasiswa04[] arrayOfMahasiswa = new Mahasiswa04[3];
        arrayOfMahasiswa[0] = new Mahasiswa04 ();
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].kelas = "SIB-1E";
        arrayOfMahasiswa[0].ipk = (float) 3.75;
        arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        
        arrayOfMahasiswa[1] = new Mahasiswa04 ();
        arrayOfMahasiswa[1].nim = "2341720172";
        arrayOfMahasiswa[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa[1].kelas = "TI-2A";
        arrayOfMahasiswa[1].ipk = (float) 3.36;

        arrayOfMahasiswa[2] = new Mahasiswa04 ();
        arrayOfMahasiswa[2].nim = "244107023006";
        arrayOfMahasiswa[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa[2].kelas = "TI-2E";
        arrayOfMahasiswa[2].ipk = (float) 3.80;

        System.out.println ("NIM        : "+ arrayOfMahasiswa[0].nim) ;
        System.out.println ("Nama       : "+ arrayOfMahasiswa[0].nama);
        System.out.println ("Kelas      : "+ arrayOfMahasiswa[0].kelas);
        System.out.println ("IPK        : "+ arrayOfMahasiswa[0].ipk);
        System.out.println ("------------------------------------------") ;
        System.out.println ("NIM        : "+ arrayOfMahasiswa[1].nim);
        System.out.println ("Nama       : "+ arrayOfMahasiswa[1].nama);
        System.out.println ("Kelas      : "+ arrayOfMahasiswa[1].kelas);
        System.out.println ("IPK        : "+ arrayOfMahasiswa[1].ipk);
        System.out.println ("------------------------------------------") ;
        System.out.println ("NIM        : "+ arrayOfMahasiswa[2].nim);
        System.out.println ("Nama       : "+ arrayOfMahasiswa[2].nama);
        System.out.println ("Kelas      : "+ arrayOfMahasiswa[2].kelas);
        System.out.println ("IPK        : "+ arrayOfMahasiswa[2].ipk);
        System.out.println ("------------------------------------------") ;
    }
}
```

### 3.2.2 Verifikasi Hasil Percobaan 

Hasil output 

```
NIM        : 244107060033
Nama       : AGNES TITANIA KINANTI
Kelas      : SIB-1E
IPK        : 3.75
------------------------------------------
NIM        : 2341720172
Nama       : ACHMAD MAULANA HAMZAH
Kelas      : TI-2A
IPK        : 3.36
------------------------------------------
NIM        : 244107023006
Nama       : DIRHAMAWAN PUTRANTO
Kelas      : TI-2E
IPK        : 3.8
------------------------------------------
PS D:\Algoritma-dan-Struktur-Data>
```

### 3.2.3 Pertanyaan 
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan! 

2. Apa yang dilakukan oleh kode program berikut? 
```java
Mahasiswa[] arrayOfMahasiswa = new Mahasiswa [3];
```

3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan konstruktur pada baris program berikut? 
```java
arrayOfMahasiswa[0] = new Mahasiswa04 ();
```

4. Apa yang dilakukan oleh kode program berikut? 
```java
        arrayOfMahasiswa[0] = new Mahasiswa04 ();
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].kelas = "SIB-1E";
        arrayOfMahasiswa[0].ipk = (float) 3.75;
```

5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2? 




## 3.3 Menerima Input Isian Array Menggunakan Looping
Pada praktikum ini kita akan mengubah hasil program dari praktikum 3.2 sehingga program dapat menerima input dan menggunakan looping untuk mengisikan atribut dari semua objek Mahasiswa 

### 3.3.1 Langkah-langkah Percobaan

Perubahan yang saya lakukan di MahasiswaDemo04.java

```java
package Praktikum03;
import java.util.Scanner;

public class MahasiswaDemo04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa04[] arrayOfMahasiswa = new Mahasiswa04[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa04 ();
            
            System.out.println ("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print ("NIM       : ");
            arrayOfMahasiswa[i].nim = sc.nextLine ();
            System.out.print ("Nama      : ") ;
            arrayOfMahasiswa[i].nama = sc.nextLine ();
            System.out.print ("Kelas     : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine ();
            System.out.print ("IPK       : ");
            dummy = sc.nextLine () ;
            arrayOfMahasiswa[i].ipk = Float.parseFloat (dummy);
            System.out.println ("---------------------------");
        }
        
        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            System.out.println ("Data Mahasiswa ke-" + (i + 1));
            System.out.println ("NIM        : "+ arrayOfMahasiswa[i].nim);
            System.out.println ("Nama       : "+ arrayOfMahasiswa[i].nama);
            System.out.println ("Kelas      : "+ arrayOfMahasiswa[i].kelas);
            System.out.println ("IPK        : "+ arrayOfMahasiswa[i].ipk);
            System.out.println ("--------------------------------------");
        }
    sc.close();
    }
}
```

### 3.3.2 Verifikasi Hasil Percobaan

```
Masukkan Data Mahasiswa ke-1
NIM       : 244107060033
Nama      : AGNES TITANIA KINANTI
Kelas     : SIB-1E
IPK       : 3.75
---------------------------
Masukkan Data Mahasiswa ke-2
NIM       : 2341720172
Nama      : ACHMAD MAULANA HAMZAH
Kelas     : TI-2A
IPK       : 3.36
---------------------------
Masukkan Data Mahasiswa ke-3
NIM       : 244107023006
Nama      : DIRHAMAWAN PUTRANTO
Kelas     : TI-2E
IPK       : 3.80
---------------------------
Data Mahasiswa ke-1
NIM        : 244107060033
Nama       : AGNES TITANIA KINANTI
Kelas      : SIB-1E
IPK        : 3.75
--------------------------------------
Data Mahasiswa ke-2
NIM        : 2341720172
Nama       : ACHMAD MAULANA HAMZAH
Kelas      : TI-2A
IPK        : 3.36
--------------------------------------
Data Mahasiswa ke-3
NIM        : 244107023006
Nama       : DIRHAMAWAN PUTRANTO
Kelas      : TI-2E
IPK        : 3.8
--------------------------------------
PS D:\Algoritma-dan-Struktur-Data> 
```

### 3.3.3 Pertanyaan
1. Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program pada langkah no 3. 
2. Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error? 
```java
        Mahasiswa04[] arrayOfMahasiswa = new Mahasiswa04[3];
        arrayOfMahasiswa[0] = new Mahasiswa04 ();
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].kelas = "SIB-1E";
        arrayOfMahasiswa[0].ipk = (float) 3.75;
```



## 3.4 Constructor Berparameter 
Pada praktikum ini kita akan melakukan instansiasi variable array of object dengan menggunakan constructor berparameter.

### 3.4.1 Langkah-langkah Percobaan

Berikut kode percobaan

```java
```