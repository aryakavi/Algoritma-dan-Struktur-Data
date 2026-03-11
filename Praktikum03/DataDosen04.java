package Praktikum03;

public class DataDosen04 {

    public void dataSemuaDosen(Dosen04[] arrayOfDosen) {
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode          : " + arrayOfDosen[i].kode);
            System.out.println("Nama          : " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin : " + (arrayOfDosen[i].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + arrayOfDosen[i].usia);
            System.out.println("------------------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen04[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin == true) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
        System.out.println("------------------------------------------");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen04[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int pria = 0, wanita = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin == true) {
                totalUsiaPria += arrayOfDosen[i].usia;
                pria++;
            } else {
                totalUsiaWanita += arrayOfDosen[i].usia;
                wanita++;
            }
        }
        if (pria > 0) {
            System.out.println("Rata-rata Usia Pria   : " + (totalUsiaPria / pria));
        } else {
            System.out.println("Rata-rata Usia Pria   : tidak ada data");
        }
        if (wanita > 0) {
            System.out.println("Rata-rata Usia Wanita : " + (totalUsiaWanita / wanita));
        } else {
            System.out.println("Rata-rata Usia Wanita : tidak ada data");
        }
        System.out.println("------------------------------------------");
    }

    public void infoDosenPalingTua(Dosen04[] arrayOfDosen) {
        int Tua = 0;
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > arrayOfDosen[Tua].usia) {
                Tua = i;
            }
        }
        System.out.println("Dosen Paling Tua");
        System.out.println("Kode          : " + arrayOfDosen[Tua].kode);
        System.out.println("Nama          : " + arrayOfDosen[Tua].nama);
        System.out.println("Jenis Kelamin : " + (arrayOfDosen[Tua].jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + arrayOfDosen[Tua].usia);
        System.out.println("------------------------------------------");
    }

    public void infoDosenPalingMuda(Dosen04[] arrayOfDosen) {
        int Muda = 0;
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < arrayOfDosen[Muda].usia) {
                Muda = i;
            }
        }
        System.out.println("Dosen Paling Muda");
        System.out.println("Kode          : " + arrayOfDosen[Muda].kode);
        System.out.println("Nama          : " + arrayOfDosen[Muda].nama);
        System.out.println("Jenis Kelamin : " + (arrayOfDosen[Muda].jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + arrayOfDosen[Muda].usia);
        System.out.println("------------------------------------------");
    }
}