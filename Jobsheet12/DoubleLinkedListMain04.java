
import java.util.Scanner;

public class DoubleLinkedListMain04 {

    public static Mahasiswa04 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM   : ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine(); 
        return new Mahasiswa04(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoublelinkedList04 list = new DoublelinkedList04();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Hapus data setelah NIM");
            System.out.println("8. Hapus data pada indeks tertentu");
            System.out.println("9. Cetak data pertama");
            System.out.println("10. Cetak data terakhir");
            System.out.println("11. Cetak data pada indeks tertentu");
            System.out.println("12. Tampilkan semua data");
            System.out.println("13. Tampilkan semua data terbalik");
            System.out.println("14. Tampilkan jumlah data saat ini");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa04 mhsAwal = inputMahasiswa(scan);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa04 mhsAkhir = inputMahasiswa(scan);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String keyNim = scan.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa04 dataBaru = inputMahasiswa(scan);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst(); 
                    break;
                case 5:
                    list.removeLast(); 
                    break;
                case 6:
                    list.print();
                    break;
                    case 7:
                    System.out.print("Masukkan NIM dari node (hapus node setelahnya): ");
                    String keyNimDel = scan.nextLine();
                    list.removeAfter(keyNimDel);
                    break;
                case 8:
                    System.out.print("Masukkan indeks node yang akan dihapus: ");
                    int idxDel = scan.nextInt();
                    scan.nextLine();
                    list.remove(idxDel);
                    break;
                case 9:
                    list.getFirst();
                    break;
                case 10:
                    list.getLast();
                    break;
                case 11:
                    System.out.print("Masukkan indeks yang ingin ditampilkan: ");
                    int idxGet = scan.nextInt();
                    scan.nextLine();
                    list.getIndex(idxGet);
                    break;
                case 12:
                    list.print();
                    break;
                case 13:
                    list.printReverse();
                    break;
                case 14:
                    System.out.println("Jumlah data (size) saat ini: " + list.size() + " mahasiswa.");
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
        
        scan.close();
    }
}