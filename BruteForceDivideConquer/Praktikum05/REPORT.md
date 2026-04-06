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
2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort! 
3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan 
```java 
while (j>=0 && data[j]>temp)
```
4. Pada Insertion sort, apakah tujuan dari perintah 
```java
data[j+1]=data[j];
```

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
b. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ? 
c. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i  akan 
berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh? 
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

        System.out.println("data yang sudah terurut menggunakan SELECTION SORT (ASC)");
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
data yang sudah terurut menggunakan SELECTION SORT (ASC)
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
Didalam methos selection sor, terdapat baris program seperti di bawah ini:
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


## 5.4 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Instertion Sort

### 5.4.1 Langkah-langkah percobaan
