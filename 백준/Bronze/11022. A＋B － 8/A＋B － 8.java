import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int B = sc.nextInt();
            int C = sc.nextInt();
            int sum = B + C;
            System.out.println("Case #" + i + ": " +B+" + "+C+" = "+ sum);
        }
    }
}