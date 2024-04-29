import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int [] A = new int[4];
        int count =0;
        for(int i=0; i<3; i++){
            count =0;
            for(int j=0; j<A.length; j++){
                A[j]= sc.nextInt();
                if(A[j]==0 ) count++;
            }
            if(count == 1) System.out.println("A");
            else if(count == 2) System.out.println("B");
            else if(count == 3) System.out.println("C");
            else if(count == 4) System.out.println("D");
            else if(count == 0) System.out.println("E");
        }
    }
    }



