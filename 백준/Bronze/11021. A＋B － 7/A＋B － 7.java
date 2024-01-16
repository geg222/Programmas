

import java.util.Scanner;

 class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int T = sc.nextInt();
         int A ,B ;
         int sum = 0;
         for(int i =1; i<=T; i++) {
             A = sc.nextInt();
             B = sc.nextInt();
             sum = A+B;
             System.out.print("Case #" +i + ": ");
             System.out.print(sum);
             System.out.println("");
         }


     }
 }

