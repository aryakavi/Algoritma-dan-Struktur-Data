package Jobsheet16;
import java.util.ArrayList;
import java.util.Arrays;
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

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ListMahasiswa04 lm = new ListMahasiswa04();
        Mahasiswa04 m = new Mahasiswa04("201234", "Noureen", "021xx1");
        Mahasiswa04 m1 = new Mahasiswa04("201235", "Akhleema", "021xx2");
        Mahasiswa04 m2 = new Mahasiswa04("201236", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);
        lm.tampil();
        lm.update(lm.linearSearch("201235"), new Mahasiswa04("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
    }
}