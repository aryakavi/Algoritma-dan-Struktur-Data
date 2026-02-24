package MInggu_2;
public class DosenMain04 {
    public static void main(String[] args) {
        Dosen04 dosen1 = new Dosen04();
        dosen1.idDosen4 = "1234";
        dosen1.nama4 = "Jacob 'Jake' the Dog, Sr";
        dosen1.statusAktif4 = true;
        dosen1.tahunBergabung4 = 985;
        dosen1.bidangKeahlian4 = "procrastinating and helping";
        dosen1.tampilInformasi();

        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(987);
        dosen1.ubahKeahlian("being old");
        dosen1.tampilInformasi();

        Dosen04 dosen2 = new Dosen04("5678", "Finn Mertens", false, 985, "Adventuring and slaying");
        dosen2.tampilInformasi();

        dosen2.setStatusAktif(true);
        dosen2.hitungMasaKerja(1050);
        dosen2.ubahKeahlian("being friendly");
        dosen2.tampilInformasi();
    }
}
