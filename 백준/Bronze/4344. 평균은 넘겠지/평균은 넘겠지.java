import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        for(int i=0; i<N; i++) {
            int A = sc.nextInt();
            int sum =0;
            int [] arr = new int[A];
            for(int j=0; j<A; j++){
                int S = sc.nextInt();
                arr[j] = S;
                sum += S;
            }
            double t = sum / A;
            double count =0;
            for(int h=0; h<A; h++){
                if(arr[h]>t) count++;
            }
            System.out.printf("%.3f%%\n", count/A* 100);
        }

        }
}








