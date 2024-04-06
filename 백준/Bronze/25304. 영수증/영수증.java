import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int sum =0;
        for(int i=0; i<A; i++){
            int B= sc.nextInt();
            int C= sc.nextInt();
            sum += B*C;
        }
        if(sum == N) {
            System.out.println("Yes");
        }
        else  System.out.println("No");


        }
    }


