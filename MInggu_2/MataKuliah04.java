package MInggu_2;
public class MataKuliah04 {
    public MataKuliah04(){
    }

    public MataKuliah04(String KMK4, String nm4, int sks4, int jam4){
        kodeMK4 = KMK4;
        nama4 = nm4;
        this.sks4 = sks4;
        jumlahJam4 = jam4;
    }
        String kodeMK4;
        String nama4;
        int sks4;
        int jumlahJam4;

        void tampilkanInformasi(){
            System.out.println("Kode Matkul: " + kodeMK4);
            System.out.println("Nama: " + nama4);
            System.out.println("SKS: " + sks4);
            System.out.println("jumlah Jam: " + jumlahJam4 );
            System.out.println("\n");
        }

        void ubahSKS(int sksBaru4){
            sks4 = sksBaru4;
        }
        void tambahJam(int jam4){
            jumlahJam4 = jam4;
        }
        void kurangiJam(int jam4){
            if (jumlahJam4 >= jam4){
                jumlahJam4 -= jam4;
                System.out.println("Pengurangan berhasil. Jumlah jam sekarang : " + jumlahJam4);
            } else {
                System.out.println("Pengurangan tidak dapat dilakukan!\n Jumlah jam awal lebih kecil dari jam pengurang!!");
            }
        }
    }