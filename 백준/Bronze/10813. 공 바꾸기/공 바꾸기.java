
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] A = new int [N];
        int temp = 0;
        for(int i=0; i<A.length; i++){
            A[i] = i+1;
        }
        for(int i=0; i<M; i++){
            int I = sc.nextInt();
            int J = sc.nextInt();
            temp = A[I-1];
            A[I-1] = A[J-1];
            A[J-1] = temp;
        }
        for (int j : A) {
            System.out.print(j + " ");
        }


    }
}


