import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
    Scanner sc = new Scanner(System.in);
    int N =sc.nextInt();
    int s =N;
    int count =0;

    while(true){
        N = (N%10*10) + ((N/10+N%10)%10);
        count ++;
        if(s==N) break;
    }
        System.out.println(count);
    }
    }







