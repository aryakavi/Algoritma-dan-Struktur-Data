package Minggu7.CaseMethod1;

public class Mahasiswa04 {
    // Deklarasi atribut untuk menyimpan data identitas mahasiswa
    String nim;
    String nama;
    String prodi;

    // Konstriktor kosong
    public Mahasiswa04() {
    }

    // Konstruktor berparameter
    public Mahasiswa04(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Method untuk menampilkan informasi
    public void tampilMahasiswa() {
        System.out.println("NIM: " + this.nim + " | Nama: " + this.nama + " | Prodi: " + this.prodi);
    }
}