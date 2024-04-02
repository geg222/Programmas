import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int A = sc.nextInt();
         int B = sc.nextInt();
         int C = sc.nextInt();
         if(A>B && A>C && B>C) System.out.println(C +" " +B +" "+ A);
         else if(A>B && A>C && C>B) System.out.println(B +" " +C +" "+ A);
         else if(B>A && B>C && A>C) System.out.println(C +" " +A +" "+ B);
         else if(B>A && B>C && C>A) System.out.println(A +" " +C +" "+ B);
         else if(C>A && C>B && A>B) System.out.println(B +" " +A +" "+ C);
         else if(C>A && C>B && B>A) System.out.println(A +" " +B +" "+ C);
    }
}


