package BruteForceDivideConquer.Minggu5;

public class MainMahasiswa {
    public static void main(String[] args) {

        Mahasiswa04[] mhs = {
            new Mahasiswa04("Ahmad", 220101001, 2022, 78, 82),
            new Mahasiswa04("Budi",  220101002, 2022, 85, 88),
            new Mahasiswa04("Cindy", 220101003, 2021, 90, 87),
            new Mahasiswa04("Dian",  220101004, 2021, 76, 79),
            new Mahasiswa04("Eko",   220101005, 2023, 92, 95),
            new Mahasiswa04("Fajar", 220101006, 2020, 88, 85),
            new Mahasiswa04("Gina",  220101007, 2023, 80, 83),
            new Mahasiswa04("Hadi",  220101008, 2020, 82, 84)
        };

        Mahasiswa04 m = new Mahasiswa04("", 0, 0, 0, 0);
        int n = mhs.length;

        int maxUTS = m.maxUTSDC(mhs, 0, n - 1);
        System.out.println("a) Nilai UTS Tertinggi (DC) : " + maxUTS);

        int minUTS = m.minUTSDC(mhs, 0, n - 1);
        System.out.println("b) Nilai UTS Terendah  (DC) : " + minUTS);

        double rataUAS = m.rataUASBF(mhs);
        System.out.println("c) Rata-rata UAS (BF)       : " + rataUAS);
    }
}
