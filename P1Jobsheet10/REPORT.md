|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020087|
| Nama |  Aryakavi Raditya Imaran |
| Kelas | TI - 1F |
| Repository | ([https://github.com/aryakavi/Algoritma-dan-Struktur-Data]) |

# JOBSHEET 10 : QUEUE

## 2.1 Operasi Dasar Queue
Pada percobaan ini, kita akan menerapkan operasi dasar pada algoritma Queue. 

### 2.1.1 Langkah-langkah Percobaan

Class Queue
```JAVA
public class Queue4 {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue4(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(int dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public int Dequeue() {
        int dt = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
}
```

Class QueueMain
```JAVA
import java.util.Scanner;
public class QueueMain4 {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();

        Queue4 Q = new Queue4(n);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
```

### 2.1.2 Verifikasi Hasil Percobaan

```
Masukkan kapasitas queue: 4
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
-----------------
1
Masukkan data baru: 15
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
-----------------
1
Masukkan data baru: 31
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
-----------------
4
Elemen terdepan: 15
```

### 2.1.3 Pertanyaan 

1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0? 

    Nilai front dan rear diinisialisasi dengan -1 sebagai penanda bahwa queue kosong dan belum ada indeks array yang sedang ditunjuk (di Java, indeks array dimulai dari 0 dan -1 berarti tidka menunjuk elemen apapun). Sementara Size bernilai 0 karenabelum ada data atau elemen tersimpan di dalam queue

2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut! 
```JAVA 
if(rear == max -1) {
    rear = 0;
}
```

    Kode ini adalah kode yang menjalankan queue di Enqueue. Jika posisi rear elemen paling belakang sudah berada di batas akhir indeks array (max - 1), tetapi queue belum penuh, maka penunjuk rear akan digeser ke indeks aawal yaitu 0.  

3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut! 
```JAVA 
if(front == max -1) {
    front = 0;
}
```

    Kode ini sedikit berbeda dengan yang enqueue karena ini kode untuk bagian dequeue. Ketika elemen diambil, penunjuk front akan bergeser ke belakang. Jika pointer front sudah di indeks paling akhir array (max - 1) dan masih ada data yang mengantri, maka pointer front dikembalikan ke indeks 0 agar bisa membaca elemen berikutnya dengan benar.

4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front? 

    Karena di struktur queue, elemen terdepan ditunjuk sebagai variabel front. Jika perulangan dimulai dari indeks 0, maka urutan yang tercetak akan salah dan mencetak array kosong yang datanya sudah di Dequeue. Print dari front memastikan data tampil sesuai urutan antrean queue.

5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut! 
```JAVA
i = (i + 1) % max;
```

    Kode tersebut adalah kode untuk melakukan increment atau penambahan nilai. Operator modulo (%) memastikan bahwa nilai i+1 sama seperti kapasitas maksimal array (max), maka nilainya akan 0. 
        Contohnya, jika max = 5 dan i = 4, maka (4+1)%5 akan menghasilkan 0. Memastkan bahwa proses print dari belakang ke depan array tanpa membuat error IndexOutOfBounds.

6. Tunjukkan potongan kode program yang merupakan queue overflow! 

    Queue overflow terjadi saat program menambah data ke dalam antrian yang penuh kapasitasnya. Kode ini dapat ditemukan di method Enqueue :
    ```JAVA
        if (IsFull()) {
        System.out.println("Queue sudah penuh");
    }   
    ```

7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!

    Untuk menghentikan program secara paksa saat terjadi overflow atau underflow, maka bisa menambakan perintah system.exit (0) di bagian enqueue dan dequeue.
    - method enqueue :
    ```JAVA
    public void Enqueue(int dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh (Overflow). Program dihentikan.");
            System.exit(0); // <--- Kode untuk menghentikan program
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }
    ```

    - method dequeue :
    ```JAVA
    public int Dequeue() {
    int dt = 0;
    if (IsEmpty()) {
        System.out.println("Queue masih kosong (Underflow). Program dihentikan.");
        System.exit(0); // <--- Kode untuk menghentikan program
    } else {
        dt = data[front];
        size--;
        if (IsEmpty()) {
            front = rear = -1;
        } else {
            if (front == max - 1) {
                front = 0;
            } else {
                front++;
            }
        }
    }
    return dt;
    }
    ```


## 2.2 Antrian Layanan Akademik 
Pada percobaan ini, kita akan membuat program yang mengilustrasikan Layanan pada Admin Akademik. 

### 2.2.1. Langkah-langkah Percobaan 

Class Mahasiswa
```JAVA
public class Mahasiswa4 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public Mahasiswa4(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
```

Class AntrianLayanan
```JAVA
public class AntrianLayanan4 {
    Mahasiswa4[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan4(int max) {
        this.max = max;
        this.data = new Mahasiswa4[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahAntrian(Mahasiswa4 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public Mahasiswa4 layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa4 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }
}
```

class LayananAkademikSIAKAD4
```JAVA
import java.util.Scanner;

public class LayananAkademikSIAKAD4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan4 antrian = new AntrianLayanan4(5);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa4 mhs = new Mahasiswa4(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa4 dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.println("Melayani mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
```

### 2.2.2 Verifikasi Hasil Percobaan

```
=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 1
NIM   : 123
Nama  : Aldi
Prodi : TI
Kelas : 1A
Aldi berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 1
NIM   : 124
Nama  : Bobi
Prodi : TI
Kelas : 1G
Bobi berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 4
Daftar Mahasiswa dalam Antrian:
NIM - NAMA - PRODI - KELAS
1. 123 - Aldi - TI - 1A
2. 124 - Bobi - TI - 1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 2
Melayani mahasiswa: 
123 - Aldi - TI - 1A

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 4
Daftar Mahasiswa dalam Antrian:
NIM - NAMA - PRODI - KELAS
1. 124 - Bobi - TI - 1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 5
Jumlah dalam antrian: 1

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 0
Terima kasih.
PS D:\Algoritma-dan-Struktur-Data> 
```

### 2.2.3 Pertanyaan
Lakukan modifikasi program dengan menambahkan method baru bernama LihatAkhir pada class AntrianLayanan yang digunakan untuk mengecek antrian yang berada di posisi belakang. Tambahkan pula daftar menu 6. Cek Antrian paling belakang pada class LayananAkademikSIAKAD sehingga method LihatAkhir dapat dipanggil!

    Perubahan modifikasi dilakukan di class AntrianLayanan4
```JAVA
import java.util.ArrayList;

public class AntrianLayanan4 {
    ArrayList<Mahasiswa4> data;
    int max;

    public AntrianLayanan4(int max) {
        this.max = max;
        this.data = new ArrayList<>();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public boolean isFull() {
        return data.size() == max;
    }

    public void tambahAntrian(Mahasiswa4 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        data.add(mhs);
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public Mahasiswa4 layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        // Menghapus dan mengambil data pada indeks pertama (terdepan)
        return data.remove(0); 
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data.get(0).tampilkanData();
        }
    }

    // Method Baru: Mengecek mahasiswa di antrian paling belakang
    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa paling belakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            // Mengambil data pada indeks terakhir
            data.get(data.size() - 1).tampilkanData(); 
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < data.size(); i++) {
            System.out.print((i + 1) + ". ");
            data.get(i).tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return data.size();
    }
}
```

Perubahan LayananAkademinSIAKAD4.java
```JAVA
import java.util.Scanner;

public class LayananAkademikSIAKAD4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan4 antrian = new AntrianLayanan4(5);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Cek Antrian paling belakang"); // Penambahan menu 6
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa4 mhs = new Mahasiswa4(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa4 dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.println("Melayani mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 6: // Case baru untuk mengeksekusi method lihatAkhir()
                    antrian.lihatAkhir();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
```

## 2.3 Tugas
Buatlah program antrian untuk mengilustasikan antrian persetujuan Kartu Rencana Studi (KRS) Mahasiswa oleh Dosen Pembina Akademik (DPA). Ketika seorang mahasiswa akan mengantri, maka dia harus mendaftarkan datanya (data mahasiswa seperti pada praktikum 2). Gunakan class untuk antrian seperti pada Praktikum 1 dan 2, dengan method-method yang berfungsi : 
• Cek antrian kosong, Cek antrian penuh, Mengosongkan antrian. 
• Menambahkan antrian, Memanggil antrian untuk proses KRS – setiap 1x panggilan terdiri dari 2 mahasiswa (pada antrian no 1 dan 2) 
• Menampilkan semua antrian, Menampilkan 2 antrian terdepan, Menampilkan antrian paling akhir. 
• Cetak jumlah antrian, Cetak jumlah yang sudah melakukan proses KRS 
• Jumlah antrian maximal 10, jumlah yang ditangani masing-masing DPA 30 mahasiswa, cetak jumlah mahasiswa yang belum melakukan proses KRS.  
Gambarkan Diagram Class untuk antriannya. Implementasikan semua method menggunakan menu pilihan pada fungsi main. 

1. Diagram Class
--------------------------------------------------
    - Mahasiswa 

        nim: String

        nama: String

        prodi: String

        kelas: String

        Mahasiswa(nim: String, nama: String, prodi: String, kelas: String)

        tampilkanData(): void

--------------------------------------------------
    - AntrianKRS
    
        data: Mahasiswa[]
        
        front: int
        
        rear: int
        
        size: int

        max: int

        kuotaDPA: int

        jumlahDiproses: int

        AntrianKRS(n: int)

        isEmpty(): boolean

        isFull(): boolean

        clear(): void

        enqueue(mhs: Mahasiswa): void

        prosesKRS(): void

        tampilkanSemua(): void

        lihatDuaTerdepan(): void

        lihatPalingAkhir(): void

        cetakJumlahAntrian(): void

        cetakJumlahDiproses(): void

        cetakBelumProses(): void
-------------------------------------------------

2. Kode Program

CLass Mahasiswa
```JAVA
public class Mahasiswa {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public Mahasiswa(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
```

Class AntrianKRS
```JAVA
public class AntrianKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int kuotaDPA;
    int jumlahDiproses;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.kuotaDPA = 30; 
        this.jumlahDiproses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        if (!isEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh (Maksimal " + max + " mahasiswa)!");
        } else if (jumlahDiproses + size >= kuotaDPA) {
            System.out.println("Maaf, kuota DPA sudah penuh. Mahasiswa tidak bisa mendaftar antrian lagi.");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrian KRS.");
        }
    }

    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian KRS kosong. Tidak ada yang bisa dipanggil.");
            return;
        }

        int jumlahPanggilan = Math.min(2, size);
        
        System.out.println("--- PANGGILAN PROSES KRS ---");
        for (int i = 0; i < jumlahPanggilan; i++) {
            Mahasiswa mhs = data[front];
            System.out.print("Memanggil antrian ke-" + (i + 1) + ": ");
            mhs.tampilkanData();
            
            front = (front + 1) % max;
            size--;
            jumlahDiproses++;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("--- Daftar Antrian KRS Saat Ini ---");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    public void lihatDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("--- 2 Antrian Terdepan ---");
            int jumlahTampil = Math.min(2, size);
            for (int i = 0; i < jumlahTampil; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    public void lihatPalingAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("--- Antrian Paling Akhir ---");
            data[rear].tampilkanData();
        }
    }

    public void cetakJumlahAntrian() {
        System.out.println("Jumlah mahasiswa yang sedang mengantri saat ini: " + size);
    }

    public void cetakJumlahDiproses() {
        System.out.println("Jumlah mahasiswa yang SUDAH selesai proses KRS: " + jumlahDiproses);
    }

    public void cetakBelumProses() {
        int sisaKuota = kuotaDPA - jumlahDiproses;
        System.out.println("Sisa kuota mahasiswa DPA yang BELUM proses KRS: " + sisaKuota + " dari total " + kuotaDPA);
    }
}
```


Class MainKRS
```JAVA
import java.util.Scanner;

public class MainKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        AntrianKRS antrian = new AntrianKRS(10);
        int menu;

        do {
            System.out.println("\n=========================================");
            System.out.println("     SISTEM ANTRIAN KRS DPA");
            System.out.println("=========================================");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil Antrian untuk Proses KRS (2 orang)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Cek Statistik Antrian");
            System.out.println("7. Kosongkan Seluruh Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.println("\n-- Pendaftaran Antrian --");
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    
                    Mahasiswa mhsBaru = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.enqueue(mhsBaru);
                    break;
                case 2:
                    System.out.println();
                    antrian.prosesKRS();
                    break;
                case 3:
                    System.out.println();
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    System.out.println();
                    antrian.lihatDuaTerdepan();
                    break;
                case 5:
                    System.out.println();
                    antrian.lihatPalingAkhir();
                    break;
                case 6:
                    System.out.println("\n-- Statistik Antrian KRS --");
                    antrian.cetakJumlahAntrian();
                    antrian.cetakJumlahDiproses();
                    antrian.cetakBelumProses();
                    break;
                case 7:
                    System.out.println();
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("\nTerima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("\nPilihan menu tidak valid!");
            }
        } while (menu != 0);

        sc.close();
    }
}
```

Hasil runningan 
```
=========================================
     SISTEM ANTRIAN KRS DPA
=========================================
1. Tambah Mahasiswa ke Antrian
2. Panggil Antrian untuk Proses KRS (2 orang)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Antrian Terdepan
5. Tampilkan Antrian Paling Akhir
6. Cek Statistik Antrian
7. Kosongkan Seluruh Antrian
0. Keluar
Pilih Menu: 1

-- Pendaftaran Antrian --
NIM   : 123
Nama  : Aryakavi
Prodi : Informatika
Kelas : 1F
Aryakavi berhasil masuk ke antrian KRS.

=========================================
     SISTEM ANTRIAN KRS DPA
=========================================
1. Tambah Mahasiswa ke Antrian
2. Panggil Antrian untuk Proses KRS (2 orang)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Antrian Terdepan
5. Tampilkan Antrian Paling Akhir
6. Cek Statistik Antrian
7. Kosongkan Seluruh Antrian
0. Keluar
Pilih Menu: 1

-- Pendaftaran Antrian --
NIM   : 456
Nama  : Raditya
Prodi : SIB
Kelas : 1A
Raditya berhasil masuk ke antrian KRS.

=========================================
     SISTEM ANTRIAN KRS DPA
=========================================
1. Tambah Mahasiswa ke Antrian
2. Panggil Antrian untuk Proses KRS (2 orang)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Antrian Terdepan
5. Tampilkan Antrian Paling Akhir
6. Cek Statistik Antrian
7. Kosongkan Seluruh Antrian
0. Keluar
Pilih Menu: 1

-- Pendaftaran Antrian --
NIM   : 789
Nama  : Imaran
Prodi : Informatika
Kelas : 1I
Imaran berhasil masuk ke antrian KRS.

=========================================
     SISTEM ANTRIAN KRS DPA
=========================================
1. Tambah Mahasiswa ke Antrian
2. Panggil Antrian untuk Proses KRS (2 orang)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Antrian Terdepan
5. Tampilkan Antrian Paling Akhir
6. Cek Statistik Antrian
7. Kosongkan Seluruh Antrian
0. Keluar
Pilih Menu: 3

--- Daftar Antrian KRS Saat Ini ---
1. 123 - Aryakavi - Informatika - 1F
2. 456 - Raditya - SIB - 1A
3. 789 - Imaran - Informatika - 1I

=========================================
     SISTEM ANTRIAN KRS DPA
=========================================
1. Tambah Mahasiswa ke Antrian
2. Panggil Antrian untuk Proses KRS (2 orang)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Antrian Terdepan
5. Tampilkan Antrian Paling Akhir
6. Cek Statistik Antrian
7. Kosongkan Seluruh Antrian
0. Keluar
Pilih Menu: 4

--- 2 Antrian Terdepan ---
1. 123 - Aryakavi - Informatika - 1F
2. 456 - Raditya - SIB - 1A

=========================================
     SISTEM ANTRIAN KRS DPA
=========================================
1. Tambah Mahasiswa ke Antrian
2. Panggil Antrian untuk Proses KRS (2 orang)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Antrian Terdepan
5. Tampilkan Antrian Paling Akhir
6. Cek Statistik Antrian
7. Kosongkan Seluruh Antrian
0. Keluar
Pilih Menu: 5

--- Antrian Paling Akhir ---
789 - Imaran - Informatika - 1I

=========================================
     SISTEM ANTRIAN KRS DPA
=========================================
1. Tambah Mahasiswa ke Antrian
2. Panggil Antrian untuk Proses KRS (2 orang)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Antrian Terdepan
5. Tampilkan Antrian Paling Akhir
6. Cek Statistik Antrian
7. Kosongkan Seluruh Antrian
0. Keluar
Pilih Menu: 6

-- Statistik Antrian KRS --
Jumlah mahasiswa yang sedang mengantri saat ini: 3
Jumlah mahasiswa yang SUDAH selesai proses KRS: 0
Sisa kuota mahasiswa DPA yang BELUM proses KRS: 30 dari total 30

=========================================
     SISTEM ANTRIAN KRS DPA
=========================================
1. Tambah Mahasiswa ke Antrian
2. Panggil Antrian untuk Proses KRS (2 orang)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Antrian Terdepan
5. Tampilkan Antrian Paling Akhir
6. Cek Statistik Antrian
7. Kosongkan Seluruh Antrian
0. Keluar
Pilih Menu: 2

--- PANGGILAN PROSES KRS ---
Memanggil antrian ke-1: 123 - Aryakavi - Informatika - 1F
Memanggil antrian ke-2: 456 - Raditya - SIB - 1A

=========================================
     SISTEM ANTRIAN KRS DPA
=========================================
1. Tambah Mahasiswa ke Antrian
2. Panggil Antrian untuk Proses KRS (2 orang)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Antrian Terdepan
5. Tampilkan Antrian Paling Akhir
6. Cek Statistik Antrian
7. Kosongkan Seluruh Antrian
0. Keluar
Pilih Menu: 7

Antrian berhasil dikosongkan.

=========================================
     SISTEM ANTRIAN KRS DPA
=========================================
1. Tambah Mahasiswa ke Antrian
2. Panggil Antrian untuk Proses KRS (2 orang)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Antrian Terdepan
5. Tampilkan Antrian Paling Akhir
6. Cek Statistik Antrian
7. Kosongkan Seluruh Antrian
0. Keluar
Pilih Menu: 0

Terima kasih. Program selesai.
PS D:\Algoritma-dan-Struktur-Data> 
```