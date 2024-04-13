import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int M = sc.nextInt();
       int [] A = new int [N];
       for(int q =0; q<M; q++){
           int i =sc.nextInt();
           int j =sc.nextInt();
           int k =sc.nextInt();
           for(int I=i-1; I<j; I++){
               A[I] = k;
           }
       }
       for(int i=0; i<A.length; i++){
           System.out.print(A[i]+" ");
       }
    }
    }



