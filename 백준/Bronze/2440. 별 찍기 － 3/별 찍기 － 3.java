import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i <= N; i++) {
            if (i >= 1) System.out.println(" ");
            for (int j = N; j > i; j--) {
                System.out.print("*");
            }
        }
    }
}
