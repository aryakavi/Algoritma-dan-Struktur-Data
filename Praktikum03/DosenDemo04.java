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
        int i = 1;
        for (Dosen04 dosen : arrayOfDosen) {
        System.out.println("Data Dosen ke-" + (i+1));
        System.out.println("kode               : " + dosen.kode);
        System.out.println("Nama               : " + dosen.nama);
        System.out.println("Jenis kelamin      : " + dosen.jenisKelamin);
        System.out.println("usia               : " + dosen.usia);
        System.out.println("--------------------------------------");
        }
    sc.close();
    }
}