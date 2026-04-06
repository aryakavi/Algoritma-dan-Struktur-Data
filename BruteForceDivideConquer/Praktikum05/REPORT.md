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

