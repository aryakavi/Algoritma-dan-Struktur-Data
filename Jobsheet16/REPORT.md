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
2. Tambahkan prosedur hapus data mahasiswa melalui implementasi Queue pada collections Tugas nomor 1! 