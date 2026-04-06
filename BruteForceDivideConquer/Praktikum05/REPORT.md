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
Berikut kode saya :

### 5.2.1 Langkah Praktikum 1 

a. SORTING - BUBBLE SORT

class Sorting05
```JAVA
package BruteForceDivideConquer.Praktikum05;

public class Sorting05 {

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

class SortingMain05
```JAVA
package BruteForceDivideConquer.Praktikum05;

public class SortingMain05 {
    public static void main(String[] args) {
        int a[] = {20,10,2,7,12};
        
        Sorting05 dataurut1 = new Sorting05(a, a.length);
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

class Sorting05
```JAVA
package BruteForceDivideConquer.Praktikum05;

public class Sorting05 {

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

class SortingMain05
```JAVA
package BruteForceDivideConquer.Praktikum05;

public class SortingMain05 {
    public static void main(String[] args) {
        int a[] = {20,10,2,7,12};
        
        Sorting05 dataurut1 = new Sorting05(a, a.length);
        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurut dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        int b[] = {30, 20, 2, 8, 14};
        Sorting05 dataurut2 = new Sorting05(b, b.length);
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