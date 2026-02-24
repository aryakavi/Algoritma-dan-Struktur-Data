package MInggu_2;
public class Dosen04 {
    String idDosen4;
    String nama4;
    boolean statusAktif4;
    int tahunBergabung4;
    String bidangKeahlian4;

    public Dosen04() {
    }

    public Dosen04(String id4, String nm4, boolean status4, int tahun4, String bidang4) {
        idDosen4 = id4;
        nama4 = nm4;
        statusAktif4 = status4;
        tahunBergabung4 = tahun4;
        bidangKeahlian4 = bidang4;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen: " + idDosen4);
        System.out.println("Nama: " + nama4);
        System.out.println("Status Aktif: " + (statusAktif4 ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung4);
        System.out.println("Bidang Keahlian: " + bidangKeahlian4);
        System.out.println("\n");
    }
    void setStatusAktif(boolean status4) {
        statusAktif4 = status4;
        System.out.println("Status aktif telah diubah.");
    }
    int hitungMasaKerja(int thnSkrg4) {
        return thnSkrg4 - tahunBergabung4;
    }
    void ubahKeahlian(String bidang4) {
        bidangKeahlian4 = bidang4;
        System.out.println("Bidang keahlian telah diubah.");
    }
}