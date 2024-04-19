import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []A = new int[4];
        for(int i=0; i<4; i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int team1 = A[0]+A[3];
        int team2 = A[1]+A[2];
        System.out.println(Math.abs(team1-team2));
    }
}


