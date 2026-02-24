package MInggu_2;
public class Mahasiswa04{
    public Mahasiswa04(){
    }

    public Mahasiswa04(String nm4, String nim4, double ipk4, String kls4 ){
        nama4 = nm4;
        this.nim4 = nim4;
        this.ipk4 = ipk4;
        kelas4 = kls4;
    }
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
        void updateIpk(double ipkBaru4){
            ipk4 = ipkBaru4;
        }

        String nilaiKinerja(){
            if (ipk4 >= 3.5) {
                return "Kinerja sangat baik";
            }else if (ipk4 >= 3.0) {
                return "Kinera baik";
            }else if (ipk4 >= 2.0) {
                return "Kinerja cukup";
            }else {
                return "Kinerja kurang";
            }
        }
    }
