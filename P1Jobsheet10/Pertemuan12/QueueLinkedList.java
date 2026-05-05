package Pertemuan12;

public class QueueLinkedList {
    Node front;
    Node rear;
    int size;
    int max;

    public QueueLinkedList(int max) {
        this.front = null;
        this.rear = null;
        this.size = 0;
        this.max = max;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Semua antrian berhasil dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Mohon maaf, antrian sedang penuh. Silakan kembali lagi nanti.");
        } else {
            Node newNode = new Node(mhs, null);
            if (isEmpty()) {
                front = newNode;
                rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
            size++;
            System.out.println("Mahasiswa a.n " + mhs.nama + " berhasil masuk ke antrian.");
        }
    }

    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong. Tidak ada mahasiswa yang dipanggil.");
        } else {
            Mahasiswa dipanggil = front.data;
            System.out.println("\n--- PANGGILAN LAYANAN ---");
            System.out.println("Memanggil mahasiswa berikut untuk menuju loket:");
            dipanggil.tampilkanData();
            
            front = front.next;
            size--;
            
            if (isEmpty()) {
                rear = null;
            }
        }
    }

    public void tampilkanUjungAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("\n--- ANTRIAN TERDEPAN ---");
            front.data.tampilkanData();

            System.out.println("--- ANTRIAN PALING AKHIR ---");
            rear.data.tampilkanData();
        }
    }

    public void cekJumlahAntrian() {
        System.out.println("Jumlah mahasiswa yang sedang mengantre saat ini: " + size + " orang.");
        System.out.println("Sisa kapasitas antrian: " + (max - size) + " orang.");
    }
}