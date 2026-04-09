package BruteForceDivideConquer.Praktikum05;
import java.util.Scanner;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Meminta input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();
        sc.nextLine(); // Membersihkan sisa enter
        
        // Inisialisasi list dengan ukuran sesuai input user
        MahasiswaBerprestasi04 list = new MahasiswaBerprestasi04(jumlahMhs);

        // Perulangan untuk input data secara dinamis
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("\n--- Masukkan Data Mahasiswa ke-" + (i + 1) + " ---");
            
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 
            
            // Membuat objek mahasiswa baru dan menambahkannya ke dalam list
            Mahasiswa04 m = new Mahasiswa04(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
}
}
