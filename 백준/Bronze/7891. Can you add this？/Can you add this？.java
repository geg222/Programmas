import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        int N =sc.nextInt();
        for(int i=0; i<N; i++){
            Long A =sc.nextLong();
            Long B =sc.nextLong();
            Long sum = A+B;
            System.out.println(sum);
        }


    }
        }












