import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] A = new int[31];

        for(int i =1; i<29; i++){
           int N =sc.nextInt();
           A[N] = 1;
        }
        for(int i =1; i<A.length; i++){
            if(A[i] != 1)
                System.out.println(i);
        }


    }
}




