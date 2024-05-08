import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] A = new int[5];
        int sum =0;
        int set =0;
        for(int i=0; i<5; i++){
            A[i] = sc.nextInt();
            sum += A[i];
        }
        Arrays.sort(A);
        int sumr = sum / 5;
        System.out.println(sumr);
        System.out.println(A[2]);

    }
}









