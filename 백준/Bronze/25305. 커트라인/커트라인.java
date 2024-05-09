import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int k =sc.nextInt();
        int [] N1 = new int[N];
        int [] N2=  new int[k];
        for(int i=0; i<N; i++){
            N1[i] = sc.nextInt();
        }
        Arrays.sort(N1);

        for(int i=0; i<k; i++){
            N2[i] = N1[N-(i+1)];
        }
        System.out.println(N2[k-1]);
        }
        }











