import java.util.Scanner;

public class Perulangan4 {
    public static void main(String[] args) {
        Scanner arya04 = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        long nim = arya04.nextLong();
        int n = (int) (nim % 100);
        if (n < 10) {
            n += 10;
        }

        System.out.println("n = " + n);
        System.out.print("Output: ");

        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }
            if (i % 3 == 0) {
                System.out.print("# ");
            } 
            else if (i % 2 == 0) {
                System.out.print(i + " ");
            } 
            else {
                System.out.print("* ");
            }
        arya04.close();
        }
    }
}