
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
        int []A =new int[3];
        for(int i=0; i<A.length; i++){
            A[i] =sc.nextInt();
        }
        if (A[0]==0 || A[1]==0 || A[2]==0) break ;
        Arrays.sort(A);
        
       if  (A[0]+A[1]<=A[2]) System.out.println("Invalid");
       else if (A[0] == A[1] && A[1] == A[2]) System.out.println("Equilateral");
       else if (A[0]==A[1] || A[1]==A[2] || A[0]==A[2]) System.out.println("Isosceles");
       else System.out.println("Scalene");

    }
        }
     }




