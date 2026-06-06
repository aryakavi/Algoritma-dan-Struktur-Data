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

    public void add(Mahasiswa04 data) {
        if (dataMahasiswa[0] == null) {
            dataMahasiswa[0] = data;
            idxLast = 0; 
            return;
        }

        int currentIdx = 0;
        while (true) {
            if (currentIdx >= dataMahasiswa.length) {
                System.out.println("Kapasitas array penuh, tidak dapat menambah data.");
                return;
            }

            if (dataMahasiswa[currentIdx] == null) {
                dataMahasiswa[currentIdx] = data;
                if (currentIdx > idxLast) {
                    idxLast = currentIdx; 
                }
                break;
            }

            if (data.ipk < dataMahasiswa[currentIdx].ipk) {
                currentIdx = 2 * currentIdx + 1;
            } 
            else {
                currentIdx = 2 * currentIdx + 2;
            }
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}