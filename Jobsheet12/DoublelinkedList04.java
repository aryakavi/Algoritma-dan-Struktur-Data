

public class DoublelinkedList04 {
    Node04 head;
    Node04 tail;

    public DoublelinkedList04() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa04 data) {
        Node04 newNode = new Node04(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa04 data) {
        Node04 newNode = new Node04(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa04 data) {
        Node04 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node04 newNode = new Node04(data);

        // jika current adalah tail, node baru ditambahkan di akhir
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else { // node baru disisipkan di tengah
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        // Tambahan kode ketika list kosong (praktikum 1 pertanyaan 5)
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node04 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void printReverse() {
    if (isEmpty()) {
        System.out.println("Linked List masih kosong.");
        return;
    }

    System.out.println("Mencetak Data dari Belakang (Reverse)");
    Node04 current = tail; // Mulai dari node terakhir (tail)
    
    // Looping mundur selama node tidak null
    while (current != null) {
        current.data.tampil();    // print data node
        current = current.prev;   // Pindah ke node sebelumnya dengan pointer prev
    }
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List kosong.");
            return;
        }
        
        if(head == tail){
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked List kosong.");
            return;
        } 
        
        if(head == tail){
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

    }
}