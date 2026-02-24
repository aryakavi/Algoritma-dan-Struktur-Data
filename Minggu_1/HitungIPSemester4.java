import java.util.Scanner;
public class HitungIPSemester4 {
    public static void main(String[] args) {
        Scanner arya04 = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        String[] mataKuliah04 = {
            "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", 
            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", 
            "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"
        };
        double[] nilaiAngka04 = new double[mataKuliah04.length];
        String[] nilaiHuruf04 = new String[mataKuliah04.length];
        double[] bobotNilai04 = new double[mataKuliah04.length];
        int[] bobotSKS04 = {2, 2, 2, 3, 2, 2, 3, 2}; 
        double totalNilaiKaliSKS04 = 0;
        int totalSKS04 = 0;

        for (int i = 0; i < mataKuliah04.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + mataKuliah04[i] + ": ");
            nilaiAngka04[i] = arya04.nextDouble();
            if (nilaiAngka04[i] > 80 && nilaiAngka04[i] <= 100) {
                nilaiHuruf04[i] = "A";
                bobotNilai04[i] = 4.0;
            } else if (nilaiAngka04[i] > 73) {
                nilaiHuruf04[i] = "B+";
                bobotNilai04[i] = 3.5;
            } else if (nilaiAngka04[i] > 65) {
                nilaiHuruf04[i] = "B";
                bobotNilai04[i] = 3.0;
            } else if (nilaiAngka04[i] > 60) {
                nilaiHuruf04[i] = "C+";
                bobotNilai04[i] = 2.5;
            } else if (nilaiAngka04[i] > 50) {
                nilaiHuruf04[i] = "C";
                bobotNilai04[i] = 2.0;
            } else if (nilaiAngka04[i] > 39) {
                nilaiHuruf04[i] = "D";
                bobotNilai04[i] = 1.0;
            } else {
                nilaiHuruf04[i] = "E";
                bobotNilai04[i] = 0.0;
            }
            totalNilaiKaliSKS04 += (bobotNilai04[i] * bobotSKS04[i]);
            totalSKS04 += bobotSKS04[i];
        }
        System.out.println("==============================");
        System.out.println("hasil konversi nilai");
        System.out.println("==============================");
        System.out.printf("%-40s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        
        for (int i = 0; i < mataKuliah04.length; i++) {
            System.out.printf("%-40s %-15.2f %-15s %-15.2f\n", 
                mataKuliah04[i], nilaiAngka04[i], nilaiHuruf04[i], bobotNilai04[i]);
        }
        double ipSemester = totalNilaiKaliSKS04 / totalSKS04;
        System.out.println("==============================");
        System.out.printf("IP : %.2f\n", ipSemester);

        arya04.close();
    }
}