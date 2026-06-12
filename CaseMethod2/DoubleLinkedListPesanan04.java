package CaseMethod2;

public class DoubleLinkedListPesanan04 {
    NodePesanan04 head, tail;
    int size;
    int totalPendapatan = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public void addPesanan(Pesanan04 p) {
        if (isEmpty()) {
            head = tail = new NodePesanan04(null, p, null);
        } else {
            NodePesanan04 newNode = new NodePesanan04(tail, p, null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        totalPendapatan += p.harga; 
    }

    public void sortPesananByName() {
        if (isEmpty() || head.next == null) return;
        
        boolean swapped;
        do {
            swapped = false;
            NodePesanan04 current = head;
            while (current.next != null) {
                if (current.pesanan.namaPesanan.compareToIgnoreCase(current.next.pesanan.namaPesanan) > 0) {
                    Pesanan04 temp = current.pesanan;
                    current.pesanan = current.next.pesanan;
                    current.next.pesanan = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void printLaporan() {
        if (isEmpty()) {
            System.out.println("Belum ada data pesanan masuk.");
            return;
        }

        sortPesananByName();

        System.out.println("========================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("========================================");
        System.out.printf("%-15s %-20s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        
        NodePesanan04 current = head;
        while (current != null) {
            System.out.printf("%-15d %-20s Rp%-10d\n", current.pesanan.kodePesanan, current.pesanan.namaPesanan, current.pesanan.harga);
            current = current.next;
        }
        System.out.println("========================================");
        System.out.println("TOTAL PENDAPATAN: Rp" + totalPendapatan);
    }
}
