import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();
       for(int i=0; i<T; i++){
           
           int A = sc.nextInt();
           String B = sc.next();
           
           for(int J=0; J<B.length(); J++){
               for(int k=0; k< A; k++){
                   System.out.print(B.charAt(J));
               }
           }
           System.out.println();
       }

    }
    }



