import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        for (int i = 0; i < A.length(); i++) {
            System.out.print(A.charAt(i));
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}




