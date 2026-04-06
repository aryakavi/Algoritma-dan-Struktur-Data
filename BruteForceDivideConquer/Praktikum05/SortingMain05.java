package BruteForceDivideConquer.Praktikum05;

public class SortingMain05 {
    public static void main(String[] args) {
        int a[] = {20,10,2,7,12};
        
        Sorting05 dataurut1 = new Sorting05(a, a.length);
        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurut dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();
    }
}
