import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger("10000");
        BigInteger b = new BigInteger("10000");
        a = sc.nextBigInteger();
        b = sc.nextBigInteger();
        BigInteger n = a.divide(b);
        BigInteger C = a.remainder(b);


            System.out.println(n);
            System.out.println(C);

        }
    }
