public class AntrianKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int kuotaDPA;
    int jumlahDiproses;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.kuotaDPA = 30; 
        this.jumlahDiproses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        if (!isEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh (Maksimal " + max + " mahasiswa)!");
        } else if (jumlahDiproses + size >= kuotaDPA) {
            System.out.println("Maaf, kuota DPA sudah penuh. Mahasiswa tidak bisa mendaftar antrian lagi.");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrian KRS.");
        }
    }

    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian KRS kosong. Tidak ada yang bisa dipanggil.");
            return;
        }

        int jumlahPanggilan = Math.min(2, size);
        
        System.out.println("--- PANGGILAN PROSES KRS ---");
        for (int i = 0; i < jumlahPanggilan; i++) {
            Mahasiswa mhs = data[front];
            System.out.print("Memanggil antrian ke-" + (i + 1) + ": ");
            mhs.tampilkanData();
            
            front = (front + 1) % max;
            size--;
            jumlahDiproses++;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("--- Daftar Antrian KRS Saat Ini ---");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    public void lihatDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("--- 2 Antrian Terdepan ---");
            int jumlahTampil = Math.min(2, size);
            for (int i = 0; i < jumlahTampil; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    public void lihatPalingAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("--- Antrian Paling Akhir ---");
            data[rear].tampilkanData();
        }
    }

    public void cetakJumlahAntrian() {
        System.out.println("Jumlah mahasiswa yang sedang mengantri saat ini: " + size);
    }

    public void cetakJumlahDiproses() {
        System.out.println("Jumlah mahasiswa yang SUDAH selesai proses KRS: " + jumlahDiproses);
    }

    public void cetakBelumProses() {
        int sisaKuota = kuotaDPA - jumlahDiproses;
        System.out.println("Sisa kuota mahasiswa DPA yang BELUM proses KRS: " + sisaKuota + " dari total " + kuotaDPA);
    }
}