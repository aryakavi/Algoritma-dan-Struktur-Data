|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020087 |
| Nama |  Aryakavi Raditya Imaran |
| Kelas | TI - 1F |
| Repository | [https://github.com/aryakavi/Algoritma-dan-Struktur-Data] |

# JOBSHEET 3 : ARRAY OF OBJECT
Memahami fungsi array yang berisikan variabel object, menerapkan instansiasi array of objects dalam Java, melakukan operasi terhadap elemen dalam array of objects

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