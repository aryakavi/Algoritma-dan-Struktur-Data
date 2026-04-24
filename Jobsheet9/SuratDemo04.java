package Jobsheet9;
import java.util.Scanner;

public class SuratDemo04 {
    public static void main(String[] args) {
        StackSurat04 stack = new StackSurat04(10);
        
        try (Scanner scan = new Scanner(System.in)) {
            int pilih;

            do {
                System.out.println("\nMenu Layanan Surat Izin Mahasiswa:");
                System.out.println("1. Terima Surat Izin");
                System.out.println("2. Proses Surat Izin");
                System.out.println("3. Lihat Surat Izin Terakhir");
                System.out.println("4. Cari Surat (berdasarkan Nama)");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");
                pilih = scan.nextInt();
                scan.nextLine();

                switch (pilih) {
                    case 1:
                        System.out.print("ID Surat: ");
                        String idSurat = scan.nextLine();
                        System.out.print("Nama Mahasiswa: ");
                        String nama = scan.nextLine();
                        System.out.print("Kelas: ");
                        String kelas = scan.nextLine();
                        System.out.print("Jenis Izin (S/I): ");
                        char jenis = scan.nextLine().charAt(0);
                        System.out.print("Durasi (hari): ");
                        int durasi = scan.nextInt();
                        scan.nextLine();
                        
                        Surat04 srt = new Surat04(idSurat, nama, kelas, jenis, durasi);
                        stack.push(srt);
                        System.out.println("Surat berhasil diterima.");
                        break;
                    case 2:
                        Surat04 diproses = stack.pop();
                        if (diproses != null) {
                            System.out.println("Memproses surat dari: " + diproses.namaMahasiswa + " (ID: " + diproses.idSurat + ")");
                        }
                        break;
                    case 3:
                        Surat04 terakhir = stack.peek();
                        if (terakhir != null) {
                            System.out.println("Surat terakhir yang masuk:");
                            System.out.println("ID Surat: " + terakhir.idSurat);
                            System.out.println("Nama    : " + terakhir.namaMahasiswa);
                            System.out.println("Kelas   : " + terakhir.kelas);
                            System.out.println("Izin    : " + terakhir.jenisIzin);
                            System.out.println("Durasi  : " + terakhir.durasi + " hari");
                        }
                        break;
                    case 4:
                        System.out.print("Masukkan nama mahasiswa yang dicari: ");
                        String cariNama = scan.nextLine();
                        stack.cariSurat(cariNama);
                        break;
                    case 5:
                        System.out.println("Keluar dari program.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } while (pilih != 5);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}