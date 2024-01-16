




import java.util.Scanner;

 class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int A = sc.nextInt();
         int B = sc.nextInt();
         int C = sc.nextInt();
         int sum = 0;
         if (A == B && A == C & B == C) {
             sum = 10000 + A * 1000;
         } else if (A == B || A == C || B == C) {
             if (A == B) {
                 sum = 1000 + A * 100;
             } else if (A == C) {
                 sum = 1000 + A * 100;
             } else if (B == C) {
                 sum = 1000 + B * 100;
             }
         } else {
             if (A > B && A > C) {
                 sum = A * 100;
             }
             if (B > A && B > C) {
                 sum = B * 100;
             }
             if (C > A && C > B) {
                 sum = C * 100;
             }
         }
         System.out.println(sum);
     }

 }
