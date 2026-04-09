|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020087 |
| Nama |  Aryakavi Raditya Imaran |
| Kelas | TI - 1F |
| Repository | [https://github.com/aryakavi/Algoritma-dan-Struktur-Data] |

# JOBSHEET 5 - SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)
Praktikum ini mengajarkan algoritma untuk bubble sort, selection sort, dan insertion sort. 

## 5.1  Tujuan Praktikum 
Setelah melakukan praktikum ini diharapkan mahasiswa mampu: 
a. Mahasiswa mampu  membuat algoritma searching bubble sort, selection sort dan insertion sort 
b. Mahasiswa mampu  menerapkan algoritma searching bubble sort, selection sort dan insertion sort pada program 

## 5.2 Praktikum 1 - Mengimplementasikan Sorting menggunakan object
Percobaan sorting Bubble sort, Selection sort, dan Insertion sort

### 5.2.1 Langkah Praktikum 1 

a. SORTING - BUBBLE SORT

class Sorting04
```JAVA
package BruteForceDivideConquer.Praktikum05;

public class Sorting04 {

    int[] data;
    int jumData;

    Sorting05 (int Data[], int jmlDat) {
        jumData = jmlDat;
        data = new int[jmlDat];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    void bubbleSort () {
        int temp = 0;
        for (int i = 0; i < jumData - 1; i++) {
            for (int j = 1; j < jumData - i; j++) {
                if (data[j - 1] > data[j]) {
                    temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
    }

    void tampil (){
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
    System.out.println();
    }
}
```

class SortingMain04
```JAVA
package BruteForceDivideConquer.Praktikum05;

public class SortingMain04 {
    public static void main(String[] args) {
        int a[] = {20,10,2,7,12};
        
        Sorting04 dataurut1 = new Sorting04(a, a.length);
        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurut dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();
    }
}
```

### 5.2.2 Verifikasi Hasil Percobaan

```
Data awal 1
20 10 2 7 12
Data sudah diurut dengan BUBBLE SORT (ASC)
2 7 10 12 20
```


b. SORTING - SELESCTION SORT

class Sorting04
```JAVA
package BruteForceDivideConquer.Praktikum05;

public class Sorting04 {

    int[] data;
    int jumData;

    Sorting04 (int Data[], int jmlDat) {
        jumData = jmlDat;
        data = new int[jmlDat];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    void bubbleSort () {
        int temp = 0;
        for (int i = 0; i < jumData - 1; i++) {
            for (int j = 1; j < jumData - i; j++) {
                if (data[j - 1] > data[j]) {
                    temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
    }

    void SelectionSort(){
        for (int i = 0; i < jumData-1; i++) {
            int min = i;
            for (int j = 0; j < jumData; j++) {
                if(data[j] < data[min]){
                    min = j;
                }
            }
        }
    }

    void tampil (){
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
    System.out.println();
    }
}
```

class SortingMain04
```JAVA
package BruteForceDivideConquer.Praktikum05;

public class SortingMain04 {
    public static void main(String[] args) {
        int a[] = {20,10,2,7,12};
        
        Sorting04 dataurut1 = new Sorting04(a, a.length);
        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurut dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        int b[] = {30, 20, 2, 8, 14};
        Sorting04 dataurut2 = new Sorting04(b, b.length);
        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();
    }
}
```
### 5.2.3 Verifikasi Hasil Percobaan
```
Data awal 2
30 20 2 8 14
Data sudah diurutkan dengan SELECTION SORT (ASC)
30 20 2 8 14
```

c. SORTING INSERTION SORT

class Sorting04
```JAVA
package BruteForceDivideConquer.Praktikum05;

public class Sorting04 {

    int[] data;
    int jumData;

    Sorting04 (int Data[], int jmlDat) {
        jumData = jmlDat;
        data = new int[jmlDat];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    void bubbleSort () {
        int temp = 0;
        for (int i = 0; i < jumData - 1; i++) {
            for (int j = 1; j < jumData - i; j++) {
                if (data[j - 1] > data[j]) {
                    temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
    }

    void SelectionSort(){
        for (int i = 0; i < jumData-1; i++) {
            int min = i;
            for (int j = 0; j < jumData; j++) {
                if(data[j] < data[min]){
                    min = j;
                }
            }
        }
    }

    void insertionSort(){
        for (int i = 0; i < data.length; i++) {
            int temp = data [i];
            int j=i-1;
            while (j>=0 && data[j]>temp) {
                data[j+1]=data[j];
                j--;
            }
            data[j+1]=temp;
        }
    }

    void tampil (){
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
    System.out.println();
    }
}
```

class SortingmMain04
```JAVA
package BruteForceDivideConquer.Praktikum05;

public class SortingMain04 {
    public static void main(String[] args) {
        int a[] = {20,10,2,7,12};
        
        Sorting04 dataurut1 = new Sorting04(a, a.length);
        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurut dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        int b[] = {30, 20, 2, 8, 14};
        
        Sorting04 dataurut2 = new Sorting04(b, b.length);
        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();

        int c[] = {40, 10, 4, 9, 3};

        Sorting04 dataurut3 = new Sorting04(c, c.length);
        System.out.println("Data awal 2");
        dataurut3.tampil();
        dataurut3.SelectionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();
    }
}
```

### 5.2.4 Verifikasi hasil Percobaan
```
Data awal 2
40 10 4 9 3
Data sudah diurutkan dengan INSERTION SORT (ASC)
40 10 4 9 3
```

### 5.2.5 Pertanyaan
1. Jelaskan fungsi kode program berikut 
```java
if (data[j - 1] > data[j]) {
    temp = data[j];
    data[j] = data[j - 1];
    data[j - 1] = temp;
}
```
Kode diatas berfungsi untuk melakukan pertukaran data.Jika elemen sebelah kiri (data[j-1]_) bernilai lebih besar dari elemen di sebelah kanannya (data[j]) maka posisinya ditukar agar menjadi urut dari kecil ke besaar (Ascending). Variabel temp digunakan sebagai tempat penitipan nilai saat proses pertukaran terjadi agar datanya tidak hilang tertimpa.


2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!

Algoritma pencarian nilai minimum berdada di perulangan dalam (inner loop) pada method SelectionSort(). Terutama pada bagian :
```JAVA
    int min = i; 
            for (int j = 0; j < jumData; j++) { 
                if(data[j] < data[min]){ 
                    min = j; 
                }
            }
```

3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan 
```java 
while (j>=0 && data[j]>temp)
```

Kondisi diatas menunjukkan aturan untuk menentukan kapan pergeseran data harus berhenti.
- j>=0 = Memeastikan pencarian tidak terlewat batas bawah array indeks (tidak boleh minus / negatif)
- data[j]>temp = Mengecek apakah elemen saat ini 9data[j]) masih lebih besar dari angka yang sedang disisipkan (temp)
selama kedua syarat bernilai benar (true), maka program akan terus jalan ke while untuk menggeser angka ke kanan.

4. Pada Insertion sort, apakah tujuan dari perintah 
```java
data[j+1]=data[j];
```

Tujuan perintah tersebut adalah untuk menggeser elemen ke kanan. 
Ketika program menemukan angka yang lebih besasr dari temp (berdasar kondisi while), angka tersebut tidak langsung ditukar posisinya, melainkan digeser satu langkah ke kanan (j+1) untuk memberikan "ruang kosong". Lalu ruang kosong tersebut akan diisi oleh nilai temp pada perintah data[j+1]=temp di akhir perulangan.

## 5.3 Praktikum 2 - Sorting Menggunakan Array of Object
Percobaan kode sorting menggunakan Array of Object

### 5.3.1 Langkah Praktikum 2 - Mengurutkan Data Mahasiswa Berdasarkan IPK (Bubble Sort) 
Berikut kode saya

class Mahasiswa04
```JAVA
package BruteForceDivideConquer.Praktikum05;

public class Mahasiswa04 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa04() {
    }

    Mahasiswa04(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }

    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}
```

class MahasiswaBerprestasi04
```JAVA
package BruteForceDivideConquer.Praktikum05;

public class MahasiswaBerprestasi04 {
    Mahasiswa04[] listMhs = new Mahasiswa04[5];
    int idx;

    void tambah(Mahasiswa04 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa04 m : listMhs) {
            if (m != null) { 
                m.tampilInformasi();
                System.out.println("-----------------------------");
            }
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j] != null && listMhs[j-1] != null) {
                    if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                        Mahasiswa04 tmp = listMhs[j];
                        listMhs[j] = listMhs[j - 1];
                        listMhs[j - 1] = tmp;
                    }
                }
            }
        }
    }
}

```

class MahasiswaDemo04
```JAVA
package BruteForceDivideConquer.Praktikum05;


public class MahasiswaDemo04 {
    public static void main(String[] args) {
        MahasiswaBerprestasi04 list = new MahasiswaBerprestasi04();

        Mahasiswa04 m1 = new Mahasiswa04("123", "Zidan", "2A", 3.2);
        Mahasiswa04 m2 = new Mahasiswa04("124", "Ayu", "2A", 3.5);
        Mahasiswa04 m3 = new Mahasiswa04("125", "Sofi", "2A", 3.1);
        Mahasiswa04 m4 = new Mahasiswa04("126", "Sita", "2A", 3.9);
        Mahasiswa04 m5 = new Mahasiswa04("127", "Miki", "2A", 3.7);


        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();
    
}
}
```

### 5.3.2 Verifikasi Hasil Percobaan
```
Data mahasiswa sebelum sorting: 
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
-----------------------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
-----------------------------
Nama: Sofi
NIM: 125
Kelas: 2A
IPK: 3.1
-----------------------------
Nama: Sita
NIM: 126
Kelas: 2A
IPK: 3.9
-----------------------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
-----------------------------
Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :
Nama: Sita
NIM: 126
Kelas: 2A
IPK: 3.9
-----------------------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
-----------------------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
-----------------------------
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
-----------------------------
Nama: Sofi
NIM: 125
Kelas: 2A
IPK: 3.1
-----------------------------
```

### 5.3.4 Pertanyaan
1. Perhatikan perulangan di dalam bubbleSort() di bawah ini: 
```JAVA
for (int i = 0; i < listMhs.length - 1; i++) {
    for (int j = 1; j < listMhs.length - i; j++) {
```
a. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ? 
Perulangan i (outer loop) menentukan berapa banyak tahap yang dibutuhkan untuk mengurutkan seluruh data. Jika memiliki N buah data, maka hanya membutuhkan N-1 tahap pembandingan. Hal ini karena setelah N-1 tahap selesai dilakukan, sisa 1 elemen terakhir secara otomatis sudah berada di posisi yang benar sehingga tidak perlu dicek lagi.

b. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?
Perulangan j (inner loop) melakukan perbandingan dan penukaran data yang bersebelahan. Di Bubble Sort, setiap kali satu tahap i selesai, elemen dengan nilai terbesar/terkecil akan berpindah ke ujung paling kanan array dan posisinya di fix kan. 

c. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i  akan 
berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh? 
Perulangan akan berlangsung sebanyak 49 kali (dari i=0 hingga i=48), dan jumlah tahap yang ditempuh adalah 49 tahap.

2. Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad)  yang terdiri dari nim, nama, kelas, dan ipk! 

### 5.3.5 Mengurutkan Data mAhasiswa Berdasarkan IPK (Selection Sort)

Hasil modifikasi class MahasiswaBerprestasi04
```JAVA
package BruteForceDivideConquer.Praktikum05;

public class MahasiswaBerprestasi04 {
    Mahasiswa04[] listMhs = new Mahasiswa04[5];
    int idx;

    void tambah(Mahasiswa04 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa04 m : listMhs) {
            if (m != null) { 
                m.tampilInformasi();
                System.out.println("-----------------------------");
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j] != null && listMhs[idxMin] != null) {
                    if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                        idxMin = j;
                    }
                }
            }
            // Proses pertukaran (swap) objek Mahasiswa
            Mahasiswa04 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j] != null && listMhs[j-1] != null) {
                    if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                        Mahasiswa04 tmp = listMhs[j];
                        listMhs[j] = listMhs[j - 1];
                        listMhs[j - 1] = tmp;
                    }
                }
            }
        }
    }
}
```

Hasil modifikasi Class MahasiswaDemo04
```JAVA
package BruteForceDivideConquer.Praktikum05;


public class MahasiswaDemo04 {
    public static void main(String[] args) {
        MahasiswaBerprestasi04 list = new MahasiswaBerprestasi04();

        Mahasiswa04 m1 = new Mahasiswa04("123", "Zidan", "2A", 3.2);
        Mahasiswa04 m2 = new Mahasiswa04("124", "Ayu", "2A", 3.5);
        Mahasiswa04 m3 = new Mahasiswa04("125", "Sofi", "2A", 3.1);
        Mahasiswa04 m4 = new Mahasiswa04("126", "Sita", "2A", 3.9);
        Mahasiswa04 m5 = new Mahasiswa04("127", "Miki", "2A", 3.7);


        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();
    
}
}
```

### 5.3.6 Verifikasi Hasil percobaan

```
Data mahasiswa sebelum sorting: 
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
-----------------------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
-----------------------------
Nama: Sofi
NIM: 125
Kelas: 2A
IPK: 3.1
-----------------------------
Nama: Sita
NIM: 126
Kelas: 2A
IPK: 3.9
-----------------------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
-----------------------------
Data yang sudah terurut menggunakan SELECTION SORT (ASC)
Nama: Sofi
NIM: 125
Kelas: 2A
IPK: 3.1
-----------------------------
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
-----------------------------
Nama: Ayu
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
-----------------------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
-----------------------------
Nama: Sita
NIM: 126
Kelas: 2A
IPK: 3.9
-----------------------------

```


### 5.3.7 Pertanyaan
Didalam methos selection sort, terdapat baris program seperti di bawah ini:
```JAVA
 int idxMin = i;
    for (int j = i + 1; j < listMhs.length; j++) {
        if (listMhs[j] != null && listMhs[idxMin] != null) {
            if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                idxMin = j;
            }
        }
```
Untuk apakah proses tersebut? Jelaskan!

- int idxMin = i; Menetapkan asumsi awal bahwa elemen pada indeks ke-i memiliki nilai terkecil sementara. Indeks tersebut disimpan dalam variabel idxMin.
- for (int j = i + 1; j < listMhs.length; j++) Memulai perulangan untuk memerika sisa elemen yang berada di sebelah kanan indeks i untuk mencari nilai yang berpotensi lebih kecil
- if (listMhs[j] != null && listMhs[idxMin] != null) bagian ini memvalidasi untuk memastikan data pada indeks yang sedang diperiksa tidak kosong (null). Mencegah terjadinya error (NullPointerException) saat mengakses properti objek.
- if (listMhs[j].ipk < listMhs[idxMin].ipk) Proses pembandingan utama yang bertujuan untuk memeriksa apakah IPK pada elemen saat ini (j) lebih kecil dibandingkan IPK pada pemegang rekor terkecil sementara (idxMin)
- idxMin = j; Pengecekan untuk kondisi pembandingan yang terpenuhi (ditemukan IPK yang lebih kecil), maka nilai idxMin diperbarui dengan indeks j.

Kode diatas bertugas untuk memindai (scan) sisa array untuk menemukan indeks dari elemen dengan nilai IPK paling rendah. Setelah perulangan selesai dan indeks terkecil (idxMin) ditemukan secara definitif, indeks tersebut akan digunakan pada tahap selanjutnya untuk menukar (swap) elemen ke posisi yang terurut.


## 5.4 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Instertion Sort

### 5.4.1 Langkah-langkah percobaan

Hasil modifikasai class MahassiswaBerprestasi04
```JAVA
package BruteForceDivideConquer.Praktikum05;

public class MahasiswaBerprestasi04 {
    Mahasiswa04[] listMhs = new Mahasiswa04[5];
    int idx;

    void tambah(Mahasiswa04 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa04 m : listMhs) {
            if (m != null) { 
                m.tampilInformasi();
                System.out.println("-----------------------------");
            }
        }
    }

    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa04 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1] != null && listMhs[j - 1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j] != null && listMhs[idxMin] != null) {
                    if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                        idxMin = j;
                    }
                }
            }
            Mahasiswa04 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j] != null && listMhs[j-1] != null) {
                    if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                        Mahasiswa04 tmp = listMhs[j];
                        listMhs[j] = listMhs[j - 1];
                        listMhs[j - 1] = tmp;
                    }
                }
            }
        }
    }
}
```

Hasil modifikasi class MahasiswaDemo04
```JAVA
package BruteForceDivideConquer.Praktikum05;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        MahasiswaBerprestasi04 list = new MahasiswaBerprestasi04();

        Mahasiswa04 m1 = new Mahasiswa04("123", "Zidan", "2A", 3.2);
        Mahasiswa04 m2 = new Mahasiswa04("124", "Ayu", "2A", 3.5);
        Mahasiswa04 m3 = new Mahasiswa04("125", "Sofi", "2A", 3.1);
        Mahasiswa04 m4 = new Mahasiswa04("126", "Sita", "2A", 3.9);
        Mahasiswa04 m5 = new Mahasiswa04("127", "Miki", "2A", 3.7);


        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
}
}
```


### 5.4.2 Verifikasi Hasil percobaan
```
Data mahasiswa sebelum sorting: 
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
-----------------------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
-----------------------------
Nama: Sofi
NIM: 125
Kelas: 2A
IPK: 3.1
-----------------------------
Nama: Sita
NIM: 126
Kelas: 2A
IPK: 3.9
-----------------------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
-----------------------------
Data yang sudah terurut menggunakan INSERTION SORT (ASC)
Nama: Sofi
NIM: 125
Kelas: 2A
IPK: 3.1
-----------------------------
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
-----------------------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
-----------------------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
-----------------------------
Nama: Sita
NIM: 126
Kelas: 2A
IPK: 3.9
-----------------------------
```

### 5.4.3 Pertanyaan
Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting 
dengan cara descending. 


## 5.5 Latihan praktikum

### 5.5.1 Pertanyaan
Perhatikan class diagram dibawah ini: 

A. Dosen 
- kode: String 
- nama: String 
- jenisKelamin: Boolean 
- usia: int 
- Dosen(kd: String, name: String, jk: Boolean, age:  int) 
- tampil(): void 

B. DataDosen 
- dataDosen: Dosen[10] 
- idx: int 
- tambah(dsn: Dosen): void 
- tampil(): void 
- SortingASC(): void 
- sortingDSC():void 
- insertionSort():void 

Berdasarkan class diagram diatas buatlah menu dikelas main dengan pilihan menu:

1. Tambah data digunakan untuk menambahkan data dosen 
2. Tampil data digunakan untuk menampilkan data seluruh dosen 
3. Sorting ASC digunakan untuk mengurutkan data dosen berdasarkan usia dimulai dari  dosen termuda ke dosen tertua menggunakan bublle Sort. 
4. Sorting DSC digunakan untuk mengurutkan data dosen berdasarkan usia dimulai dari  tertua ke dosen termuda dapat menggunakan algoritma selection sort  atau insertion  sort. 

### 5.5.2 Hasil Kode

Class Dosen
```JAVA
package BruteForceDivideConquer.Praktikum05;

public class Dosen04{
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen04(String kd, String name, Boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        System.out.println("Kode Dosen    : " + kode);
        System.out.println("Nama Dosen    : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia          : " + usia);
        System.out.println("---------------------------------");
    }
}
```

class DataDosen
```JAVA
package BruteForceDivideConquer.Praktikum05;

    public class DataDosen04 {
    Dosen04[] dataDosen = new Dosen04[10];
    int idx = 0;

    void tambah(Dosen04 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Peringatan: Data Dosen sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Data Dosen masih kosong.");
        } else {
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
            }
        }
    }

    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j - 1].usia > dataDosen[j].usia) {
                    Dosen04 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen04 temp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen04 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}
```

class DosenMain
```JAVA
package BruteForceDivideConquer.Praktikum05;

import java.util.Scanner;

public class DosenMain04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen04 listDosen = new DataDosen04();
        
        int pilihan = 0; 

        while (pilihan != 5) {
            System.out.println("\n=== MENU MANAJEMEN DATA DOSEN ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Seluruh Data Dosen");
            System.out.println("3. Sorting ASC (Termuda ke Tertua - Bubble Sort)");
            System.out.println("4. Sorting DSC (Tertua ke Termuda - Selection/Insertion Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            if (pilihan == 1) {
                System.out.println("\n--- Masukkan Data Dosen ---");
                System.out.print("Kode Dosen    : ");
                String kode = sc.nextLine();
                System.out.print("Nama Dosen    : ");
                String nama = sc.nextLine();
                System.out.print("Jenis Kelamin (L/P) : ");
                String jkInput = sc.nextLine();
                Boolean jenisKelamin = jkInput.equalsIgnoreCase("L"); 
                System.out.print("Usia          : ");
                int usia = sc.nextInt();
                Dosen04 dsnBaru = new Dosen04(kode, nama, jenisKelamin, usia);
                listDosen.tambah(dsnBaru);
                System.out.println("-> Data berhasil ditambahkan!");

            } else if (pilihan == 2) {
                System.out.println("\n=== DATA KESELURUHAN DOSEN ===");
                listDosen.tampil();

            } else if (pilihan == 3) {
                System.out.println("\n=== DATA DOSEN (URUTAN ASCENDING / TERMUDA) ===");
                listDosen.SortingASC();
                listDosen.tampil();

            } else if (pilihan == 4) {
                System.out.println("\n=== DATA DOSEN (URUTAN DESCENDING / TERTUA) ===");
                listDosen.sortingDSC(); 
                listDosen.tampil();

            } else if (pilihan == 5) {
                System.out.println("Keluar dari program. Terima kasih!");

            } else {
                System.out.println("Pilihan tidak valid! Silakan pilih 1-5.");
            }
        }
        
        sc.close();
    }
}
```

### 5.5.3 Hasil Running Kode

1. Tambah data dosen
```
=== MENU MANAJEMEN DATA DOSEN ===
1. Tambah Data Dosen
2. Tampil Seluruh Data Dosen
3. Sorting ASC (Termuda ke Tertua - Bubble Sort)
4. Sorting DSC (Tertua ke Termuda - Selection/Insertion Sort)
5. Keluar
Pilih menu (1-5): 1

--- Masukkan Data Dosen ---
Kode Dosen    : 123 
Nama Dosen    : Andi
Jenis Kelamin (L/P) : L
Usia          : 33
-> Data berhasil ditambahkan!

=== MENU MANAJEMEN DATA DOSEN ===
1. Tambah Data Dosen
2. Tampil Seluruh Data Dosen
3. Sorting ASC (Termuda ke Tertua - Bubble Sort)
4. Sorting DSC (Tertua ke Termuda - Selection/Insertion Sort)
5. Keluar
Pilih menu (1-5): 1

--- Masukkan Data Dosen ---
Kode Dosen    : 456
Nama Dosen    : Budi
Jenis Kelamin (L/P) : L
Usia          : 22
-> Data berhasil ditambahkan!

=== MENU MANAJEMEN DATA DOSEN ===
1. Tambah Data Dosen
2. Tampil Seluruh Data Dosen
3. Sorting ASC (Termuda ke Tertua - Bubble Sort)
4. Sorting DSC (Tertua ke Termuda - Selection/Insertion Sort)
5. Keluar
Pilih menu (1-5): 1

--- Masukkan Data Dosen ---
Kode Dosen    : 789
Nama Dosen    : Cinta
Jenis Kelamin (L/P) : P
Usia          : 44
-> Data berhasil ditambahkan!
```

2. Tampil Data Dosen
```
=== MENU MANAJEMEN DATA DOSEN ===
1. Tambah Data Dosen
2. Tampil Seluruh Data Dosen
3. Sorting ASC (Termuda ke Tertua - Bubble Sort)
4. Sorting DSC (Tertua ke Termuda - Selection/Insertion Sort)
5. Keluar
Pilih menu (1-5): 2

=== DATA KESELURUHAN DOSEN ===
Kode Dosen    : 123
Nama Dosen    : Andi
Jenis Kelamin : Laki-laki
Usia          : 33
---------------------------------
Kode Dosen    : 456
Nama Dosen    : Budi
Jenis Kelamin : Laki-laki
Usia          : 22
---------------------------------
Kode Dosen    : 789
Nama Dosen    : Cinta
Jenis Kelamin : Perempuan
Usia          : 44
---------------------------------
``` 

3. Sorting Ascending
```
Sorting ASC
=== MENU MANAJEMEN DATA DOSEN ===
1. Tambah Data Dosen
2. Tampil Seluruh Data Dosen
3. Sorting ASC (Termuda ke Tertua - Bubble Sort)
4. Sorting DSC (Tertua ke Termuda - Selection/Insertion Sort)
5. Keluar
Pilih menu (1-5): 3

=== DATA DOSEN (URUTAN ASCENDING / TERMUDA) ===
Kode Dosen    : 456
Nama Dosen    : Budi
Jenis Kelamin : Laki-laki
Usia          : 22
---------------------------------
Kode Dosen    : 123
Nama Dosen    : Andi
Jenis Kelamin : Laki-laki
Usia          : 33
---------------------------------
Kode Dosen    : 789
Nama Dosen    : Cinta
Jenis Kelamin : Perempuan
Usia          : 44
---------------------------------
```

4. Sorting Descending
```
=== MENU MANAJEMEN DATA DOSEN ===
1. Tambah Data Dosen
2. Tampil Seluruh Data Dosen
3. Sorting ASC (Termuda ke Tertua - Bubble Sort)
4. Sorting DSC (Tertua ke Termuda - Selection/Insertion Sort)
5. Keluar
Pilih menu (1-5): 4

=== DATA DOSEN (URUTAN DESCENDING / TERTUA) ===
Kode Dosen    : 789
Nama Dosen    : Cinta
Jenis Kelamin : Perempuan
Usia          : 44
---------------------------------
Kode Dosen    : 123
Nama Dosen    : Andi
Jenis Kelamin : Laki-laki
Usia          : 33
---------------------------------
Kode Dosen    : 456
Nama Dosen    : Budi
Jenis Kelamin : Laki-laki
Usia          : 22
---------------------------------

=== MENU MANAJEMEN DATA DOSEN ===
1. Tambah Data Dosen
2. Tampil Seluruh Data Dosen
3. Sorting ASC (Termuda ke Tertua - Bubble Sort)
4. Sorting DSC (Tertua ke Termuda - Selection/Insertion Sort)
5. Keluar
```