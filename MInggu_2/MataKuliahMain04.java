package MInggu_2;
public class MataKuliahMain04 {
    public static void main(String[] args) {
        MataKuliah04 matkul1 = new MataKuliah04();
        matkul1.kodeMK4 = "A1";
        matkul1.nama4 = "Jefri Epsten";
        matkul1.sks4 = 4 ;
        matkul1.jumlahJam4 = 2;
        matkul1.tampilkanInformasi();

        matkul1.ubahSKS(5);
        matkul1.tambahJam(3);
        matkul1.tampilkanInformasi();

        MataKuliah04 matkul2 = new MataKuliah04("A2", "Porter Robinson", 4, 3);
        matkul2.ubahSKS(3);
        matkul2.kurangiJam(4);
        matkul2.tampilkanInformasi();
    }
}
