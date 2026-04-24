package Jobsheet9;
public class StackSurat04 {
    Surat04[] tumpukan;
    int top;
    int size;

    public StackSurat04(int size) {
        this.size = size;
        tumpukan = new Surat04[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat04 srt) {
        if (!isFull()) {
            top++;
            tumpukan[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat lagi.");
        }
    }

    public Surat04 pop() {
        if (!isEmpty()) {
            Surat04 srt = tumpukan[top];
            top--;
            return srt;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat04 peek() {
        if (!isEmpty()) {
            return tumpukan[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang masuk.");
            return null;
        }
    }

    public void cariSurat(String namaMhs) {
        boolean ditemukan = false;
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                if (tumpukan[i].namaMahasiswa.equalsIgnoreCase(namaMhs)) {
                    System.out.println("Surat ditemukan pada posisi dari atas ke-" + (top - i + 1));
                    System.out.println("ID Surat: " + tumpukan[i].idSurat);
                    System.out.println("Nama    : " + tumpukan[i].namaMahasiswa);
                    System.out.println("Kelas   : " + tumpukan[i].kelas);
                    System.out.println("Izin    : " + tumpukan[i].jenisIzin);
                    System.out.println("Durasi  : " + tumpukan[i].durasi + " hari");
                    System.out.println("---------------------------------");
                    ditemukan = true;
                }
            }
        }
        if (!ditemukan) {
            System.out.println("Surat dari mahasiswa bernama " + namaMhs + " tidak ditemukan.");
        }
    }
}