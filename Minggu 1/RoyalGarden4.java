public class RoyalGarden4 {

    static int[][] stockBunga04 = {{10, 5, 15, 7}, {6, 11, 9, 12},  {2, 10, 10, 5},  {5, 7, 12, 9} };
    static int[] hargaBunga04 = {75000, 50000, 60000, 10000};
    static String[] namaCabang04 = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};

    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.printf("%-15s | %-15s | %-15s\n", "Cabang", "Pendapatan", "Status");
        System.out.println("====================================================");
        tampilkanPendapatanDanStatus();
    }

    public static void tampilkanPendapatanDanStatus() {
        for (int i = 0; i < stockBunga04.length; i++) {
            long pendapatan04 = 0;

            for (int j = 0; j < stockBunga04[i].length; j++) {
                pendapatan04 += (long) stockBunga04[i][j] * hargaBunga04[j];
            }

            String status04;
            if (pendapatan04 > 1500000) {
                status04 = "Sangat Baik";
            } else {
                status04 = "Perlu Evaluasi";
            }

            System.out.printf("%-15s | Rp %-13d | %-15s\n", namaCabang04[i], pendapatan04, status04);
        }
        System.out.println("====================================================");
    }
}