import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int M =sc.nextInt();
        int [] A = new int[N];
        for(int i=0; i<A.length; i++){
            A[i] = i+1;
        }
        for(int i=0; i<M; i++){
            int le = sc.nextInt()-1;
            int re = sc.nextInt()-1;
            while (le < re) {
                int temp = A[le];
                A[le++] = A[re];
                A[re--] = temp;
            }
        }
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }



                }
            }
























