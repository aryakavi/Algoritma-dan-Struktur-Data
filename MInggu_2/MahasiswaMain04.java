package MInggu_2;
public class MahasiswaMain04 {
    public static void main(String[] args) {
        Mahasiswa04 mhs1 = new Mahasiswa04();
        mhs1.nama4 = "Muhammad Ali Farhan ";
        mhs1.nim4 = "2241720171";
        mhs1.kelas4 = "SI 2J";
        mhs1.ipk4 = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa04 mhs2 = new Mahasiswa04("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
        
    }
}
