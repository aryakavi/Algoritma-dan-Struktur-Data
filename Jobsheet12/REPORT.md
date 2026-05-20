|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020087 |
| Nama |  Aryakavi Raditya Imaran |
| Kelas | TI - 1F |
| Repository | ([https://github.com/aryakavi/Algoritma-dan-Struktur-Data]) |

# JOBSHEET 12 : DOUBLE LINKED LIST

## 12.1 Tujuan Praktikum 
Setelah melakukan praktikum ini, mahasiswa mampu: 
1. Memahami algoritma double linked list; 
2. Membuat dan mendeklarasikan struktur algoritma double linked list; 
3. Menerapkan operasi penambahan, pencarian, dan penghapusan data pada Double Linked List. 

## 12.2 Percobaan 1: Operasi Penambahan pada Double Linked List 

### 12.2.1 Langkah-Langkah Percobaan 
Pada percobaan 1 ini akan dibuat class Mahasiswa, Node, dan DoubleLinkedList. Class tersebut digunakan untuk mengimplementasikan struktur data Double Linked List beserta beberapa operasi dasar seperti: 
- penambahan data di awal linked list, 
- penambahan data di akhir linked list, 
- pencarian data, 
- penyisipan node setelah data tertentu, 
- dan menampilkan isi linked list.

Class Mahasiswa04
```JAVA
package Jobsheet12;

public class Mahasiswa04 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa04(String nim, String nama, String kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil(){
        System.out.println(
            "NIM      : " + nim +
            "\nNama     : " + nama +
            "\nKelas    : " + kelas +
            "\nIPK      : " + ipk
        );
    }
}
```

Class Node04
```JAVA
package Jobsheet12;

public class Node04 {
    Mahasiswa04 data;
    Node04 prev;
    Node04 next;

    public Node04(Mahasiswa04 data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
```

Class DoublelinkedList04
```JAVA
package Jobsheet12;

public class DoublelinkedList04 {
    Node04 head;
    Node04 tail;

    public DoublelinkedList04() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa04 data) {
        Node04 newNode = new Node04(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa04 data) {
        Node04 newNode = new Node04(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa04 data) {
        Node04 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node04 newNode = new Node04(data);

        // jika current adalah tail, node baru ditambahkan di akhir
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else { // node baru disisipkan di tengah
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node04 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
}
```

Class DoubleLinkedListMain04
```JAVA
package Jobsheet12;
import java.util.Scanner;

public class DoubleLinkedListMain04 {

    public static Mahasiswa04 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM   : ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine(); 
        return new Mahasiswa04(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoublelinkedList04 list = new DoublelinkedList04();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa04 mhsAwal = inputMahasiswa(scan);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa04 mhsAkhir = inputMahasiswa(scan);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String keyNim = scan.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa04 dataBaru = inputMahasiswa(scan);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    // list.removeFirst(); // Method ini baru dibuat pada Percobaan 2
                    break;
                case 5:
                    // list.removeLast(); // Method ini baru dibuat pada Percobaan 2
                    break;
                case 6:
                    list.print();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
        
        scan.close();
    }
}
```

### 12.2.2 Verifikasi Hasil Percobaan

```
===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu: 2
Masukkan NIM   : 123005
Masukkan Nama  : Harry
Masukkan Kelas : 1A
Masukkan IPK   : 3.76

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu: 3
Masukkan NIM yang dicari: 123005
Masukkan data baru: 
Masukkan NIM   : 123010
Masukkan Nama  : Potter
Masukkan Kelas : 1B
Masukkan IPK   : 3.55
Data berhasil disisipkan setelah NIM 123005

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu: 6
NIM      : 123005
Nama     : Harry
Kelas    : 1A
IPK      : 3.76
NIM      : 123010
Nama     : Potter
Kelas    : 1B
IPK      : 3.55

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu: 0
Program selesai.
PS D:\Algoritma-dan-Struktur-Data> 
```

### 12.2.3 Pertanyaan
1. Jelaskan perbedaan struktur dan mekanisme traversal antara Single Linked List dan Double Linked List! 
    - Single linked list = Setiap node hanya memiliki 2 bagian, data itu sendiri dan satu pointer yang menunjuk ke node berikutnya. Traversal hanya bisa dilakukan satu arah, yaitu dari head (awal) ke tail (akhir) dengan pointer next.
    - Double linked list = setiap node memiliki 3 bagian, data itu sendiri dan dua pointer, yaitu next yang menunjuk ke node selanjutnya, dan prev yang menunjuk ke node sebelumnya. Traversal bisa dilakukan dua arah, bisa menelusuri dari head ke tail (dengan next), atau dari tail ke head (dengan prev).

2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Jelaskan fungsi masing-masing atribut tersebut pada proses traversal dan manipulasi node! 
    - next  = Menyimpan referensi dari node setelahnya. saat melakukan traversal, atribut ini berpindah dari satu node ke node berikutnya. Saat manipulasi seperti insert, next diputus dan disambung ulang untuk memasukaan node baru di depan node saat ini.
    - prev  = Menyimpan referensi dari node sebelumnya. Saat melakukan traversal, atribut ini berpindah dari node saat ini ke node sebelumnya. Saat manipulasi seperti insert, prev menyisipkan node yang baru untuk menunjuk kembali ke node asal di belakangnya, sehingga rantai dua arah tersebut tidak terputus.
3. Perhatikan konstruktor pada class DoubleLinkedList. Jelaskan fungsi konstruktor tersebut terhadap kondisi awal linked list! 
    Pada konstruktor DoublelinkedList04 yang telah dibut
    ```JAVA
    public DoublelinkedList04() {
    head = null;
    tail = null;
    }
    ```
    Konstruktor ini dipanggil pertama ketika DoublelinkedList04 dibuat. Konstruktor ini mengatur kondisi awal dari Linked List, yaitu mendefinisikan bahwa Linked List masih kosong. Dengan mengatur head dan tail menjadi null, program tahu bahwa belum ada satupun data didalamnya.

4. Perhatikan potongan kode berikut: 
```JAVA 
if (isEmpty()) { 
head = tail = newNode; 
}
``` 
Mengapa head dan tail harus menunjuk node yang sama ketika linked list masih kosong? 
    Ketika linked list masih kosong, memasukkan node pertama kali membuat node tersebut menjadi satu-satunya elemen di dalam list. Karena ia satu-satunya elemen, maka ia berperan menjadi elemen pertama (head) serta elemen terakhir (tail) disaat bersamaan. Karena itu, kedua pointer (head dan tail) harus menunjuk ke newNode, objek yang sama.

5. Modifikasi method print() agar menampilkan pesan "Linked List masih kosong" ketika tidak terdapat data pada linked list!
    ```JAVA
    public void print() {
        // Tambahan kode ketika list kosong (praktikum 1 pertanyaan 5)
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node04 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
    }
    ```

6. Modifikasi kode program dengan menambahkan method printReverse() untuk menampilkan seluruh data pada Double Linked List secara terbalik, dimulai dari node tail menuju head!
    ```JAVA
    public void printReverse() {
    if (isEmpty()) {
        System.out.println("Linked List masih kosong.");
        return;
    }

    System.out.println("Mencetak Data dari Belakang (Reverse)");
    Node04 current = tail; // Mulai dari node terakhir (tail)
    
    // Looping mundur selama node tidak null
    while (current != null) {
        current.data.tampil();    // print data node
        current = current.prev;   // Pindah ke node sebelumnya dengan pointer prev
    }
    }
    ```

## 12.3 Percobaan 2 : Operasi Penghapusan pada Double Linked List 

### 12.3.1 Langkah-Langkah Percobaan
