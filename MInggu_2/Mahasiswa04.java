package MInggu_2;
public class Mahasiswa04{

        String nama4;
        String nim4;
        String kelas4;
        double ipk4;

        void tampilkanInformasi() {
            System.out.println("Nama: " + nama4);
            System.out.println("NIM: " + nim4);
            System.out.println("IPK: " + ipk4);
            System.out.println("Kelas: " + kelas4);
        }

        void ubahKelas(String kelasBaru4){
            kelas4 = kelasBaru4;
        }
        void updateIpk(double ipkBaru4) {
        if (ipkBaru4 >= 0.0 && ipkBaru4 <= 4.0) {
            ipk4 = ipkBaru4;
            System.out.println("IPK berhasil diperbarui.");
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }
        String nilaiKinerja(){
            if (ipk4 >= 3.5) {
                return "Kinerja sangat baik ";
            }else if (ipk4 >= 3.0) {
                return "Kinera baik ";
            }else if (ipk4 >= 2.0) {
                return "Kinerja cukup ";
            }else {
                return "Kinerja kurang ";
            }
        }
    }
