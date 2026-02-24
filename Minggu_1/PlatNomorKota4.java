import java.util.Scanner;
public class PlatNomorKota4 {
    public static void main(String[] args) {
        Scanner arya04 = new Scanner(System.in);

        char[] kode04 = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] kota04 = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

        System.out.print("Masukkan kode plat nomor (huruf kapital): ");
        char inputPlat04 = arya04.next().charAt(0);
        boolean ditemukan04 = false;

        for (int i = 0; i < kode04.length; i++) {
            if (inputPlat04 == kode04[i]) {
                System.out.print("Kota: ");
                for (int j = 0; j < kota04[i].length; j++) {
                    System.out.print(kota04[i][j]);
                }
                System.out.println();
                ditemukan04 = true;
                break;
            }
        }
        if (!ditemukan04) {
            System.out.println("Kode plat nomor tidak ditemukan.");
        }
        arya04.close();
    }
}