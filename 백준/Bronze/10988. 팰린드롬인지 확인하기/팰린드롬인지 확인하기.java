import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String A =sc.next();
            int ans =1;
            for(int i=0; i<A.length()/2; i++){
                if(A.charAt(i)!=A.charAt(A.length()-1-i)) {
                    ans = 0;
                }
            }
            System.out.println(ans);
            }
        }












