import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int []A = new int[4];
       for(int i=0; i<3; i++){
           A[i] = sc.nextInt();
       }
        Arrays.sort(A);
       System.out.println(A[2]);


    }
    }



