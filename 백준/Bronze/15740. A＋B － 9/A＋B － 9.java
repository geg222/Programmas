import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger("100000");
        BigInteger b = new BigInteger("100000");
        a = sc.nextBigInteger();
        b = sc.nextBigInteger();
        //int sum = a.add(b);
        System.out.println(a.add(b));
        }
    }
