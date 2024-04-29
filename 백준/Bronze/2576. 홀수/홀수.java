import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int [] A = new int [8];
        int [] B = new int [8];
        int sum =0;
        int C =0;
        for(int i=0; i<7; i++){
            A[i] =sc.nextInt();
            if(A[i] % 2 == 1) B[i] = A[i];
        }
        Arrays.sort(B);
        for(int i=0; i<B.length; i++){
            sum +=B[i];

        }
        for(int i=0; i<B.length; i++){
            if(B[i] !=0) {
                C=B[i];
                break;
            }

        }
        if(sum ==0 && C==0){
            System.out.println("-1");
        }
        else {
            System.out.println(sum);
            System.out.println(C);
        }


    }
    }



