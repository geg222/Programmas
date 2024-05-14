import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] A= new int[9];
        int sum =0;
        for(int i=0; i<A.length; i++) {
            A[i] = sc.nextInt();
            sum += A[i];
        }
            for (int i = 0; i < 8; i++) {
                for (int j = i+1; j < 9; j++) {
                    if (sum - A[i] - A[j] == 100) {
                        A[i] = 0;
                        A[j] = 0;
                        Arrays.sort(A);
                        for (int k = 2; k < 9; k++) {
                            System.out.println(A[k]);
                        }
                        return;
                    }
                }
            }
        }
    }











