import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int H = 0;
        int Q = 0;
        int Y = 0;
        int A =sc.nextInt();
        int B= sc.nextInt();
        int C= sc.nextInt();
        if(A <=N) {H +=A;}
        else H =N;
        if(B <=N) {Q +=B;}
        else Q =N;
        if(C <=N) {Y +=C;}
        else Y =N;
        int sum = H+Q+Y;
        System.out.println(sum);



        }
    }











