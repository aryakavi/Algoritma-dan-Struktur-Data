|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020087|
| Nama |  Aryakavi Raditya Imaran |
| Kelas | TI - 1F |
| Repository | ([https://github.com/aryakavi/Algoritma-dan-Struktur-Data]) |

# JOBSHEET 11 : LINKED LIST

## 2.1 Pembuatan Single Linked List 
Didalam praktikum ini, kita akan mempraktekkan bagaimana membuat Single Linked List dengan representasi data berupa Node, pengaksesan linked list dan metode penambahan data. 

### 2.1.1 Langkah-langkah Percobaan

Class Mahasiswa04
```JAVA
package Pertemuan12;

public class Mahasiswa04 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa04() {
    }

    public Mahasiswa04(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Kelas: " + kelas + ", IPK: " + ipk);
    }
}
```

Class Node04
```JAVA
package Pertemuan12;

public class Node04 {
    Mahasiswa04 data;
    Node04 next;

public Node04(Mahasiswa04 data, Node04 next) {
        this.data = data;
        this.next = next;
    }
}
```

Class SingleLinkedList04
```JAVA
package Pertemuan12;

public class SingleLinkedList04 {
    Node04 head;
    Node04 tail;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            Node04 tmp = head;
            System.out.print("Isi Linked List:\n");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(Mahasiswa04 input) {
        Node04 ndInput = new Node04(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa04 input) {
        Node04 ndInput = new Node04(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa04 input) {
        Node04 ndInput = new Node04(input, null);
        Node04 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa04 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node04 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node04(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
```

Class SLLMain04
```JAVA
package Pertemuan12;

public class SLLMain04 {
    public static void main(String[] args) {
        SingleLinkedList04 sll = new SingleLinkedList04();

        Mahasiswa04 mhs1 = new Mahasiswa04("2541001", "Dirga", "1A", 3.8); 
        Mahasiswa04 mhs2 = new Mahasiswa04("2541002", "Anton", "1A", 3.6);
        Mahasiswa04 mhs3 = new Mahasiswa04("2541003", "Budi", "1A", 3.7);
        Mahasiswa04 mhs4 = new Mahasiswa04("2541004", "Tari", "1A", 3.9);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
```

### 2.1.2 Verifikasi Hasil Percobaan 
```
Linked list kosong
Isi Linked List:
NIM: 2541004, Nama: Tari, Kelas: 1A, IPK: 3.9

Isi Linked List:
NIM: 2541004, Nama: Tari, Kelas: 1A, IPK: 3.9
NIM: 2541001, Nama: Dirga, Kelas: 1A, IPK: 3.8

Isi Linked List:
NIM: 2541004, Nama: Tari, Kelas: 1A, IPK: 3.9
NIM: 2541001, Nama: Dirga, Kelas: 1A, IPK: 3.8
NIM: 2541002, Nama: Anton, Kelas: 1A, IPK: 3.6
NIM: 2541003, Nama: Budi, Kelas: 1A, IPK: 3.7

PS D:\Algoritma-dan-Struktur-Data> 
```


### 2.1.3 pertanyaan
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”? 

    Linked list kosong karenaa di baris kode pertama di fungsi main, method yang dipanggil adalah sll.print(). Disaat baris itu dijalankan, objek SingleLinkedList04 baru saja dibuat (SingleLinkedList04 sll = new SingleLinkedList04();) dan belum ada data (node) yang ditambahkan didalamnya.

2. Jelaskan kegunaan variable temp secara umum pada setiap method! 

    Variabel temp yang ada di Node04 berfungsi sebagai pointer untuk traverse atau mencari elemen elemen di dalam LinkedList. Selain itu rolenya adalah
    - Untuk menjaga titik awal (head), variabel head tidak bisa digunakan untuk menelusuri list karena jika head berpindah, maka akan kehilangan referensi ke titik awal dari Linked List tersebut. Data yang sebelumnya akan dan bisa hilang atau tidak bisa diakses lagi.
    - Berjalan dari node ke node, temp diatur agar bernilai dengan head di awal (Node 04 temp = head;). Lalu temp akan berjalan dari node satu ke node lainnya (temp = temp.next) untuk mencari posisi tertrentu (seperti insertAt dan insertAfter) atau mencetak seluruh data (seperti print)

3. Lakukan modifikasi agar data dapat ditambahkan dari keyboard!

    Perubahan yang terjadi ialad di SLLMain04, dengan menambah import dan scanner
    package Pertemuan12;
    ```JAVA
    import java.util.Scanner;
    public class SLLMain04 {
        public static void main(String[] args) {
            SingleLinkedList04 sll = new SingleLinkedList04();
            Scanner sc = new Scanner(System.in);
            int pilihan;

            Mahasiswa04 mhs1 = new Mahasiswa04("2541001", "Dirga", "1A", 3.8); 
            Mahasiswa04 mhs2 = new Mahasiswa04("2541002", "Anton", "1A", 3.6);
            Mahasiswa04 mhs3 = new Mahasiswa04("2541003", "Budi", "1A", 3.7);
            Mahasiswa04 mhs4 = new Mahasiswa04("2541004", "Tari", "1A", 3.9);

            sll.print();
            sll.addFirst(mhs4);
            sll.print();
            sll.addLast(mhs1);
            sll.print();
            sll.insertAfter("Dirga", mhs3);
            sll.insertAt(2, mhs2);
            sll.print();

            do {
                System.out.println("\n=== Menu Single Linked List ===");
                System.out.println("1. Tambah Data di Awal (addFirst)");
                System.out.println("2. Tambah Data di Akhir (addLast)");
                System.out.println("3. Cetak Seluruh Data (print)");
                System.out.println("0. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = sc.nextInt();
                sc.nextLine(); // Membersihkan buffer scanner

                switch (pilihan) {
                    case 1:
                    case 2:
                        System.out.println("\n--- Masukkan Data Mahasiswa ---");
                        System.out.print("NIM   : ");
                        String nim = sc.nextLine();
                        System.out.print("Nama  : ");
                        String nama = sc.nextLine();
                        System.out.print("Kelas : ");
                        String kelas = sc.nextLine();
                        System.out.print("IPK   : ");
                        double ipk = sc.nextDouble();
                        sc.nextLine(); 

                        Mahasiswa04 mhsBaru = new Mahasiswa04(nim, nama, kelas, ipk);

                        if (pilihan == 1) {
                            sll.addFirst(mhsBaru);
                            System.out.println("-> Data berhasil ditambahkan di posisi awal!");
                        } else {
                            sll.addLast(mhsBaru);
                            System.out.println("-> Data berhasil ditambahkan di posisi akhir!");
                        }
                        break;
                    case 3:
                        System.out.println();
                        sll.print();
                        break;
                    case 0:
                        System.out.println("Terima kasih. Program selesai.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid! Silakan coba lagi.");
                }
            } while (pilihan != 0);

            sc.close();
        }
    }
    ```

## 2.2  Modifikasi Elemen pada Single Linked List 
Didalam praktikum ini, kita akan mempraktekkan bagaimana mengakses elemen, mendapatkan 
indeks dan melakukan penghapusan data pada Single Linked List.

### 2.2.1 Langkah-langkah Percobaan


### 2.2.2 Verifikasi Hasil Percobaan


### 2.2.3 Petanyaan
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan! 
2. Jelaskan kegunaan kode dibawah pada method remove

## 2.3 Tugas
Waktu pengerjaan : 50 menit 
Buatlah implementasi program antrian layanan unit kemahasiswaan sesuai dengan berikut ini :  
    
    a. Implementasi antrian menggunakan Queue berbasis Linked List! 
    
    b. Program merupakan proyek baru bukan modifikasi dari percobaan 
    
    c. Ketika seorang mahasiswa akan mengantri, maka dia harus mendaftarkan datanya 
    
    d. Cek antrian kosong, Cek antrian penuh, Mengosongkan antrian. 
    
    e. Menambahkan antrian 
    
    f. Memanggil antrian  
    
    g. Menampilkan antrian terdepan dan antrian paling akhir 
    
    h. Menampilkan jumlah mahasiswa yang masih mengantre.
