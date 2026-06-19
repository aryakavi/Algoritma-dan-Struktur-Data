package Jobsheet16;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa04 {
    
    List<Mahasiswa04> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa04... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa04 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    public int binarySearch(String nim) {
        sortAscending();
        Mahasiswa04 searchKey = new Mahasiswa04(nim, "", "");
        return Collections.binarySearch(mahasiswas, searchKey, Comparator.comparing(m -> m.nim));
    }

    public void sortAscending() {
        Collections.sort(mahasiswas, Comparator.comparing(m -> m.nim));
    }

    public void sortDescending() {
        Collections.sort(mahasiswas, (m1, m2) -> m2.nim.compareTo(m1.nim));
    }

    public static void main(String[] args) {
        ListMahasiswa04 lm = new ListMahasiswa04();
        Mahasiswa04 m = new Mahasiswa04("201234", "Noureen", "021xx1");
        Mahasiswa04 m1 = new Mahasiswa04("201235", "Akhleema", "021xx2");
        Mahasiswa04 m2 = new Mahasiswa04("201236", "Shannum", "021xx3");

        // Menambah objek mahasiswa
        lm.tambah(m, m1, m2);
        
        System.out.println("--- Data Awal ---");
        lm.tampil();

        // Pencarian dan update mahasiswa mdengan Binary Search
        int searchIndex = lm.binarySearch("201235"); 
        if (searchIndex >= 0) {
            lm.update(searchIndex, new Mahasiswa04("201235", "Akhleema Lela", "021xx2"));
        } else {
            System.out.println("\nData tidak ditemukan!");
        }
        
        System.out.println("\n--- Setelah di-update (otomatis tersortir Ascending Binary Search) ---");
        lm.tampil();
        
        // Uji coba Sorting Descending
        System.out.println("\n--- Setelah disortir secara Descending ---");
        lm.sortDescending();
        lm.tampil();
    }
}