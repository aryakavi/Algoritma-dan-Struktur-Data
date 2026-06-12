package CaseMethod2;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        DoubleLinkedListAntrian04 antrianList = new DoubleLinkedListAntrian04();
        DoubleLinkedListPesanan04 pesananList = new DoubleLinkedListPesanan04();

        antrianList.enqueue(new Pembeli04("Ainra", "08224500000"));
        antrianList.enqueue(new Pembeli04("Danra", "08224511111"));
        antrianList.enqueue(new Pembeli04("Sanri", "08224522222"));

        int menu;
        do {
            System.out.println("\n=================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("=================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            menu = sc04.nextInt();
            sc04.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc04.nextLine();
                    System.out.print("No HP        : ");
                    String hp = sc04.nextLine();
                    
                    antrianList.enqueue(new Pembeli04(nama, hp));
                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + (antrianList.counterAntrian - 1));
                    break;
                    
                case 2:
                    antrianList.print();
                    break;
                    
                case 3:
                    NodeAntrian04 antrianDiproses = antrianList.dequeue();
                    if (antrianDiproses != null) {
                        System.out.print("Kode Pesanan : ");
                        int kode = sc04.nextInt();
                        sc04.nextLine(); 
                        System.out.print("Nama Pesanan : ");
                        String namaPesan = sc04.nextLine();
                        System.out.print("Harga        : ");
                        int harga = sc04.nextInt();
                        sc04.nextLine(); 
                        
                        pesananList.addPesanan(new Pesanan04(kode, namaPesan, harga));
                        System.out.println(antrianDiproses.pembeli.namaPembeli + " telah memesan " + namaPesan);
                    } else {
                        System.out.println("Tidak ada antrian yang dapat diproses!");
                    }
                    break;
                    
                case 4:
                    pesananList.printLaporan();
                    break;
                    
                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                    
                default:
                    System.out.println("Menu yang Anda pilih tidak valid!");
            }
        } while (menu != 0);
        
        sc04.close();
    }
}