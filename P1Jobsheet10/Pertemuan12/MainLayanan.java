package Pertemuan12;

import java.util.Scanner;

public class MainLayanan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        QueueLinkedList antrianLayanan = new QueueLinkedList(10);
        int menu;

        do {
            System.out.println(" SISTEM ANTRIAN LAYANAN KEMAHASISWAAN : ");
            System.out.println("1. Daftar Antrian Baru (Tambah)");
            System.out.println("2. Panggil Antrian (Layanan)");
            System.out.println("3. Cek Antrian Terdepan dan Terakhir");
            System.out.println("4. Cek Jumlah Antrian");
            System.out.println("5. Kosongkan Seluruh Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.println("\n-- Formulir Pendaftaran Antrian --");
                    System.out.print("Masukkan NIM       : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama      : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Keperluan : ");
                    String keperluan = sc.nextLine();
                    
                    Mahasiswa mhsBaru = new Mahasiswa(nim, nama, keperluan);
                    antrianLayanan.tambahAntrian(mhsBaru);
                    break;
                case 2:
                    antrianLayanan.panggilAntrian();
                    break;
                case 3:
                    antrianLayanan.tampilkanUjungAntrian();
                    break;
                case 4:
                    System.out.println();
                    antrianLayanan.cekJumlahAntrian();
                    break;
                case 5:
                    System.out.println();
                    antrianLayanan.clear();
                    break;
                case 0:
                    System.out.println("\nTerima kasih telah menggunakan sistem layanan.");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid! Silakan pilih menu yang tersedia.");
            }
        } while (menu != 0);

        sc.close();
    }
}