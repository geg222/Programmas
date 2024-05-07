import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String [] A = new String[50];
        for(int i=0; i<=N; i++){
          A[i]= sc.nextLine();

        }
        for(int i=0; i<N; i++){
            System.out.println(i+1 +". "+ A[i+1]);
        }
        }
    }









