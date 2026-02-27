package Praktikum03;
import java.util.Scanner;
public class MatakuliahDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah04[] arrayOfMatakuliah = new Matakuliah04[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy); 
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------------------");

            arrayOfMatakuliah[i] = new Matakuliah04(kode, nama, sks, jumlahJam);
        }
    sc.close();
    }
}