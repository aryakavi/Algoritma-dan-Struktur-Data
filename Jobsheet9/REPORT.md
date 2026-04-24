|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020087|
| Nama |  Aryakavi Raditya Imaran |
| Kelas | TI - 1F |
| Repository | ([https://github.com/aryakavi/Algoritma-dan-Struktur-Data]) |

# JOBSHEET 9 : STACK

## 2.1 Mahasiswa mengumpulkan tugas
Sejumlah mahasiswa mengumpulkan berkas tugas di meja dosen secara ditumpuk dengan menerapkan prinsip stack. Dosen melakukan penilaian secara terurut mulai dari berkas tugas teratas. Perhatikan Class Diagram Mahasiswa berikut. 

### 2.1.1 Langkah-langkah percobaan
A. Class Mahasiswa04
```JAVA
package Jobsheet9;
public class Mahasiswa04 {
    String nama;
    String nim;
    String kelas;
    int nilai;

    Mahasiswa04(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
```

B. Class StackTugasMahasiswa04
```JAVA
package Jobsheet9;
public class StackTugasMahasiswa04 {
    Mahasiswa04[] stack;
    int top;
    int size;

    public StackTugasMahasiswa04(int size) {
        this.size = size;
        stack = new Mahasiswa04[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa04 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa04 pop() {
        if (!isEmpty()) {
            Mahasiswa04 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa04 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
}
``` 

C. Class Utama 
```JAVA
package Jobsheet9;
import java.util.Scanner;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        StackTugasMahasiswa04 stack = new StackTugasMahasiswa04(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa04 mhs = new Mahasiswa04(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa04 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;
                case 3:
                    Mahasiswa04 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
```

### 2.1.2 Verifikasi Hasil Percobaan
```
Menu:
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama: Dila
NIM: 1001
Kelas: 1A
Tugas Dila berhasil dikumpulkan

Menu:
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama: Erik
NIM: 1002
Kelas: 1B
Tugas Erik berhasil dikumpulkan

Menu:
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 3
Tugas terakhir dikumpulkan oleh Erik

Menu:
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama: Tika
NIM: 1003
Kelas: 1C
Tugas Tika berhasil dikumpulkan

Menu:
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 4
Daftar semua tugas
Nama    NIM     Kelas
Dila    1001    1A
Erik    1002    1B
Tika    1003    1C


Menu:
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 2
Menilai tugas dari Tika
Masukkan nilai (0-100): 87
Nilai Tugas Tika adalah 87

Menu:
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 4
Daftar semua tugas
Nama    NIM     Kelas
Dila    1001    1A
Erik    1002    1B

PS D:\Algoritma-dan-Struktur-Data> 
```

### 2.1.3 Pertanyaan
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana yang perlu diperbaiki? 

Bagian kode yang perlu diperbaiki adalah di bagian StackTugasMAhasiswa04.java di method print()
```JAVA
public void print() {
    for (int i = 0; i <= top; i++) {
        // ...
```
Seharusnya agar mencetak dari indeks top (atas) ke zero (bawah)
```JAVA
public void print() {
    if (!isEmpty()) {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    } else {
        System.out.println("Stack kosong");
    }
}
```

2. Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan kode programnya! 

Berdasarkan kode di StackTugasMahasiswa04.java
```JAVA
StackTugasMahasiswa04 stack = new StackTugasMahasiswa04(5);
```
Kode mampu menampung maksimal 5 data tugas mahasiswa


3. Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut dihapus, apa dampaknya? 

A. Fungsi !isFull() digunakan untuk struktur data array statis. !isFull() memastikan bahwa array stack memiliki ruang kosong sebelum menambahkan data baru.

B. Jika if-else dihapus dan dipaksakan memasukkan data ke-6, variabel top akan bertambah menjadi 5. Jadi saat program mencoba meyimpan di stack[5] program akan crash dan menampilkan ArrayOutofBounds dikarenakan mengisi data melebihi dari limit array yang sudah disediakan.


4. Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi lihat tugas terbawah!

Karena tugas yang pertama kali dikumpulkan selalu mengisi dasar tumpuklan, maka tugas akan selalu di indeks 0. Solusinya ialah, menambahkan method peek bottom agar 
```JAVA
public Mahasiswa04 peekBottom() {
    if (!isEmpty()) {
        return stack[0]; // Tugas pertama selalu di indeks 0
    } else {
        System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
        return null;
    }
}
```
Tambahan perubahan untuk menu di MahasiswDemo04.java
```JAVA
case 5:
    Mahasiswa04 lihatBawah = stack.peekBottom();
        if (lihatBawah != null) {
            System.out.println("Tugas pertama kali dikumpulkan oleh " + lihatBawah.nama);
        }
    break;
```

5. Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat ini, serta tambahkan operasi menunya! 

Agar dapat menambahkan fungsi di dalam StackTugasMahasiswa04.java yang menghitung jumlah tugas saay ini ialah dengan menambahkan fungsi yang menambahkan +1 dari indeks top yang ada
```JAVA
public int getJumlahTugas() {
    return top + 1;
}
```
Tambahan perubahan untuk menu di MahasiswDemo04.java
```JAVA
case 6: 
    System.out.println("Jumlah tugas saat ini di dalam tumpukan: " + stack.getJumlahTugas());
    break;
```


6. Commit dan push kode program ke Github

    👍

## Percobaan 2: Konversi Nilai Tugas ke Biner
Sampai tahap ini, proses pengelolaan data tugas mahasiswa menggunakan konsep Stack telah berhasil dibuat pada Percobaan 1. Selanjutnya, pada Percobaan 2 ini ditambahkan method baru yang berfungsi untuk mengonversi nilai tugas bertipe int ke dalam bentuk biner setelah tugas tersebut diberi nilai dan dikeluarkan dari Stack.

### 2.2.1 Langkah-langkah Percobaan
Penambahan method konversiDesimalKeBinerdi StackTugasMahasiswa04.java
```JAVA
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi04 stack = new StackKonversi04();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
```

Penambahan class StackKonversi04.java
```JAVA
package Jobsheet9;
public class StackKonversi04 {
    int[] tumpukanBiner;
    int size;
    int top;

    public StackKonversi04() {
        this.size = 32; //asumsi 32 bit
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong.");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
```

Penambahan line baru di method pop di class MahasiswaDemo04.java
```JAVA
//... System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
    String biner = stack.konversiDesimalKeBiner(nilai);
    System.out.println("Nilai Biner Tugas: " + biner);
//... } break;
```

### 2.2.2 Verifikasi Hasil Percobaan
```
Menu:
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah (Pertama Dikumpulkan)
6. Melihat Jumlah Tugas Saat Ini
Pilih: 2
Menilai tugas dari Tika
Masukkan nilai (0-100): 87
Nilai Tugas Tika adalah 87
Nilai Biner Tugas: 1010111

Menu:
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah (Pertama Dikumpulkan)
6. Melihat Jumlah Tugas Saat Ini
Pilih: 7
Pilihan tidak valid.
PS D:\Algoritma-dan-Struktur-Data> 
```

### 2.2.3 Pertanyaan


## 2.4 Latihan Praktikum
Mahasiswa mengajukan surat izin (karena sakit atau keperluan lain) setiap kali tidak mengikuti perkuliahan. Surat terakhir yang masuk akan diproses atau divalidasi lebih dulu oleh admin Prodi. Perhatikan class diagram berikut.