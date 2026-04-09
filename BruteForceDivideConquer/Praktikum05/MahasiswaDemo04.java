package BruteForceDivideConquer.Praktikum05;
import java.util.Scanner;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumMhs=5;
        MahasiswaBerprestasi04 list = new MahasiswaBerprestasi04(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
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
            
            Mahasiswa04 m = new Mahasiswa04(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        list.tampil();
        System.out.println("--------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cariBinary = sc.nextDouble();

        System.out.println("--------------------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("--------------------------------------------------");
        double posisi2 = list.findBinarySearch(cariBinary, 0, jumMhs - 1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cariBinary, pss2);
        list.tampilDataSearch(cariBinary, pss2);
        
        sc.close();
    }
}
