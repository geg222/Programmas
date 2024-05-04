import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int count =0;
        int notcount=0;
        for(int i=0; i<N; i++){
            int A =sc.nextInt();
            if(A == 1) count++;
            else if(A==0) notcount++;
        }
        if(count > notcount) System.out.println( "Junhee is cute!");
        else  System.out.println( "Junhee is not cute!");




        }

    }





