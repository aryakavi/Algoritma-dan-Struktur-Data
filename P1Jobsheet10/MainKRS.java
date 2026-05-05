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