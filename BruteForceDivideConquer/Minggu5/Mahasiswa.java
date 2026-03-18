package BruteForceDivideConquer.Minggu5;

public class Mahasiswa {
    String nama;
    int nim, tahunMasuk, nilaiUTS, nilaiUAS;

    Mahasiswa(String nama, int nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama       = nama;
        this.nim        = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS   = nilaiUTS;
        this.nilaiUAS   = nilaiUAS;
    }

    int maxUTSDC(Mahasiswa[] arr, int l, int r) {
        if (l == r) {                          
            return arr[l].nilaiUTS;
        }
        int mid   = (l + r) / 2;
        int lMax  = maxUTSDC(arr, l, mid);    
        int rMax  = maxUTSDC(arr, mid + 1, r);
        return Math.max(lMax, rMax);           
    }

    int minUTSDC(Mahasiswa[] arr, int l, int r) {
        if (l == r) {                          
            return arr[l].nilaiUTS;
        }
        int mid   = (l + r) / 2;
        int lMin  = minUTSDC(arr, l, mid);    
        int rMin  = minUTSDC(arr, mid + 1, r);
        return Math.min(lMin, rMin);           
    }

    double rataUASBF(Mahasiswa[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i].nilaiUAS;   
        }
        return total / arr.length;           
    }
}