|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020087 |
| Nama |  Aryakavi Raditya Imaran |
| Kelas | TI - 1F |
| Repository | ([https://github.com/aryakavi/Algoritma-dan-Struktur-Data]) |

# JOBSHEET 14 : DOUBLE LINKED LIST

## 14.1 Tujuan Praktikum 
Setelah melakukan praktikum ini, mahasiswa mampu:  
1. memahami model Tree khususnya Binary Tree 
2. membuat dan mendeklarasikan struktur algoritma Binary Tree. 
3. menerapkan dan mengimplementasikan algoritma Binary Tree dalam kasus Binary Search Tree

## Kegiatan Praktikum 1 
Implementasi Binary Search Tree menggunakan Linked List (100 Menit) 

### 14.2.1 Percobaan 1
Pada percobaan ini akan diimplementasikan Binary Search Tree dengan operasi dasar, dengan menggunakan linked list. 

Hasil kode akhir Class Mahssiswa04
```JAVA
package Pertemuan14;

public class Mahasiswa04 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa04(){
    }

    public Mahasiswa04(String nim, String nama, String kelas, double ipk){
            this.nim = nim;
            this.nama = nama;
            this.kelas = kelas;
            this.ipk = ipk;
    }

    public void tampilInformasi(){
        System.out.println("NIM: " + this.nim + " " + 
        "Nama: " + this.nama + " " +
        "Kelas: " + this.kelas + " " +
        "IPK: " + this.ipk);
    }
}
```

Hasil kode akhir class Node04
```JAVA
package Pertemuan14;

public class Node04 {
    Mahasiswa04 mahasiswa;
    Node04 left, right;

    public Node04(){
    }

    public Node04(Mahasiswa04 mahasiswa){
        this.mahasiswa = mahasiswa;
        left = right = null;
    }
}
```

Hasil kode akhir class BinaryTree04
```JAVA
package Pertemuan14;

public class BinaryTree04 {
    Node04 root;

    public BinaryTree04(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;    
    }

    public void add(Mahasiswa04 mahasiswa) {
    Node04 newNode = new Node04(mahasiswa);
    if (isEmpty()) {
        root = newNode;
    } else {
        Node04 current = root;
        Node04 parent = null;
        while (true) {
            parent = current;
            if (mahasiswa.ipk < current.mahasiswa.ipk) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    }
    }

    boolean find(double ipk) {
    boolean result = false;
    Node04 current = root;
    while (current != null) {
        if (current.mahasiswa.ipk == ipk) {
            result = true;
            break;
        } else if (ipk > current.mahasiswa.ipk) {
            current = current.right;
        } else {
            current = current.left;
        }
    }
    return result;
    }   

    void traversePreOrder(Node04 node) {
    if (node != null) {
        node.mahasiswa.tampilInformasi();
        traversePreOrder(node.left);
        traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node04 node) {
    if (node != null) {
        traverseInOrder(node.left);
        node.mahasiswa.tampilInformasi();
        traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node04 node) {
    if (node != null) {
        traversePostOrder(node.left);
        traversePostOrder(node.right);
        node.mahasiswa.tampilInformasi();
        }
    }

    Node04 getSuccessor(Node04 del) {
    Node04 successor = del.right;
    Node04 successorParent = del;
    while (successor.left != null) {
        successorParent = successor;
        successor = successor.left;
        }
    if (successor != del.right) {
        successorParent.left = successor.right;
        successor.right = del.right;
        }
    return successor;
    }

    void delete(double ipk) {
    if (isEmpty()) {
        System.out.println("Binary tree kosong");
        return;
    }
    
    // cari node (current) yang akan dihapus
    Node04 parent = root;
    Node04 current = root;
    boolean isLeftChild = false;
    
    while (current != null) {
        if (current.mahasiswa.ipk == ipk) {
            break;
        } else if (ipk < current.mahasiswa.ipk) {
            parent = current;
            current = current.left;
            isLeftChild = true;
        } else if (ipk > current.mahasiswa.ipk) {
            parent = current;
            current = current.right;
            isLeftChild = false;
        }
    }
    
    // penghapusan
    if (current == null) {
        System.out.println("Data tidak ditemukan");
        return;
    } else {
        // jika tidak ada anak (leaf), maka node dihapus
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else {
                if (isLeftChild) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        } else if (current.left == null) { // jika hanya punya 1 anak (kanan)
            if (current == root) {
                root = current.right;
            } else {
                if (isLeftChild) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } else if (current.right == null) { // jika hanya punya 1 anak (kiri)
            if (current == root) {
                root = current.left;
            } else {
                if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            }
        } else { // jika memiliki 2 anak
            Node04 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else {
                if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
            }
            successor.left = current.left;
        }
    }
} 
}
```

Hasil kode akhir class BinaryTreeMain04
```JAVA
package Pertemuan14;
public class BinaryTreeMain04 {

    public static void main(String[] args) {
        BinaryTree04 bst = new BinaryTree04();

        bst.add(new Mahasiswa04("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa04("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa04("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa04("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.println("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan ipk: 3.22 : ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa04("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa04("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa04("244160170", "Fizi", "B", 3.46));
        
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);
        
        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        
        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);
    }
}
```

### 14.2.2 Verifikasi Hasil Percobaan
```
Daftar semua mahasiswa (in order traversal):
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

Pencarian data mahasiswa:
Cari mahasiswa dengan ipk: 3.54 : 
Ditemukan
Cari mahasiswa dengan ipk: 3.22 : Tidak ditemukan

Daftar semua mahasiswa setelah penambahan 3 mahasiswa:
InOrder Traversal:
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

PreOrder Traversal:
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72

PostOrder Traversal:
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57

Penghapusan data mahasiswa

Daftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
PS D:\Algoritma-dan-Struktur-Data> 
```

### 14.2.3 Pertanyaan Percobaan
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa? 
    Di Binary Search Tree memiliki alur data yang sudah jelas, nilai left lebih kecil dari parent, dan nilai right lebih besar dari parent. Sehingga ketika mencari data, kita tdak memerlukan looping atu mengecek semua node satu per satu (seperti di Binary Tree biasa). Kita hanya perlu membandingnkan nilainya apakah lebih kecil atau lebih besar.

2. Untuk apakah di class Node, kegunaan dari atribut left dan right? 
    Fungsinya adalah sebagai pointer atau penunjuk yang mengaitkan node parent dengan child atau anaknya sebelah kiri dan kanannya. Kiri lebih kecil dari nilai parent, dan kanan lebih besar dari nilai parent. 

3. 
a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree? 
    Root berfungsi sebagai titik awal atau node paling atas dari Binary Search Tree. Semua operasi tree seperti penambahana, pencarian, traverse, dan penghapusan akan dimulai dengan mengecek dari root.

b. Ketika objek tree pertama kali dibuat, apakah nilai dari root? 
    ketika objek tree pertama kali instansiasi, nilai root adalah null. Sehingga tree tersebut masih kosong dan belum memiliki node sama sekali.

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi? 
    Di methos add(), program akan memanggil isEmpty() untuk mengecek apakah root=null. Karena tree masih kosong (hasilnya true), maka objek newNode yang berisi data mahsiswa baru akan di assign sebagai root dari tree tersebut (root = newNode;)

5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut? 
```JAVA
parent = current;
    if (mahasiswa.ipk < current.mahasiswa.ipk) {
        current = current.left;
        if (current == null) {
            parent.left = newNode;
            return;
        }
    } else {
        current = current.right;
        if (current == null) {
            parent.right = newNode;
            return;
        }
    }
```
    - Parent = current; dimana parent digunakan untuk menyimpan referensi ke node induk sebelum variabel current berpindah ke node anak dibawahnya.
    - if (mahasiswa.ipk < current.mahasiswa.ipk); Bagian ini membandingkan IPK mahsiswa baru dengan IPK mahasiswa pada node current. Jika IPK lebih kecil maka penelusuran akan diarahkan ke cabang kiri (current = current.left;)
    - if (current == null) : Jika cabang kiri ternyata kosong atau null, maka posisi yang tepat ditemukan. Node baru ditambahkan di anak kiri dari parent (parent.left = newNode;), lalu proses dihentikan (return;)
    - else : kondisi lain jika IPK mahasiswa barulebih besar atau sama dengan IPK node current, maka penelusuran diarahkan ke cabang atau anak sebelah kanan ( current = current.right;) Jika cabang kanan kosong (current == null), maka newNode ditambahkan sebagai anak kanan dari parent (parent.right = newNode;) dan proses dihentikan (return;)

6. Jelaskan langkah-langkah pada method delete() saat menghapus sebuah node yang memiliki dua anak. Bagaimana method getSuccessor() membantu dalam proses ini? 

## 14.3 Kegiatan Praktikum 2
Implementasi Binary Tree dengan Array (45 Menit)

### 14.3.1 Tahapan Percobaan

Class BinaryTreeArray04
```JAVA
package Pertemuan14;
public class BinaryTreeArray04 {
    Mahasiswa04[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray04() {
        this.dataMahasiswa = new Mahasiswa04[10];
    }

    void populateData(Mahasiswa04 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}
```

Class BinaryTreeArrayMain04
```JAVA
package Pertemuan14;
public class BinaryTreeArrayMain04 {

    public static void main(String[] args) {
        BinaryTreeArray04 bta = new BinaryTreeArray04();
        
        Mahasiswa04 mhs1 = new Mahasiswa04("244160121", "Ali", "A", 3.57);
        Mahasiswa04 mhs2 = new Mahasiswa04("244160185", "Candra", "C", 3.41);
        Mahasiswa04 mhs3 = new Mahasiswa04("244160221", "Badar", "B", 3.75);
        Mahasiswa04 mhs4 = new Mahasiswa04("244160220", "Dewi", "B", 3.35);
        
        Mahasiswa04 mhs5 = new Mahasiswa04("244160131", "Devi", "A", 3.48);
        Mahasiswa04 mhs6 = new Mahasiswa04("244160205", "Ehsan", "D", 3.61);
        Mahasiswa04 mhs7 = new Mahasiswa04("244160170", "Fizi", "B", 3.86);
        
        Mahasiswa04[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        
        bta.populateData(dataMahasiswas, idxLast);
        System.out.println("\nInOrder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);
    }
}
```

### 14.3.2 Pertanyaan Percobaan
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray? 
    Atribut dataMahasiswa berfungsi sebagai struktur data utama yaitu berupa array untuk menyimpan node atau elemen binary tree. (objek Mahsiswa04). Sementara atribut idxLast, berfungsi untuk mencatat indeks dari elemen terakhir di dalam array yang valid dan merupakan bagian dari tree. Atribut ini berguna untuk membantu program mengetahui batas akhir dari tree.

2. Apakah kegunaan dari method populateData()? 
    Kegunaan dari method poulateData() adalah untuk memasukkan sekumpulan data sekaligus ke dalam binary tree. Method menerima parameter berupa array objek mahasiswa dan nilai indeks terakhirnya, lalu memasukkannya ke dalam atribut dataMahasiswa dan idxLast di class BinaryTreeArray04

3. Apakah kegunaan dari method traverseInOrder()? 
    Kegunaan dari method traverseInOrder() adalah untuk menelusuri atau mentraversal dan mengeprint isi binary tree dengan metode In-Order (kiri - root - kanan). Metode ini menggunakan cara rekursif untuk membaca array, dimana ia mengecek anak kiri, mencetak informasi mahasiswa di indeks saat ini, lalu mengecek anak kanannya.

4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan right child masing-masing? 
    Jika suatu node disimpan dalam array di indeks 2, maka perhitungan posisi anak-anaknya berdasarkan rumus array dengan index nol adalah
    - Left child    = 2 * i + 1 = 2 * 2 + 1 = Indeks 5
    - Right child   = 2 * i + 2 = 2 * 2 + 2 = Indeks 6
    
5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?
    Kegunaan statement int idxLast = 6; ialah untuk memberitahu tree bahwa batas elemen terakhir yang memiliki data ada di indeks 6. Sehingga mencegah method penelusuran seperti traverseInOrder untuk memproses indeks 7, 8, dan 9 yang nilainnya null.

6. Mengapa indeks 2*idxStart+1 dan 2*idxStart+2 digunakan dalam pemanggilan rekursif, dan apa kaitannya dengan struktur pohon biner yang disusun dalam array?
    Karena menggunakan array di dalam binary tree, maka tidak akan ada atribut pointer seperti left atau right untuk menyambungkan node. Namun diganti dan dipetakan secara matematis dengan indeks array itu. Untuk array yang dimulai 0, maka sudah defaulnya bahwa untuk node induk di indeks i
    - Child kiri di posisi 2 * i + 1
    - Child kanan di posisi 2 * i + 2
    KArena itu, method traverseInOrder() menggunakan perhitungan di dalam pemanggilan rekursifnya untuk mensimulasikan pergerakan dari node induk menuju kecabang kiri dan kanannya di dalm array

## 14.4 Tugas Praktikum  
1. Buat method di dalam class BinaryTree00 yang akan menambahkan node dengan cara rekursif (addRekursif()). 
2. Buat method di dalam class BinaryTree00 untuk menampilkan data mahasiswa dengan IPK  paling kecil dan IPK yang paling besar (cariMinIPK() dan cariMaxIPK()) yang ada di dalam binary search tree. 
3. Buat method dalam class BinaryTree00 untuk menampilkan data mahasiswa dengan IPK di atas suatu batas tertentu, misal di atas 3.50 (tampilMahasiswaIPKdiAtas(double ipkBatas)) yang ada di dalam binary search tree. 
4. Modifikasi class BinaryTreeArray00 di atas, dan tambahkan :  
- method add(Mahasiswa data) untuk memasukkan data ke dalam binary tree  
- method traversePreOrder() 