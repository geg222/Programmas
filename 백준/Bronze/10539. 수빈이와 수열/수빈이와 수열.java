
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int [] A = new int[N];
        int [] B = new int[N];
        int sum=0;
        for(int i=0; i<A.length; i++){
            A[i] = sc.nextInt();
        }

        for(int i=0; i<A.length; i++){
            B[i] = A[i] * (i + 1) - sum;
            sum +=B[i];
        }

        for(int i=0; i<B.length; i++){
            System.out.print(B[i]+" ");
        }

                }
            }
























