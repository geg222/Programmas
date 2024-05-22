import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        while (true) {
            int T = sc.nextInt();
            if(T == -1) break;
            sum += T;
        }
        System.out.println(sum);
     



    }
    }







