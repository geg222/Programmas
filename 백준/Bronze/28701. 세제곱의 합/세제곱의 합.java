import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int sum =0;
        int seq;
        int sum2=0;
        for(int i=1; i<=a; i++){
            sum+=i;
        }
        seq = sum* sum;
        for(int i=1; i<=a; i++){
            sum2 +=(i*i*i);
        }
        System.out.println(sum);
        System.out.println(seq);
        System.out.println(sum2);
        }
    }










