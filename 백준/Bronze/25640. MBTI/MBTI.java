import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A =sc.next();
        int N =sc.nextInt();
        int count =0;
        for(int i=0; i<N; i++){
            String B =sc.next();
            if(A.equals(B))count++;
        }
        System.out.println(count);
        }
        }











