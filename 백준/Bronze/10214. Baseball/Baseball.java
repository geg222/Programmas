import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int Yon = 0;
        int Kor = 0;
        for(int i = 0; i < T; i++){
            for (int j = 0; j < 9; j++) {
                int Y = sc.nextInt();
                int K = sc.nextInt();
                Yon += Y;
                Kor += K;
            }
            if(Yon > Kor) System.out.println("Yonsei");
            else if(Kor > Yon) System.out.println("Korea");
            else if (Kor == Yon) System.out.println("Draw");
        }

    }
}









