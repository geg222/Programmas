import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc= new Scanner(System.in);
        int [] N = new int[26];
        Arrays.fill(N, -1);

        String S = sc.nextLine();

        for(int i=0; i<S.length(); i++){
            char c = S.charAt(i);

            if (N[c - 'a'] == -1) {
                N[c - 'a'] = i;
            }
        }
        for (int j : N) {
            System.out.print(j+" ");
        }


    }
    }







