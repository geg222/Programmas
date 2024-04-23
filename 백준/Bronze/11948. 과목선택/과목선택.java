
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] A = new int[5];
    int[] B = new int[3];
    int sum = 0;
    int sum1 = 0;
    int sum2 =0;
    for(int i=0; i<4; i++){
        A[i] = sc.nextInt();

    }
    for(int i =0; i<2; i++){
        B[i] = sc.nextInt();
    }
    Arrays.sort(A);
    Arrays.sort(B);
    sum = A[4]+A[3]+A[2];
    sum1 = B[2];
    sum2 = sum+sum1;
    System.out.println(sum2);


     }
    }



