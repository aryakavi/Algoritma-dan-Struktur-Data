package Praktikum03;

public class Mahasiswa04{
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;
}

public class MahasiswaDemo04{
    public static void main(String[] args) {
        Mahasiswa04[] arrayOfMahasiswa = new Mahasiswa04[3];
        arrayOfMahasiswa[0] = new Mahasiswa04 ();
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].kelas = "SIB-1E";
        arrayOfMahasiswa[0].ipk = (float) 3.75;
        arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        
        arrayOfMahasiswa[1] = new Mahasiswa04 ();
        arrayOfMahasiswa[1].nim = "2341720172";
        arrayOfMahasiswa[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa[1].kelas = "TI-2A";
        arrayOfMahasiswa[1].ipk = (float) 3.36;

        arrayOfMahasiswa[2] = new Mahasiswa04 ();
        arrayOfMahasiswa[2].nim = "244107023006";
        arrayOfMahasiswa[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa[2].kelas = "TI-2E";
        arrayOfMahasiswa[2].ipk = (float) 3.80;
    }
}
