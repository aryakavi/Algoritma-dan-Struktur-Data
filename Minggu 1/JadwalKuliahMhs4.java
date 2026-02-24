import java.util.Scanner;
public class JadwalKuliahMhs4 {
    static Scanner arya04 = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah (n): ");
        int n04 = arya04.nextInt();
        arya04.nextLine(); // Membersihkan buffer
        String[][] jadwal04 = new String[n04][4];
        inputData04(jadwal04);
        
        System.out.println("\n--- Seluruh Jadwal Kuliah ---");
        tampilkanSemua04(jadwal04);
        System.out.print("\nCari jadwal berdasarkan HARI: ");
        String cariHari04 = arya04.nextLine();
        tampilkanBerdasarkanHari04(jadwal04, cariHari04);
        System.out.print("\nCari jadwal berdasarkan NAMA MATA KULIAH: ");
        String cariMatkul04 = arya04.nextLine();
        tampilkanBerdasarkanMatkul04(jadwal04, cariMatkul04);
    }
    public static void inputData04(String[][] data04) {
        for (int i04 = 0; i04 < data04.length; i04++) {
            System.out.println("\nInput Jadwal ke-" + (i04 + 1));
            System.out.print("Nama Mata Kuliah : ");
            data04[i04][0] = arya04.nextLine();
            System.out.print("Ruang            : ");
            data04[i04][1] = arya04.nextLine();
            System.out.print("Hari             : ");
            data04[i04][2] = arya04.nextLine();
            System.out.print("Jam Kuliah       : ");
            data04[i04][3] = arya04.nextLine();
        }
    }
    public static void tampilkanSemua04(String[][] data04) {
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("| %-20s | %-15s | %-10s | %-15s |\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("---------------------------------------------------------------------------");
        for (String[] row04 : data04) {
            System.out.printf("| %-20s | %-15s | %-10s | %-15s |\n", row04[0], row04[1], row04[2], row04[3]);
        }
        System.out.println("---------------------------------------------------------------------------");
    }
    public static void tampilkanBerdasarkanHari04(String[][] data04, String hari04) {
        System.out.println("\nJadwal pada hari " + hari04 + ":");
        boolean found04 = false;
        for (int i04 = 0; i04 < data04.length; i04++) {
            if (data04[i04][2].equalsIgnoreCase(hari04)) {
                System.out.println("- " + data04[i04][0] + " (" + data04[i04][3] + ") di " + data04[i04][1]);
                found04 = true;
            }
        }
        if (!found04) System.out.println("Tidak ada jadwal.");
    }
    public static void tampilkanBerdasarkanMatkul04(String[][] data04, String matkul04) {
        System.out.println("\nDetail Mata Kuliah " + matkul04 + ":");
        boolean found04 = false;
        for (int i04 = 0; i04 < data04.length; i04++) {
            if (data04[i04][0].equalsIgnoreCase(matkul04)) {
                System.out.println("Hari: " + data04[i04][2] + ", Jam: " + data04[i04][3] + ", Ruang: " + data04[i04][1]);
                found04 = true;
            }
        }
        if (!found04) System.out.println("Mata kuliah tidak ditemukan.");
    }
}