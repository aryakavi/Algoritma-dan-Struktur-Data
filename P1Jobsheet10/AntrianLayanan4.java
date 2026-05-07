import java.util.ArrayList;

public class AntrianLayanan4 {
    ArrayList<Mahasiswa4> data;
    int max;

    public AntrianLayanan4(int max) {
        this.max = max;
        this.data = new ArrayList<>();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public boolean isFull() {
        return data.size() == max;
    }

    public void tambahAntrian(Mahasiswa4 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        data.add(mhs);
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public Mahasiswa4 layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        // Menghapus dan mengambil data pada indeks pertama (terdepan)
        return data.remove(0); 
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data.get(0).tampilkanData();
        }
    }

    // Method Baru: Mengecek mahasiswa di antrian paling belakang
    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa paling belakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            // Mengambil data pada indeks terakhir
            data.get(data.size() - 1).tampilkanData(); 
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < data.size(); i++) {
            System.out.print((i + 1) + ". ");
            data.get(i).tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return data.size();
    }
}