package CaseMethod2;

public class DoubleLinkedListAntrian04 {
    NodeAntrian04 head, tail;
    int size;
    int counterAntrian = 1; 

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(Pembeli04 p) {
        if (isEmpty()) {
            head = tail = new NodeAntrian04(null, counterAntrian++, p, null);
        } else {
            NodeAntrian04 newNode = new NodeAntrian04(tail, counterAntrian++, p, null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public NodeAntrian04 dequeue() {
        if (isEmpty()) return null;
        NodeAntrian04 temp = head;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return temp;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian saat ini sedang kosong.");
            return;
        }
        System.out.println("========================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("========================================");
        System.out.printf("%-15s %-20s %-15s\n", "No Antrian", "Nama", "No HP");
        
        NodeAntrian04 current = head;
        while (current != null) {
            System.out.printf("%-15d %-20s %-15s\n", current.noAntrian, current.pembeli.namaPembeli, current.pembeli.NoHp);
            current = current.next;
        }
    }
}
