




import java.util.Scanner;

 class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int K1 = sc.nextInt();
        int K2 = sc.nextInt();
        int K3 = sc.nextInt();

        if(K1+K2+K3 != 180){
            System.out.println("Error");
        }
        else if(K1 ==K2 && K1==K3 && K2== K3){
            System.out.println("Equilateral"); 
        }
        else if(K1==K2 || K1 ==K3 || K2 == K3){
            System.out.println("Isosceles");
        }
        else if(K1 != K2 || K1 !=K3 || K2 != K3){
            System.out.println("Scalene");
        }
       
     }
 }

