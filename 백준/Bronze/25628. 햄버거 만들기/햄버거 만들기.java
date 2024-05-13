import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A =sc.nextInt();
        int B =sc.nextInt();
        int count = 0;
        while(true){
            if(A<=1 || B<=0) break;
            A -=2;
            B -=1;
            count++;
        }
            System.out.println(count);
        }
        }











