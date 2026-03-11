package Praktikum03;
import java.util.Scanner;

public class DosenDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen04[] arrayOfDosen = new Dosen04[3];
        String kode, nama;
        int usia;
        boolean jenisKelamin;

        for (int i = 0; i < 3; i++) {
            
            System.out.println ("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print ("kode              : ");
            kode = sc.nextLine();
            System.out.print ("Nama              : ") ;
            nama = sc.nextLine();
            System.out.print ("jenis Kelamin     : ");
            jenisKelamin = sc.nextBoolean();
            System.out.print ("usia               : ");
            usia = sc.nextInt();
            System.out.println ("---------------------------");

            arrayOfDosen[i] = new Dosen04 (kode, nama, jenisKelamin, usia);
        }
        DataDosen04 dataDosen = new DataDosen04();

        System.out.println("========== Semua Data Dosen ==========");
        dataDosen.dataSemuaDosen(arrayOfDosen);
        System.out.println("========== Jumlah Per Jenis Kelamin ==========");
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        System.out.println("========== Rata-rata Usia Per Jenis Kelamin ==========");
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        System.out.println("========== Dosen Paling Tua ==========");
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        System.out.println("========== Dosen Paling Muda ==========");
        dataDosen.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}