package Jobsheet16;
public class Mahasiswa04 {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa04() {
    }

    public Mahasiswa04(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }
}