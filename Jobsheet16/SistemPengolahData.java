package Jobsheet16;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class SistemPengolahData {
    static Queue<Mahasiswa> queueMahasiswa = new LinkedList<>();
    static List<MataKuliah> listMataKuliah = new ArrayList<>();
    static List<Nilai> listNilai = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initData();
        
        int menu = 0;
        do {
            System.out.println("\n************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("************************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Mahasiswa Terdepan (Queue)"); // Menu Baru
            System.out.println("6. Keluar");
            System.out.println("************************************************");
            System.out.print("Pilih\t: ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    inputNilai();
                    break;
                case 2:
                    tampilNilai();
                    break;
                case 3:
                    cariNilai();
                    break;
                case 4:
                    urutDataNilai();
                    break;
                case 5:
                    hapusMahasiswaQueue(); 
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (menu != 6);
    }

    static void initData() {
        queueMahasiswa.add(new Mahasiswa("20001", "Thalhah", "021xxx"));
        queueMahasiswa.add(new Mahasiswa("20002", "Zubair", "021xxx"));
        queueMahasiswa.add(new Mahasiswa("20003", "Abdur-Rahman", "021xxx"));
        queueMahasiswa.add(new Mahasiswa("20004", "Sa'ad", "021xxx"));
        queueMahasiswa.add(new Mahasiswa("20005", "Sa'id", "021xxx"));
        queueMahasiswa.add(new Mahasiswa("20006", "Ubaidah", "021xxx"));

        listMataKuliah.add(new MataKuliah("00001", "Internet of Things", 3));
        listMataKuliah.add(new MataKuliah("00002", "Algoritma dan Struktur Data", 2));
        listMataKuliah.add(new MataKuliah("00003", "Algoritma dan Pemrograman", 2));
        listMataKuliah.add(new MataKuliah("00004", "Praktikum Algoritma dan Struktur Data", 3));
        listMataKuliah.add(new MataKuliah("00005", "Praktikum Algoritma dan Pemrograman", 3));
    }

    // Fungsi 1: Input Nilai
    static void inputNilai() {
        System.out.println("Masukkan data");
        System.out.print("Kode\t: ");
        String kode = sc.nextLine();
        System.out.print("Nilai\t: ");
        double nilai = sc.nextDouble();
        sc.nextLine();

        System.out.println("\nDAFTAR MAHASISWA");
        System.out.println("************************************************");
        System.out.printf("%-10s %-15s %-10s\n", "NIM", "Nama", "Telf");
        
        for (Mahasiswa m : queueMahasiswa) {
            System.out.printf("%-10s %-15s %-10s\n", m.nim, m.nama, m.telf);
        }

        System.out.print("Pilih mahasiswa by nim: ");
        String cariNim = sc.nextLine();
        Mahasiswa mhsTerpilih = null;
        for (Mahasiswa m : queueMahasiswa) {
            if (m.nim.equals(cariNim)) {
                mhsTerpilih = m;
                break;
            }
        }

        System.out.println("\nDAFTAR MATA KULIAH");
        System.out.println("************************************************");
        System.out.printf("%-10s %-40s %-5s\n", "Kode", "Mata Kuliah", "SKS");
        for (MataKuliah mk : listMataKuliah) {
            System.out.printf("%-10s %-40s %-5d\n", mk.kodeMk, mk.namaMk, mk.sks);
        }
        System.out.print("Pilih MK by kode: ");
        String cariMk = sc.nextLine();
        MataKuliah mkTerpilih = null;
        for (MataKuliah mk : listMataKuliah) {
            if (mk.kodeMk.equals(cariMk)) {
                mkTerpilih = mk;
                break;
            }
        }

        if (mhsTerpilih != null && mkTerpilih != null) {
            listNilai.add(new Nilai(kode, nilai, mhsTerpilih, mkTerpilih));
            System.out.println("Data nilai berhasil ditambahkan!");
        } else {
            System.out.println("Data Mahasiswa atau Mata Kuliah tidak ditemukan!");
        }
    }

    static void hapusMahasiswaQueue() {
        System.out.println("\nPROSEDUR HAPUS MAHASISWA (QUEUE)");
        System.out.println("************************************************");
        
        if (!queueMahasiswa.isEmpty()) {
            Mahasiswa mhsDihapus = queueMahasiswa.poll(); 
            System.out.println("Berhasil menghapus mahasiswa dari antrean terdepan!");
            System.out.println("NIM  : " + mhsDihapus.nim);
            System.out.println("Nama : " + mhsDihapus.nama);
            
            String nimTarget = mhsDihapus.nim;
            listNilai.removeIf(n -> n.mhs.nim.equals(nimTarget));
            
        } else {
            System.out.println("Antrean mahasiswa sudah kosong! Tidak ada data yang bisa dihapus.");
        }
    }

    // Fungsi 2: Menampilkan Nilai
    static void tampilNilai() {
        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.println("******************************************************************************");
        System.out.printf("%-10s %-15s %-40s %-5s %-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        for (Nilai n : listNilai) {
            System.out.printf("%-10s %-15s %-40s %-5d %.2f\n", n.mhs.nim, n.mhs.nama, n.mk.namaMk, n.mk.sks, n.nilai);
        }
    }

    // Fungsi 3: Mencari Nilai Mahasiswa
    static void cariNilai() {
        tampilNilai(); 
        System.out.print("Masukkan data mahasiswa[nim] : ");
        String cariNim = sc.nextLine();

        System.out.printf("%-10s %-15s %-40s %-5s %-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        int totalSks = 0;
        boolean ditemukan = false;
        
        for (Nilai n : listNilai) {
            if (n.mhs.nim.equals(cariNim)) {
                System.out.printf("%-10s %-15s %-40s %-5d %.2f\n", n.mhs.nim, n.mhs.nama, n.mk.namaMk, n.mk.sks, n.nilai);
                totalSks += n.mk.sks;
                ditemukan = true;
            }
        }
        
        if (ditemukan) {
            System.out.println("Total SKS " + totalSks + " telah diambil.");
        } else {
            System.out.println("Data mahasiswa dengan NIM tersebut tidak ditemukan pada daftar nilai.");
        }
    }

    // Fungsi 4: Mengurutkan Data Nilai Ascending
    static void urutDataNilai() {
        Collections.sort(listNilai, new Comparator<Nilai>() {
            @Override
            public int compare(Nilai n1, Nilai n2) {
                return Double.compare(n1.nilai, n2.nilai);
            }
        });
        
        System.out.println("\nData berhasil diurutkan berdasarkan Nilai!");
        tampilNilai(); 
    }
}