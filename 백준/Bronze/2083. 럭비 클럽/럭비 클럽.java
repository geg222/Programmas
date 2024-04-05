import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String A;
            int B;
            int C;
          A =sc.next();
          B = sc.nextInt();
          C = sc.nextInt();
            if(Objects.equals(A, "#") && B == 0 && C==0){
                break;
            }
         String j;
         if(B>17 || C >= 80 ) j = "Senior";
         else j = "Junior";
         System.out.println(A +" "+ j);
        }
    }

}
