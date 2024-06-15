import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        char [][]A = new char[5][15];
        String B = "";
        for(int i=0; i<5; i++){
            B = sc.next();
            for(int j=0; j<B.length(); j++){
                A[i][j] = B.charAt(j);
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (A[j][i] == '\0')
                    continue;
                System.out.print(A[j][i]);
            }
        }

    }
}













