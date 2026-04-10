package Minggu7.CaseMethod1;

public class Peminjaman04 {
    // Menghubungkan class dengan objek Mahasiswa dan Buku
    Mahasiswa04 mhs;
    Buku04 buku;
    int lamaPinjam;
    int batasPinjam = 5; // Ketentuan maksimal pinjam 5 hari
    int terlambat = 0;
    int denda = 0;

    //Konstruktor pencatat transaksi peminjaman buku
    public Peminjaman04(Mahasiswa04 mhs, Buku04 buku, int lamaPinjam){
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;

        // Pengecekan apakah mahasiswa terlambat mengembalikan buku
        if(this.lamaPinjam > this.batasPinjam){
            // Menghitung selisih keterlambatan
            this.terlambat=this.lamaPinjam-this.batasPinjam;
        }
        // Memanggil methos hitungDenda
        hitungDenda();
    }

    // Method hitungDenda
    public void hitungDenda(){
        if(this.terlambat>0){
            this.denda=this.terlambat*2000;
        }
    }
    
    // Rincian transaksi peminjaman
    public void tampilPeminjaman(){
        System.out.printf("%s %s | Lama : %d | Terlambat : 5d | Denda : %d\n", this. mhs.nama, this.buku.judul, this.lamaPinjam, this.terlambat, this.denda);
    }
}
