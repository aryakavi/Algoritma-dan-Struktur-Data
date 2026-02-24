import java.util.Scanner;
public class PraktikumPemilihan4 {
    public static void main(String[] args) {
        Scanner arya04 = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas04 = arya04.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis04 = arya04.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts04 = arya04.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas04 = arya04.nextDouble();
        
        System.out.println("==============================");

        if (tugas04 < 0 || tugas04 > 100 || kuis04 < 0 || kuis04 > 100 || 
            uts04 < 0 || uts04 > 100 || uas04 < 0 || uas04 > 100) {
            System.out.println("nilai tidak valid");
            System.out.println("==============================");
            
        } else {
            double nilaiAkhir04 = (0.20 * tugas04) + (0.20 * kuis04) + (0.30 * uts04) + (0.40 * uas04);
            String nilaiHuruf04;

            if (nilaiAkhir04 > 80 && nilaiAkhir04 <= 100) {
                nilaiHuruf04 = "A";
            } else if (nilaiAkhir04 > 73 && nilaiAkhir04 <= 80) {
                nilaiHuruf04 = "B+";
            } else if (nilaiAkhir04 > 65 && nilaiAkhir04 <= 73) {
                nilaiHuruf04 = "B";
            } else if (nilaiAkhir04 > 60 && nilaiAkhir04 <= 65) {
                nilaiHuruf04 = "C+";
            } else if (nilaiAkhir04 > 50 && nilaiAkhir04 <= 60) {
                nilaiHuruf04 = "C";
            } else if (nilaiAkhir04 > 39 && nilaiAkhir04 <= 50) {
                nilaiHuruf04 = "D";
            } else {
                nilaiHuruf04 = "E";
            }

            System.out.println("nilai akhir : " + nilaiAkhir04);
            System.out.println("Nilai Huruf :" + nilaiHuruf04);
            System.out.println("==============================");

            if (nilaiHuruf04.equals("D") || nilaiHuruf04.equals("E")) {
                System.out.println("MAAF ANDA TIDAK LULUS");
            } else {
                System.out.println("SELAMAT ANDA LULUS");
            }
        }
        arya04.close();
    }
}