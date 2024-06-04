import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        int [][] A = new int[10][10];
        int max =0;
        int B =0;
        int C =0;
        for(int i=1; i<10; i++){
            for(int j=1; j<10; j++){
                A[i][j] = sc.nextInt();
            }
        }
        for(int i=1; i<10; i++){
            for(int j=1; j<10; j++){
               if(A[i][j] >= max) {
                   max = A[i][j];
                   B= i;
                   C= j;
               }
            }
        }
        System.out.println(max);
        System.out.println(B+" "+C);
        }
    }

