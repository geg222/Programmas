import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A =sc.nextInt();
        int [] B = new int[A];
        for(int i=0; i<A; i++){
            B[i] = sc.nextInt();

        }
        sc.close();
        Arrays.sort(B);
        for(int i=0; i<A; i++) {
            System.out.println(B[i]);
        }
        }
    }










