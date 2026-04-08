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