|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020087 |
| Nama |  Aryakavi Raditya Imaran |
| Kelas | TI - 1F |
| Repository | ([https://github.com/aryakavi/Algoritma-dan-Struktur-Data]) |

# JOBSHEET 16 : DOUBLE LINKED LIST

## 16.1 Tujuan Praktikum 
Setelah melakukan praktikum ini, mahasiswa mampu: 
1. memahami bentuk-bentuk collection dan hierarkinya; 
2. menerapkan collection sesuai dengan fungsi dan jenisnya; 
3. menyelesaikan kasus menggunakan collection yang sesuai. 

## 16.2. Kegiatan Praktikum 1

### 16.2.1. Percobaan 1 

Class ContohList04
```JAVA
package Jobsheet16;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContohList04 {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add("Cireng");
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n",
                l.get(0), l.size(), l.get(l.size() - 1));

        l.add(4);
        l.remove(0);
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n",
                l.get(0), l.size(), l.get(l.size() - 1));

        
        List<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");

        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1));
        
        names.set(0, "My kid");
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1));
                
        System.out.println("Names: " + names.toString());
    }
}
```

### 16.2.2. Verifikasi Hasil Percobaan
```
Elemen 0: 1 total elemen: 4 elemen terakhir: Cireng
Elemen 0: 2 total elemen: 4 elemen terakhir: 4
Elemen 0: Noureen total elemen: 5 elemen terakhir: Al-Qarni
Elemen 0: My kid total elemen: 5 elemen terakhir: Al-Qarni
Names: [My kid, Akhleema, Shannum, Uwais, Al-Qarni]
PS D:\Algoritma-dan-Struktur-Data> 
```

### 16.2.3. Pertanyaan Percobaan
1. Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah Arraylist? 
    Di line list l - new ArrayList(); Karena tidak menggunakan kurung siku maka mendeklarasikan sebagai raw type (hasil search google). Secara default, jika tipe data tidak spesifik. Maka java akan menganggap koleksi tersebut berisi tipe object. KArena semua tipe data referensi di Java adalah turunan object, maka ArrayList bebas menerima berbagai jenis tipe data apapun secara bersamaan.

2. Modifikasi baris kode 25-36 sehingga data yang ditampung hanya satu jenis atau spesifik tipe tertentu! 
    ```JAVA
    //(... public static void main(String[] args))
    List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        // l.add("Cireng"); Di bagian ini di disable karena dispesifikasikan emnggunakan Integer
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %d\n",
                l.get(0), l.size(), l.get(l.size() - 1));

        l.add(4);
        l.remove(0);
    
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %d\n",
                l.get(0), l.size(), l.get(l.size() - 1));
    ```

3. Ubah kode pada baris kode 38  menjadi seperti ini 
```java
LinkedList<String> names = new LinkedListr<>();
```
    ```JAVA
    /// (...System.out.printf)
    LinkedList<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");
    ```

4. Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya 
```java
names.push("Mei-mei);
System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
    names.getFist(), names.size(), names.getLast());
System.out.println("Names: " + names.toString());
```
    ```JAVA
    /// (... System.out.println("Names: " + names.toString());)
    
    ```
5. Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan! 
    Dari hasil modifikasi kode diatas dihasilkan output 
    ```
    Elemen 0: 1 total elemen: 3 elemen terakhir: 3
    Elemen 0: 2 total elemen: 3 elemen terakhir: 4
    Elemen 0: Noureen total elemen: 5 elemen terakhir: Al-Qarni
    Elemen 0: My kid total elemen: 5 elemen terakhir: Al-Qarni
    Names: [My kid, Akhleema, Shannum, Uwais, Al-Qarni]
    Elemen 0: Mei-mei total elemen: 6 elemen terakhir: Al-Qarni
    Names: [Mei-mei, My kid, Akhleema, Shannum, Uwais, Al-Qarni]
    PS D:\Algoritma-dan-Struktur-Data>  
    ```
    Jika kode dari nomor 3 dan 4 dijalankan, maka Mei-mei akan berada di posisi paling awal. Dan output tambahan yang dihasilkan menjadi 
    ```
    Elemen 0: Mei-mei total elemen: 6 elemen terakhir: Al-Qarni
    
    Names: [Mei-mei, My kid, Akhleema, Shannum, Uwais, Al-Qarni]
    Perubahan terjadi karena
    ```
    A. Perubahan referensi, referensi awal menggunakan List<String> names = new LinkedList<>(); dimana List tidak memiliki fungsi push(), getFirst(), dan getLast();/ Dengan mengubah menjadi LinkedList<String> names = new LinkedList<>(); maka membuka fungsi bawaan LinkedList.
    
    B. Fungsi push(E e) di Linked list mensimulasikan stack, yaitu memasukkan elemen paling depan sebagai Head. Karena itu, "Mei-mei" mengeeser "My Kid" dan meenjadikan elemen di indeks ke-0.
    
    C. Fungsing getFirst() dan getLast() adalah metode milik LinkedList untuk memanggil elemen pada posisi pertama dan terakhir tanpa harus secara manual memanggil indeks dengan get(0) atau get(names.size() - 1).


## 16.3. Kegiatan Praktikum 2

### 16.3.1. Tahapan Percobaan 

Class LoopCollection04
```JAVA
package Jobsheet16;
import java.util.Iterator;
import java.util.Stack;

public class LoopCollection04 {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n" + fruits.toString());
        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }

        fruits.push("Melon");
        fruits.push("Durian");
        System.out.println("");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        
        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        
        System.out.println("");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
    }
}
```

### 16.3.2. Verifikasi Hasil Percobaan
```
Banana Orange Watermelon Leci Salak 
[Banana, Orange, Watermelon, Leci, Salak]
Salak Leci Watermelon Orange Banana 
Melon Durian 
Melon Durian 
Melon Durian 
PS D:\Algoritma-dan-Struktur-Data> 
```

### 16.3.3. Pertanyaan Percobaan
1. Apakah perbedaan fungsi push() dan add() pada objek fruits? 
    - push (E item) : Method ini memiliki struktur data Stack yang menggunakan LIFO atau Las In, First Out. Fungsinya untuk menaruh elemen di posisi paling akhhir tumpukan dan mengembalikan nilai elemen itu sendiri.
    - add (E e)     : Bagian ini adalah method turunan dari Collection/list. Method ini menambahkan elemen ke akhir list dan mengembalikan nilai boolean (true if success)

2. Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian? 
    Jika kedua barus dihapus, maka kode akan tetap berjalan tanpa error. Namun output pada perulangan dibawahnya akan kosong dan tidak mencetak elemen apapun. Perulangan while tersebut mengeksekusi fruits.pop() terus-menerus sampai Stack benar-benar kosong (!fruits.empty()). Akibatnya, semua buah yang ada di Stack (Banana, Orange, Watermelon, Leci, Salak) telah dikeluarkan dan dihapus.

3. Jelaskan fungsi dari baris 46-49? 
    - fruits.iterator(): Membuat objek iterator yang bertugas menunjuk elemen-elemen di dalam koleksi.
    - it.hasNext(): Mengecek apakah masih ada elemen berikutnya di dalam koleksi. Jika ada, perulangan terus berjalan.
    - it.next(): Mengambil elemen yang sedang ditunjuk saat ini dan memajukan kursor iterator ke elemen selanjutnya.

4. Silakan ganti baris kode 25, Stack<String> menjadi List<String> dan apakah yang terjadi? Mengapa bisa demikian? 
    Jika mengubah baris deklarasi Stack<String> menjadi List<String> fruits = new Stack<>();, program akan mengalami Error Kompilasi (Compile-time Error). Meski objek asli yang dibuat adalah Stack, namun referensi yang menampung adalah List. List tidak memiliki method push(), pop(), dan empty(). Karena itu, saat Java mencoba menjalankan fruits.pus("Banana") atau fruits.pop() compiler akan mengeluarkan error "Cannot find symbol" karena method tidak dikenali oleh List.

5. Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”! 
    ```JAVA
    // Elemen terakhir di indeks (list - 1) diganti dengan Strawberry
        if (!fruits.isEmpty()) {
            fruits.set(fruits.size() - 1, "Strawberry");
        }
        
        System.out.println("\nSetelah elemen terakhir diganti Strawberry:");
        System.out.println(fruits);
    ```

6. Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting! 
    ```JAVA
    fruits.push("Mango");
        fruits.push("guava");
        fruits.push("avocado");
        
        // Melakukan sorting sesiao alphabet
        Collections.sort(fruits);
        System.out.println("\nSetelah penambahan 3 buah dan dilakukan Sorting:");
        System.out.println(fruits);
    ```

## 16.4. Kegiatan Praktikum 3

### 16.4.1. tahapan Percobaan

Class Mahasiswa04
```JAVA
package Jobsheet16;
public class Mahasiswa04 {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa04() {
    }

    public Mahasiswa04(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }
}
```

Class ListMahasiswa04
```JAVA
package Jobsheet16;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMahasiswa04 {
    
    List<Mahasiswa04> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa04... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa04 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ListMahasiswa04 lm = new ListMahasiswa04();
        Mahasiswa04 m = new Mahasiswa04("201234", "Noureen", "021xx1");
        Mahasiswa04 m1 = new Mahasiswa04("201235", "Akhleema", "021xx2");
        Mahasiswa04 m2 = new Mahasiswa04("201236", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);
        lm.tampil();
        lm.update(lm.linearSearch("201235"), new Mahasiswa04("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
    }
}
```

### 16.4.2. Verifikasi hasil Percobaan
```
Mahasiswa{nim=201234, nama=Noureen, notelp=021xx1}
Mahasiswa{nim=201235, nama=Akhleema, notelp=021xx2}
Mahasiswa{nim=201236, nama=Shannum, notelp=021xx3}

Mahasiswa{nim=201234, nama=Noureen, notelp=021xx1}
Mahasiswa{nim=201235, nama=Akhleema Lela, notelp=021xx2}
Mahasiswa{nim=201236, nama=Shannum, notelp=021xx3}
PS D:\Algoritma-dan-Struktur-Data> 
```

### 16.4.3. Pertanyaan Percobaan
1. Pada fungsi tambah() yang menggunakan unlimited argument itu menggunakan konsep apa? Dan kelebihannya apa? 
    Konsep yang digunakan adalah Varargs atau variable length argument. Dimana sintaks ini ditandai dengan ... (titik tiga) setelah tipe data di parameter method. Di dalam prosesnya, parameter berjalan seperti array. Kelebihannya adalah dari fleksibilitas, dimna memanggil method bisa dengan jumlah dinamis tanpa membuat methos yang banyak. Selain itu kode bisa lebih bersih dan praktis, tidak perlu mendeklarasikan tipe objek array secara manual saat method dipanggil.

2. Pada fungsi linearSearch() di atas, silakan diganti dengan fungsi binarySearch() dari collection! 
    ```JAVA
    //(... Method public void tampil ())
    public int binarySearch(String nim) {
        sortAscending();
        Mahasiswa04 searchKey = new Mahasiswa04(nim, "", "");
        return Collections.binarySearch(mahasiswas, searchKey, Comparator.comparing(m -> m.nim));
    }
    ```

3. Tambahkan fungsi sorting baik secara ascending ataupun descending pada class tersebut! 
    ```JAVA
    //(... Method public int binarySearch(String nim))
    public void sortAscending() {
        Collections.sort(mahasiswas, Comparator.comparing(m -> m.nim));
    }

    public void sortDescending() {
        Collections.sort(mahasiswas, (m1, m2) -> m2.nim.compareTo(m1.nim));
    }

    public static void main(String[] args) {
        ListMahasiswa04 lm = new ListMahasiswa04();
        Mahasiswa04 m = new Mahasiswa04("201234", "Noureen", "021xx1");
        Mahasiswa04 m1 = new Mahasiswa04("201235", "Akhleema", "021xx2");
        Mahasiswa04 m2 = new Mahasiswa04("201236", "Shannum", "021xx3");

        // Menambah objek mahasiswa
        lm.tambah(m, m1, m2);
        
        System.out.println("--- Data Awal ---");
        lm.tampil();

        // Pencarian dan update mahasiswa mdengan Binary Search
        int searchIndex = lm.binarySearch("201235"); 
        if (searchIndex >= 0) {
            lm.update(searchIndex, new Mahasiswa04("201235", "Akhleema Lela", "021xx2"));
        } else {
            System.out.println("\nData tidak ditemukan!");
        }
        
        System.out.println("\n--- Setelah di-update (otomatis tersortir Ascending Binary Search) ---");
        lm.tampil();
        
        // Uji coba Sorting Descending
        System.out.println("\n--- Setelah disortir secara Descending ---");
        lm.sortDescending();
        lm.tampil();
    }
}
    ```

## 16.5. Tugas Praktikum
1. Buatlah implementasi program daftar nilai mahasiswa semester, minimal memiliki 3 class yaitu Mahasiswa, Nilai, dan Mata Kuliah. Data Mahasiswa dan Mata Kuliah perlu melalui penginputan data terlebih dahulu.Ilustrasi Program Menu Awal dan Penambahan Data 

Class Mahasiswa
```JAVA
package Jobsheet16;
public class Mahasiswa {
    String nim;
    String nama;
    String telf;

    public Mahasiswa(String nim, String nama, String telf) {
        this.nim = nim;
        this.nama = nama;
        this.telf = telf;
    }
}
```

Class MataKuliah
```JAVA
package Jobsheet16;
public class MataKuliah {
    String kodeMk;
    String namaMk;
    int sks;

    public MataKuliah(String kodeMk, String namaMk, int sks) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.sks = sks;
    }
}
```

Class Nilai
```JAVA
package Jobsheet16;
public class Nilai {
    String kodeNilai;
    double nilai;
    Mahasiswa mhs;
    MataKuliah mk;

    public Nilai(String kodeNilai, double nilai, Mahasiswa mhs, MataKuliah mk) {
        this.kodeNilai = kodeNilai;
        this.nilai = nilai;
        this.mhs = mhs;
        this.mk = mk;
    }
}
```

Class SistemPengolahData
```JAVA
package Jobsheet16;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SistemPengolahData {
    static List<Mahasiswa> listMahasiswa = new ArrayList<>();
    static List<MataKuliah> listMataKuliah = new ArrayList<>();
    static List<Nilai> listNilai = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initData();
        
        int menu = 0;
        do {
            System.out.println("\n************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("************************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.println("************************************************");
            System.out.print("Pilih\t: ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    inputNilai();
                    break;
                case 2:
                    tampilNilai();
                    break;
                case 3:
                    cariNilai();
                    break;
                case 4:
                    urutDataNilai();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (menu != 5);
    }

    static void initData() {
        listMahasiswa.add(new Mahasiswa("20001", "Thalhah", "021xxx"));
        listMahasiswa.add(new Mahasiswa("20002", "Zubair", "021xxx"));
        listMahasiswa.add(new Mahasiswa("20003", "Abdur-Rahman", "021xxx"));
        listMahasiswa.add(new Mahasiswa("20004", "Sa'ad", "021xxx"));
        listMahasiswa.add(new Mahasiswa("20005", "Sa'id", "021xxx"));
        listMahasiswa.add(new Mahasiswa("20006", "Ubaidah", "021xxx"));

        listMataKuliah.add(new MataKuliah("00001", "Internet of Things", 3));
        listMataKuliah.add(new MataKuliah("00002", "Algoritma dan Struktur Data", 2));
        listMataKuliah.add(new MataKuliah("00003", "Algoritma dan Pemrograman", 2));
        listMataKuliah.add(new MataKuliah("00004", "Praktikum Algoritma dan Struktur Data", 3));
        listMataKuliah.add(new MataKuliah("00005", "Praktikum Algoritma dan Pemrograman", 3));
    }

    // Fungsi 1: Input Nilai
    static void inputNilai() {
        System.out.println("Masukkan data");
        System.out.print("Kode\t: ");
        String kode = sc.nextLine();
        System.out.print("Nilai\t: ");
        double nilai = sc.nextDouble();
        sc.nextLine();

        System.out.println("\nDAFTAR MAHASISWA");
        System.out.println("************************************************");
        System.out.printf("%-10s %-15s %-10s\n", "NIM", "Nama", "Telf");
        for (Mahasiswa m : listMahasiswa) {
            System.out.printf("%-10s %-15s %-10s\n", m.nim, m.nama, m.telf);
        }
        System.out.print("Pilih mahasiswa by nim: ");
        String cariNim = sc.nextLine();
        Mahasiswa mhsTerpilih = null;
        for (Mahasiswa m : listMahasiswa) {
            if (m.nim.equals(cariNim)) {
                mhsTerpilih = m;
                break;
            }
        }

        System.out.println("\nDAFTAR MATA KULIAH");
        System.out.println("************************************************");
        System.out.printf("%-10s %-40s %-5s\n", "Kode", "Mata Kuliah", "SKS");
        for (MataKuliah mk : listMataKuliah) {
            System.out.printf("%-10s %-40s %-5d\n", mk.kodeMk, mk.namaMk, mk.sks);
        }
        System.out.print("Pilih MK by kode: ");
        String cariMk = sc.nextLine();
        MataKuliah mkTerpilih = null;
        for (MataKuliah mk : listMataKuliah) {
            if (mk.kodeMk.equals(cariMk)) {
                mkTerpilih = mk;
                break;
            }
        }

        if (mhsTerpilih != null && mkTerpilih != null) {
            listNilai.add(new Nilai(kode, nilai, mhsTerpilih, mkTerpilih));
            System.out.println("Data nilai berhasil ditambahkan!");
        } else {
            System.out.println("Data Mahasiswa atau Mata Kuliah tidak ditemukan!");
        }
    }

    // Fungsi 2: Menampilkan Nilai
    static void tampilNilai() {
        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.println("******************************************************************************");
        System.out.printf("%-10s %-15s %-40s %-5s %-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        for (Nilai n : listNilai) {
            System.out.printf("%-10s %-15s %-40s %-5d %.2f\n", n.mhs.nim, n.mhs.nama, n.mk.namaMk, n.mk.sks, n.nilai);
        }
    }

    // Fungsi 3: Mencari Nilai Mahasiswa
    static void cariNilai() {
        tampilNilai(); 
        System.out.print("Masukkan data mahasiswa[nim] : ");
        String cariNim = sc.nextLine();

        System.out.printf("%-10s %-15s %-40s %-5s %-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        int totalSks = 0;
        boolean ditemukan = false;
        
        for (Nilai n : listNilai) {
            if (n.mhs.nim.equals(cariNim)) {
                System.out.printf("%-10s %-15s %-40s %-5d %.2f\n", n.mhs.nim, n.mhs.nama, n.mk.namaMk, n.mk.sks, n.nilai);
                totalSks += n.mk.sks;
                ditemukan = true;
            }
        }
        
        if (ditemukan) {
            System.out.println("Total SKS " + totalSks + " telah diambil.");
        } else {
            System.out.println("Data mahasiswa dengan NIM tersebut tidak ditemukan pada daftar nilai.");
        }
    }

    // Fungsi 4: Mengurutkan Data Nilai Ascending
    static void urutDataNilai() {
        Collections.sort(listNilai, new Comparator<Nilai>() {
            @Override
            public int compare(Nilai n1, Nilai n2) {
                return Double.compare(n1.nilai, n2.nilai);
            }
        });
        
        System.out.println("\nData berhasil diurutkan berdasarkan Nilai!");
        tampilNilai(); 
    }
}
```

Hasil runnung kode
```
************************************************
SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER
************************************************
1. Input Nilai
2. Tampil Nilai
3. Mencari Nilai Mahasiswa
4. Urut Data Nilai
5. Keluar
************************************************
Pilih   : 1
Masukkan data
Kode    : 0001
Nilai   : 80.75

DAFTAR MAHASISWA
************************************************
NIM        Nama            Telf      
20001      Thalhah         021xxx    
20002      Zubair          021xxx    
20003      Abdur-Rahman    021xxx    
20004      Sa'ad           021xxx    
20005      Sa'id           021xxx    
20006      Ubaidah         021xxx    
Pilih mahasiswa by nim: 20001

DAFTAR MATA KULIAH
************************************************
Kode       Mata Kuliah                              SKS  
00001      Internet of Things                       3    
00002      Algoritma dan Struktur Data              2    
00003      Algoritma dan Pemrograman                2    
00004      Praktikum Algoritma dan Struktur Data    3    
00005      Praktikum Algoritma dan Pemrograman      3    
Pilih MK by kode: 00001
Data nilai berhasil ditambahkan!

************************************************
SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER
************************************************
1. Input Nilai
2. Tampil Nilai
3. Mencari Nilai Mahasiswa
4. Urut Data Nilai
5. Keluar
************************************************
Pilih   : 2

DAFTAR NILAI MAHASISWA
******************************************************************************
Nim        Nama            Mata Kuliah                              SKS   Nilai
20001      Thalhah         Internet of Things                       3     80.75

************************************************
SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER
************************************************
1. Input Nilai
2. Tampil Nilai
3. Mencari Nilai Mahasiswa
4. Urut Data Nilai
5. Keluar
************************************************
Pilih   : 3

DAFTAR NILAI MAHASISWA
******************************************************************************
Nim        Nama            Mata Kuliah                              SKS   Nilai
20001      Thalhah         Internet of Things                       3     80.75
Masukkan data mahasiswa[nim] : 20002
Nim        Nama            Mata Kuliah                              SKS   Nilai
Data mahasiswa dengan NIM tersebut tidak ditemukan pada daftar nilai.

************************************************
SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER
************************************************
1. Input Nilai
2. Tampil Nilai
3. Mencari Nilai Mahasiswa
4. Urut Data Nilai
5. Keluar
************************************************
Pilih   : 4

Data berhasil diurutkan berdasarkan Nilai!

DAFTAR NILAI MAHASISWA
******************************************************************************
Nim        Nama            Mata Kuliah                              SKS   Nilai
20001      Thalhah         Internet of Things                       3     80.75

************************************************
SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER
************************************************
1. Input Nilai
2. Tampil Nilai
3. Mencari Nilai Mahasiswa
4. Urut Data Nilai
5. Keluar
************************************************
Pilih   : 5
Terima kasih telah menggunakan sistem ini.
PS D:\Algoritma-dan-Struktur-Data> 
```

2. Tambahkan prosedur hapus data mahasiswa melalui implementasi Queue pada collections Tugas nomor 1! 

Mengubah code di SistemPengolahanData dengan menambahkan hapus data
```JAVA
// (... kode line data mahasiswa)
static void hapusMahasiswaQueue() {
        System.out.println("\nPROSEDUR HAPUS MAHASISWA (QUEUE)");
        System.out.println("************************************************");
        
        if (!queueMahasiswa.isEmpty()) {
            Mahasiswa mhsDihapus = queueMahasiswa.poll(); 
            System.out.println("Berhasil menghapus mahasiswa dari antrean terdepan!");
            System.out.println("NIM  : " + mhsDihapus.nim);
            System.out.println("Nama : " + mhsDihapus.nama);
            String nimTarget = mhsDihapus.nim;
            listNilai.removeIf(n -> n.mhs.nim.equals(nimTarget));
            
        } else {
            System.out.println("Antrean mahasiswa sudah kosong! Tidak ada data yang bisa dihapus.");
        }
    }
```
Karena mengubah menggunakan queue maka ditambahkan importt java.util.Queue dan import java.util.LinkedList, selain itu megubah pemanggilan dari listMahasiswa menjadi queueMahasiswa. 