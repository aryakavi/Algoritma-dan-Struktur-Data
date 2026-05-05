package Pertemuan12;
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