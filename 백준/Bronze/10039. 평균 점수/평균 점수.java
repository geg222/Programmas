import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A =sc.nextInt();
        int B =sc.nextInt();
        int C =sc.nextInt();
        int D =sc.nextInt();
        int E =sc.nextInt();
        int sum = 0;
        if(A<40 ) A=40;
        if(B<40 ) B=40;
        if(C<40 ) C=40;
        if(D<40 ) D=40;
        if(E<40 ) E=40;
        sum = (A + B + C + D + E) / 5;
        System.out.println(sum);
    }
}


