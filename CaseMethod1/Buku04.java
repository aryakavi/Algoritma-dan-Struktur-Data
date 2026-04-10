package CaseMethod1;

public class Buku04{
    // Deklarasi atribut untuk menyimpan informasi detail buku
    String kodeBuku;
    String judul;
    String tahunTerbit;
    
    // Konstruktor untuk memberikan nilai awal pada atribut buku
    public Buku04(String kode, String judul, String tahun){
        this.kodeBuku = kode;
        this.judul = judul;
        this.tahunTerbit = tahun;
    }

    // Method untuk mencetak informasi buku
    public void tampilBuku(){
        System.out.println("Kode : " + this.kodeBuku + " | Judul : " + this. judul + " | Tahun : " + this.tahunTerbit);
    }
}

