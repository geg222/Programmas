import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Buger = 2001;
        int Drink = 2001;

        for(int i=0; i<3; i++){
            int N = sc.nextInt();
            if (N < Buger) Buger = N;
        }
        for(int i=0; i<2; i++){
            int N = sc.nextInt();
            if (N < Drink) Drink = N;
        }

        int d = Buger + Drink -50;
        
        System.out.println(d);
        }
    }


