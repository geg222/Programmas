import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int A = sc.nextInt();
       int B = sc.nextInt();
       int C = sc.nextInt();
       int D = sc.nextInt();

       int E = sc.nextInt();
       int F = sc.nextInt();
       int G = sc.nextInt();
       int H = sc.nextInt();

       int Q = A+B+C+D;
       int W = E+F+G+H;


        System.out.println(Math.max(Q, W));

        }
    }


