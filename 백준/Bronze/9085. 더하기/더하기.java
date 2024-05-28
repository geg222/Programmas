import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        for(int i=0; i<N; i++) {
            int sum = 0;
            int A = sc.nextInt();
            for (int j = 0; j < A; j++) {
                int B = sc.nextInt();
                sum += B;
            }
            System.out.println(sum);
        }

    }
}








