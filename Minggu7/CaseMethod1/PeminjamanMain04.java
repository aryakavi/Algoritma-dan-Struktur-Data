package Minggu7.CaseMethod1;

import java.util.Scanner;

public class PeminjamanMain04 {
    // Array untuk menampung data
    static Mahasiswa04[] dataMhs = new Mahasiswa04[3];
    static Buku04[] dataBuku = new Buku04[4];
    static Peminjaman04[] dataPeminjaman = new Peminjaman04[5];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Inisialisasi Data sesuai Studi Kasus
        dataMhs[0] = new Mahasiswa04("22001", "Andi", "Teknik Informatika");
        dataMhs[1] = new Mahasiswa04("22002", "Budi", "Teknik Informatika");
        dataMhs[2] = new Mahasiswa04("22003", "Citra", "Sistem Informasi Bisnis");

        dataBuku[0] = new Buku04("B001", "Algoritma", "2020");
        dataBuku[1] = new Buku04("B002", "Basis Data", "2019");
        dataBuku[2] = new Buku04("B003", "Pemrograman", "2021");
        dataBuku[3] = new Buku04("B004", "Fisika", "2024");

        dataPeminjaman[0] = new Peminjaman04(dataMhs[0], dataBuku[0], 7);
        dataPeminjaman[1] = new Peminjaman04(dataMhs[1], dataBuku[1], 3);
        dataPeminjaman[2] = new Peminjaman04(dataMhs[2], dataBuku[2], 10);
        dataPeminjaman[3] = new Peminjaman04(dataMhs[2], dataBuku[3], 6);
        dataPeminjaman[4] = new Peminjaman04(dataMhs[0], dataBuku[1], 4);

        boolean benar = true;
        while (benar) {
            // Daftar menu
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman}");
            System.out.println("4. Urutkan Berdasarkan Denda");    
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");

            // Input untuk memilihb menu
            System.out.println("Pilih : ");
            int menu = sc.nextInt();
            sc.nextLine();

            // Menjalankan perintah sesuai menu yangb dipilih
            switch (menu) {
                case 1:
                    System.out.println("Daftar Mahassiswa :");
                    for (Mahasiswa04 m : dataMhs) m.tampilMahasiswa();
                    break;
                    
                case 2:
                    System.out.println("Daftar Buku : ");
                    for (Buku04 b : dataBuku) b.tampilBuku();
                break;

                case 3:
                    System.out.println("Data Peminjaman :");
                    for (Peminjaman04 p : dataPeminjaman) p.tampilPeminjaman();
                break;

                case 4:
                    urutkanDendaInsertion();
                break;

                case 5:
                    cariNIM();
                break;

                case 0:
                    benar = false;
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        sc.close();
    }

    // Method mengurutkan denda (descending)
    static void urutkanDendaInsertion() {
    Peminjaman04[] sortedDenda = dataPeminjaman.clone();
        
        for (int i = 1; i < sortedDenda.length; i++) {
            Peminjaman04 temp = sortedDenda[i];
            int j = i;
            // Descending, Menggeser data yang lebih kecil dari temp ke kanan. Tanda < membuat urutan menjadi (Besar ke Kecil)
            while (j > 0 && sortedDenda[j - 1].denda < temp.denda) {
                sortedDenda[j] = sortedDenda[j - 1];
                j--;
            }
        sortedDenda[j] = temp;
        }
    }

    // Mencari NIM menggunakan Binary Search
    static void cariNIM() {
        System.out.print("Masukkan NIM: ");
        String cariNIM = sc.nextLine();

        // Syarat mutlak Binary Search: Data Harus Terurut (Ascending) berdasarkan NIM
        Peminjaman04[] sortedNIM = dataPeminjaman.clone();
        for (int i = 1; i < sortedNIM.length; i++) {
            Peminjaman04 temp = sortedNIM[i];
            int j = i;
            // compareTo > 0 berarti mengurutkan string secara alfabet/numerik menaik (Ascending)
            while (j > 0 && sortedNIM[j - 1].mhs.nim.compareTo(temp.mhs.nim) > 0) {
                sortedNIM[j] = sortedNIM[j - 1];
                j--;
            }
            sortedNIM[j] = temp;
        }

        // Proses Binary Search
        int left = 0; // Batas sebelah kiri
        int right = sortedNIM.length - 1; //Batas sebelah kanan
        int posisiDitemukan = -1; // Variabel penyimpan indeks

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (sortedNIM[mid].mhs.nim.equals(cariNIM)) {
                // Jika data cocok dengan yang dicari, simpan indeks dan hentikan pencarian
                posisiDitemukan = mid;
                break;
            } else if (sortedNIM[mid].mhs.nim.compareTo(cariNIM) < 0) {
                // Jika data tengah lebih kecil dari target, geser batas kiri ke kanan
                left = mid + 1;
            } else {
                // Jika data tengah lebih besar dari target, geser batas kanan ke kiri
                right = mid - 1;
            }
        }
        if (posisiDitemukan != -1) {
            // Karena data kembar berjejer setelah di-sort, kita cari batas paling kiri
            int awal = posisiDitemukan;
            while (awal > 0 && sortedNIM[awal - 1].mhs.nim.equals(cariNIM)) {
                awal--;
            }
            // Cari batas indeks paling kanan yang memiliki NIM yang sama
            int akhir = posisiDitemukan;
            while (akhir < sortedNIM.length - 1 && sortedNIM[akhir + 1].mhs.nim.equals(cariNIM)) {
                akhir++;
            }

            // Menampilkan buku yang dipinjam dalam rentang indeks awal hingga akhir
            for (int i = awal; i <= akhir; i++) {
                sortedNIM[i].tampilPeminjaman();
            }
        } else {
            System.out.println("Data peminjaman dengan NIM " + cariNIM + " tidak ditemukan.");
        }
    }
}
