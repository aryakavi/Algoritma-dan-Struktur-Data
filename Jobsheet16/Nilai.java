package Jobsheet16;
public class Nilai {
    String kodeNilai;
    double nilai;
    Mahasiswa mhs;
    MataKuliah mk;

    public Nilai(String kodeNilai, double nilai, Mahasiswa mhs, MataKuliah mk) {
        this.kodeNilai = kodeNilai;
        this.nilai = nilai;
        this.mhs = mhs;
        this.mk = mk;
    }
}