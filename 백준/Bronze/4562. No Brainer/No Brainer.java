import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        for (int i = 0; i < A; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (b >= c) System.out.println("MMM BRAINS");
            else System.out.println("NO BRAINS");
        }
    }
}










