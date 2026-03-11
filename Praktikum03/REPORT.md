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
    
    Tidak harus, class bisa hanya memiliki atribut saja (contohnya Mahasiswa04), hanya methos saja, atau keduanya. Yang penting adalah class tersebut bisa digunakan untuk membuat objek. Di uji 3.2, Mahasiswa04 hanya memiliki atribut dan tetap bisa dibuat array of objectnya.

2. Apa yang dilakukan oleh kode program berikut? 
```java
Mahasiswa[] arrayOfMahasiswa = new Mahasiswa [3];
``` 

    Kode diatas membuat elemen array bernama arrayOfMahasiswa yang mampu menampung 3 objek dengan tipe Mahasiswa04. Array tersebut masih belum ada objeknya dan isi array masih null.

3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan konstruktur pada baris program berikut? 
```java
arrayOfMahasiswa[0] = new Mahasiswa04 ();
```

    Mahasiswa04 tidak memiliki konstruktor yang tertulis, tapi tetap bisa dipanggil new Mahasiswa04() karena Java secara otomatis menyediakan konstruktor defaultnya apabila tidak dituliskan konstruktornya.

4. Apa yang dilakukan oleh kode program berikut? 
```java
        arrayOfMahasiswa[0] = new Mahasiswa04 ();
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].kelas = "SIB-1E";
        arrayOfMahasiswa[0].ipk = (float) 3.75;
```

    Baris 1 : Membuat objek Mahasiswa 04 baru dan disimkan ke index-0
    Baris 2 : Mengisi atribut nim (Int) dengan 44107060033
    Baris 3 : Mengisi atribut kelas dengan SIB-1E
    Baris 4 : Mengisi atribut ipk dengan 3.75, dan di masukkan ke float karena nilai desimal awal berupa double

5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2? 

    Karena mengikuti prinsip pemisahan, yaitu:
    A. Mahasiswa04 bertanggung jawab sebagai blueprint data mahasiswa (atribut)
    B.  MahasiswaDemo04 bertanggung jawab sebagai pengendali program (input, proses, output)
    Dengan dipisah, kode lebih terorganisir dan class Mahasiswa04 bisa digunakan di program lain tanpa mengubah apapun.




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

class Matakuliah04.java

```java
package Praktikum03;

public class Matakuliah04 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah04(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
```

class MataKuliah04.java

```java
package Praktikum03;
import java.util.Scanner;
public class MatakuliahDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah04[] arrayOfMatakuliah = new Matakuliah04[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy); 
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------------------");

            arrayOfMatakuliah[i] = new Matakuliah04(kode, nama, sks, jumlahJam);
        }
           for (int i = 0; i < 3; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.println("Kode       : " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama       : " + arrayOfMatakuliah[i].nama);
            System.out.println("Sks        : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("------------------------------------------");
        }
    sc.close();
    }
}
'''

### 3.4.2 Verifikasi Hasil Percobaan 
``` Masukkan Data Matakuliah ke-1
Kode       : 12345
Nama       : Algoritma 7 Struktur Data
Sks        : 2
Jumlah Jam : 6
------------------------------------------
Masukkan Data Matakuliah ke-2
Kode       : 54321
Nama       : Sistsem Basis Data
Sks        : 2
Jumlah Jam : 4
------------------------------------------
Masukkan Data Matakuliah ke-3
Kode       : 83652
Nama       : Dasar pemrograman
Sks        : 2
Jumlah Jam : 4
------------------------------------------
Data Matakuliah ke-1
Kode       : 12345
Nama       : Algoritma 7 Struktur Data
Sks        : 2
Jumlah Jam : 6
------------------------------------------
Data Matakuliah ke-2
Kode       : 54321
Nama       : Sistsem Basis Data
Sks        : 2
Jumlah Jam : 4
------------------------------------------
Data Matakuliah ke-3
Kode       : 83652
Nama       : Dasar pemrograman
Sks        : 2
Jumlah Jam : 4
------------------------------------------
PS D:\Algoritma-dan-Struktur-Data> 
```

### 3.4.3 Pertanyaan 
1. Apakah suatu class dapat memiliki lebih dari 1 constructor? Jika iya, berikan contohnya 
Iya, bisa. Sebuah class dapat memiliki beberapa constructor asalkan jumlah atau tipe parameter (signature) yang digunakan berbeda dengan satu sama lain. Contohnya :
```Java
public class Matakuliah04 {
    public String kode;
    public String nama;

    // Constructor 1: Tanpa parameter (Default)
    public Matakuliah04() { }

    // Constructor 2: Dengan parameter
    public Matakuliah04(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
```

2. Tambahkan method tambahData() pada class Matakuliah, kemudian gunakan method tersebut di class MatakuliahDemo untuk menambahkan data Matakuliah 
```java
public void tambahData(Scanner sc) {
        System.out.print("Kode       : ");
        this.kode = sc.nextLine();
        System.out.print("Nama       : ");
        this.nama = sc.nextLine();
        System.out.print("Sks        : ");
        this.sks = sc.nextInt(); sc.nextLine();
        System.out.print("Jumlah Jam : ");
        this.jumlahJam = sc.nextInt(); sc.nextLine();
        System.out.println("------------------------------------------");
    }
```

3. Tambahkan method cetakInfo() pada class Matakuliah, kemudian gunakan method tersebut di class MatakuliahDemo untuk menampilkan data hasil inputan di layar
```java
public void cetakInfo() {
    System.out.println("Kode        : " + this.kode);
    System.out.println("Nama        : " + this.nama);
    System.out.println("SKS         : " + this.sks);
    System.out.println("Jumlah jam  : " + this.jumlahJam);
    System.out.println("-----------------------------------------------");
} 
``` 

4. Modifikasi kode program pada class MatakuliahDemo agar panjang (jumlah elemen) dari array of object Matakuliah ditentukan oleh user melalui input dengan Scanner 
```java
package Praktikum03;
import java.util.Scanner;
public class MatakuliahDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int jumlah = sc.nextInt(); sc.nextLine();
        Matakuliah04[] arrayOfMatakuliah = new Matakuliah04[jumlah];
        String kode, nama;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            sks = sc.nextInt(); sc.nextLine();
            System.out.print("Jumlah Jam : ");
            jumlahJam = sc.nextInt(); sc.nextLine();
            System.out.println("------------------------------------------");

            arrayOfMatakuliah[i] = new Matakuliah04(kode, nama, sks, jumlahJam);
        }
           for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode       : " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama       : " + arrayOfMatakuliah[i].nama);
            System.out.println("Sks        : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("------------------------------------------");
        }
    sc.close();
    }
}
```
 

 ## 3.5 tugas 
 1. Buatlah program untuk menampilkan informasi tentang dosen. Program dapat menerima input semua informasi terkait dosen dan menampilkanya kembali ke layar. Program ini terdiri dari class _Dosen<NoPresensi>_ dengan attribute/property sebagai berikut;  
    - String kode 
    - String nama 
    - Boolean jenisKelamin 
    - int usia  
    dengan methode constructor sebagai berikut; 
    public dosen(String kode, String nama, Boolean jenisKelamin, int usia) { 
    …………….; 
    …………….; 
    } 
    Kemudian buatlah class DosenDemo<NoPresensi> untuk proses input dan menampilkan data beberapa dosen. Gunakan looping dengan FOR untuk pembuatan array of object. Gunakan looping dengan FOREACH untuk menampilkan data ke layar. 

    Class Dosen

    ```java
    package Praktikum03;
    public class Dosen04 {
    public String kode;
    public String nama;
    public boolean jenisKelamin;
    public int usia;

    public Dosen04(String kode, String nama, Boolean jenisKelamin, int usia){
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
    }
    ```

    class DosenDemo04

    ```java
    package Praktikum03;
    import java.util.Scanner;
    public class DosenDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen04[] arrayOfDosen = new Dosen04[3];
        String kode, nama;
        int usia;
        boolean jenisKelamin;

        for (int i = 0; i < 3; i++) {
            
            System.out.println ("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print ("kode              : ");
            kode = sc.nextLine();
            System.out.print ("Nama              : ") ;
            nama = sc.nextLine();
            System.out.print ("jenis Kelamin     : ");
            jenisKelamin = sc.nextBoolean();
            System.out.print ("usia               : ");
            usia = sc.nextInt();
            System.out.println ("---------------------------");

            arrayOfDosen[i] = new Dosen04 (kode, nama, jenisKelamin, usia);
        }
        int i = 1;
        for (Dosen04 dosen : arrayOfDosen) {
        System.out.println("Data Dosen ke-" + (i+1));
        System.out.println("kode               : " + dosen.kode);
        System.out.println("Nama               : " + dosen.nama);
        System.out.println("Jenis kelamin      : " + dosen.jenisKelamin);
        System.out.println("usia               : " + dosen.usia);
        System.out.println("--------------------------------------");
        }
    sc.close();
    }
    }
    ```

2. Tambahkan class baru DataDosen<NoPresensi> dengan beberapa method berikut; 
    a. dataSemuaDosen(Dosen[] arrayOfDosen)untuk menampilkan data semua dosen   
    b. jumlahDosenPerJenisKelamin(Dosen[] arrayOfDosen) untuk menampilkan data jumlah dosen per jenis kelamin (Pria / Wanita)   
    c. rerataUsiaDosenPerJenisKelamin(Dosen[] arrayOfDosen) untuk menampilkan rata-rata usia dosen per jenis kelamin (Pria / Wanita)   
    d. infoDosenPalingTua(Dosen[] arrayOfDosen) untuk menampilkan data dosen paling tua   
    e. infoDosenPalingMuda(Dosen[] arrayOfDosen) untuk menampilkan data dosen paling muda 
    Semua method tersebut harus bisa dipanggil/ditest dari class DosenDemo

    class DataDosen04.java
    ```java
    package Praktikum03;
    public class DataDosen04 {

    public void dataSemuaDosen(Dosen04[] arrayOfDosen) {
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode          : " + arrayOfDosen[i].kode);
            System.out.println("Nama          : " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin : " + (arrayOfDosen[i].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + arrayOfDosen[i].usia);
            System.out.println("------------------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen04[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin == true) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
        System.out.println("------------------------------------------");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen04[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int pria = 0, wanita = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin == true) {
                totalUsiaPria += arrayOfDosen[i].usia;
                pria++;
            } else {
                totalUsiaWanita += arrayOfDosen[i].usia;
                wanita++;
            }
        }
        if (pria > 0) {
            System.out.println("Rata-rata Usia Pria   : " + (totalUsiaPria / pria));
        } else {
            System.out.println("Rata-rata Usia Pria   : tidak ada data");
        }
        if (wanita > 0) {
            System.out.println("Rata-rata Usia Wanita : " + (totalUsiaWanita / wanita));
        } else {
            System.out.println("Rata-rata Usia Wanita : tidak ada data");
        }
        System.out.println("------------------------------------------");
    }

    public void infoDosenPalingTua(Dosen04[] arrayOfDosen) {
        int Tua = 0;
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > arrayOfDosen[Tua].usia) {
                Tua = i;
            }
        }
        System.out.println("Dosen Paling Tua");
        System.out.println("Kode          : " + arrayOfDosen[Tua].kode);
        System.out.println("Nama          : " + arrayOfDosen[Tua].nama);
        System.out.println("Jenis Kelamin : " + (arrayOfDosen[Tua].jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + arrayOfDosen[Tua].usia);
        System.out.println("------------------------------------------");
    }

    public void infoDosenPalingMuda(Dosen04[] arrayOfDosen) {
        int Muda = 0;
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < arrayOfDosen[Muda].usia) {
                Muda = i;
            }
        }
        System.out.println("Dosen Paling Muda");
        System.out.println("Kode          : " + arrayOfDosen[Muda].kode);
        System.out.println("Nama          : " + arrayOfDosen[Muda].nama);
        System.out.println("Jenis Kelamin : " + (arrayOfDosen[Muda].jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + arrayOfDosen[Muda].usia);
        System.out.println("------------------------------------------");
    }
    }
    ```
    
    Dan juga ada perubahan di class DosenDemo04.java
    
    ```java
    package Praktikum03;
    import java.util.Scanner;
    public class DosenDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen04[] arrayOfDosen = new Dosen04[3];
        String kode, nama, JK;
        int usia;
        boolean jenisKelamin;

        for (int i = 0; i < 3; i++) {
            
            System.out.println ("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print ("kode              : ");
            kode = sc.nextLine();
            System.out.print ("Nama              : ") ;
            nama = sc.nextLine();
            System.out.print ("jenis Kelamin     : ");
            JK = sc.nextLine();
            jenisKelamin = JK.equalsIgnoreCase("pria");
            System.out.print ("usia               : ");
            usia = sc.nextInt();
            System.out.println ("---------------------------");

            arrayOfDosen[i] = new Dosen04 (kode, nama, jenisKelamin, usia);
        }

        //Terdapat perubahan di bagian output setelah di proses, dikarenakan data dosen sudah di deklarasi di konstruktor dataSemuaDosen, maka tidak diperlukan lagi untuk output satu per satu
        DataDosen04 dataDosen = new DataDosen04();

        System.out.println("========== Semua Data Dosen ==========");
        dataDosen.dataSemuaDosen(arrayOfDosen);
        System.out.println("========== Jumlah Per Jenis Kelamin ==========");
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        System.out.println("========== Rata-rata Usia Per Jenis Kelamin ==========");
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        System.out.println("========== Dosen Paling Tua ==========");
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        System.out.println("========== Dosen Paling Muda ==========");
        dataDosen.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
    }
    ```

    Hasil running kode :
    
    ```
    Masukkan Data Dosen ke-1
    kode              : 123
    Nama              : Arif
    jenis Kelamin     : pria
    usia               : 80
    ---------------------------
    Masukkan Data Dosen ke-2
    kode              : 456
    Nama              : Bayu
    jenis Kelamin     : pria
    usia               : 60
    ---------------------------
    Masukkan Data Dosen ke-3
    kode              : 789
    Nama              : Cinta
    jenis Kelamin     : wanita
    usia               : 70
    ---------------------------
    ========== Semua Data Dosen ==========
    Data Dosen ke-1
    Kode          : 123
    Nama          : Arif
    Jenis Kelamin : Pria
    Usia          : 80
    ------------------------------------------
    Data Dosen ke-2
    Kode          : 456
    Nama          : Bayu
    Jenis Kelamin : Pria
    Usia          : 60
    ------------------------------------------
    Data Dosen ke-3
    Kode          : 789
    Nama          : Cinta
    Jenis Kelamin : Wanita
    Usia          : 70
    ------------------------------------------
    ========== Jumlah Per Jenis Kelamin ==========
    Jumlah Dosen Pria   : 2
    Jumlah Dosen Wanita : 1
    ------------------------------------------
    ========== Rata-rata Usia Per Jenis Kelamin ==========
    Rata-rata Usia Pria   : 70
    Rata-rata Usia Wanita : 70
    ------------------------------------------
    ========== Dosen Paling Tua ==========
    Dosen Paling Tua
    Kode          : 123
    Nama          : Arif
    Jenis Kelamin : Pria
    Usia          : 80
    ------------------------------------------
    ========== Dosen Paling Muda ==========
    Dosen Paling Muda
    Kode          : 456
    Nama          : Bayu
    Jenis Kelamin : Pria
    Usia          : 60
    ------------------------------------------
    PS D:\Algoritma-dan-Struktur-Data>
    ```