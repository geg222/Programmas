import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int [] A = new int [100];
       int sum =0;
       for(int i=0; i<N; i++){
           A[i] = sc.nextInt();
       }
       int v = sc.nextInt();
        for(int i=0; i<N; i++){
            if(A[i] == v) sum++;
        }
        System.out.println(sum);
    }
    }



