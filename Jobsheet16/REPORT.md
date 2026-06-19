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
2. Modifikasi baris kode 25-36 seingga data yang ditampung hanya satu jenis atau spesifik tipe tertentu! 
3. Ubah kode pada baris kode 38  menjadi seperti ini 
```java
LinkedList<String> names = new LinkedListr<>();
```
4. Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya 
```java
names.push("Mei-mei);
System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
    names.getFist(), names.size(), names.getLast());
System.out.println("Names: " + names.toString());
```
5. Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan! 

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
2. Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian? 
3. Jelaskan fungsi dari baris 46-49? 
4. Silakan ganti baris kode 25, Stack<String> menjadi List<String> dan apakah yang terjadi? Mengapa bisa demikian? 
5. Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”! 
6. Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting! 

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
2. Pada fungsi linearSearch() di atas, silakan diganti dengan fungsi binarySearch() dari collection! 
3. Tambahkan fungsi sorting baik secara ascending ataupun descending pada class tersebut! 

## 16.5. Tugas Praktikum
1. Buatlah implementasi program daftar nilai mahasiswa semester, minimal memiliki 3 class yaitu Mahasiswa, Nilai, dan Mata Kuliah. Data Mahasiswa dan Mata Kuliah perlu melalui penginputan data terlebih dahulu.Ilustrasi Program Menu Awal dan Penambahan Data 
2. Tambahkan prosedur hapus data mahasiswa melalui implementasi Queue pada collections Tugas nomor 1! 