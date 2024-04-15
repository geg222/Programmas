import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int L = sc.nextInt();
       int P = sc.nextInt();
       int [] A = new int[5];
       for(int i=0; i<5; i++){
           A[i] = sc.nextInt();
           A[i]-=L*P;
       }
       for(int j : A)
       System.out.print(j+" ");
    }
    }



