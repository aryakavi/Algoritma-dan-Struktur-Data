package Praktikum03;
import java.util.Scanner;
public class MatakuliahDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int jumlah = sc.nextInt(); sc.nextLine();
        Matakuliah04[] arrayOfMatakuliah = new Matakuliah04[jumlah];
        String kode, nama;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            sks = sc.nextInt(); sc.nextLine();
            System.out.print("Jumlah Jam : ");
            jumlahJam = sc.nextInt(); sc.nextLine();
            System.out.println("------------------------------------------");

            arrayOfMatakuliah[i] = new Matakuliah04(kode, nama, sks, jumlahJam);
        }
           for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode       : " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama       : " + arrayOfMatakuliah[i].nama);
            System.out.println("Sks        : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("------------------------------------------");
        }
    sc.close();
    }
}