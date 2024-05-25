import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        String A;
        int X =0;
        int Y =0;

        for(int i=0; i<=N; i++){
            A =sc.nextLine();
            if(A.equals("D")) X++;
            else if (A.equals("P")) Y++;
            if(X-Y==2) break;
            else if(Y-X ==2) break;

        }
        System.out.println(X+":"+Y);
        }
    }








