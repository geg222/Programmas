
import java.math.BigInteger;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        long tmp = 0;
        for(int i=0; i < num.length(); i++){
            tmp = (tmp * 10 +(num.charAt(i)-'0')) % 20000303;
        }
        System.out.println(tmp);





    }
    }







