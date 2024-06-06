import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int p =0;
        int max=0;
        for(int i=0; i<4; i++){
            int A =sc.nextInt();
            int B =sc.nextInt();
            p -= A;
            p += B;
            if(p > max) max = p;
        }
    System.out.println(max);
    }
}








