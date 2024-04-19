
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long A = sc.nextLong();
        Long B = sc.nextLong();
        Long C = sc.nextLong();
        Long D = C*2;
        if(A+B < D) System.out.println(A+B);
        else if (A+B >= D) System.out.println((A+B)-D);
    }
}


