import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String A =sc.next();
        String B =sc.next();
        String C =sc.next();
        String D =sc.next();

        String F =A+B;
        String F2 = C+D;
        Long sum = Long.valueOf(F);
        Long sum2 = Long.valueOf(F2);
        System.out.println(sum+sum2);




        }

    }





