package Jobsheet9;
public class StackTugasMahasiswa04 {
    Mahasiswa04[] stack;
    int top;
    int size;

    public StackTugasMahasiswa04(int size) {
        this.size = size;
        stack = new Mahasiswa04[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa04 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa04 pop() {
        if (!isEmpty()) {
            Mahasiswa04 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa04 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    // Perubahan untuk pertanyaan 4 Sub-bab 2.1.3
    public Mahasiswa04 peekBottom() {
    if (!isEmpty()) {
        return stack[0]; // Tugas pertama selalu di indeks 0
    } else {
        System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
        return null;
    }
    }

    // Perubahan untuk pertanyaan 5 Sub-bab 2.1.3
    public int getJumlahTugas() {
        return top + 1;
    }

    // Perubahan untuk pertanyaan 1 Sub-bab 2.1.3
    public void print() {
    if (!isEmpty()) {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    } else {
        System.out.println("Stack kosong");
    }
    }
}