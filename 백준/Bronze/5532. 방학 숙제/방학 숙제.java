import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Q = 100;
        int W = 100;

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        if( A % C == 0) Q = N- (A/C);
        else Q = N- (A/C+1);

        if (B % D ==0) W = N- (B/D);
        else W = N-(B/D+1);

        System.out.println(Math.min(Q, W));

        }
    }


