

public class DoublelinkedList04 {
    Node04 head;
    Node04 tail;
    int size;

    public DoublelinkedList04() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
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
        Mahasiswa04 deletedData = head.data;
        
        if(head == tail){
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data berhasil dihapus.");
        deletedData.tampil();
    }

    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked List kosong.");
            return;
        } 
        Mahasiswa04 deletedData = tail.data;
        
        if(head == tail){
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data berhasil dihapus.");
        deletedData.tampil();
    }

    public void add(int index, Mahasiswa04 data) {
        if (index < 0 || index > size) {
            System.out.println("Indeks di luar batas.");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node04 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node04 newNode = new Node04(data);
            newNode.next = current;
            newNode.prev = current.prev;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
            System.out.println("Data berhasil ditambahkan pada indeks " + index);
        }
    }

    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        Node04 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        if (current == tail) {
            System.out.println("Tidak ada data setelah NIM " + keyNim + " (NIM ini berada di akhir).");
            return;
        }

        Node04 target = current.next;
        Mahasiswa04 deletedData = target.data;

        if (target == tail) {
            current.next = null;
            tail = current;
        } else {
            current.next = target.next;
            target.next.prev = current;
        }
        size--;
        System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus:");
        deletedData.tampil();
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Indeks di luar batas.");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node04 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Mahasiswa04 deletedData = current.data;
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
            System.out.println("Data pada indeks " + index + " berhasil dihapus:");
            deletedData.tampil();
        }
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        System.out.println("=== Data Pertama ===");
        head.data.tampil();
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        System.out.println("=== Data Terakhir ===");
        tail.data.tampil();
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Indeks di luar batas.");
            return;
        }
        Node04 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println("=== Data pada Indeks " + index + " ===");
        current.data.tampil();
    }
}