import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A =sc.nextInt();
        int B =sc.nextInt();
        double C =  B* 0.01;
        double Br = A-(A*C);
        if(Br>=100)System.out.println("0");
        else System.out.println("1");
    }

}






