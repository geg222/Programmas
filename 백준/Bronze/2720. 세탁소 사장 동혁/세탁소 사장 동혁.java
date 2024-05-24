
import java.math.BigInteger;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int T =sc.nextInt();
        for(int i=0; i<T; i++){
            int A =sc.nextInt();

            int Q = A / 25;
            A %= 25;

            int D = A/ 10;
            A %= 10;

            int N = A/5;
            A %= 5;

            int P = A;

            System.out.println(Q+" "+D+" "+N+" "+P);
        }
    }
    }







