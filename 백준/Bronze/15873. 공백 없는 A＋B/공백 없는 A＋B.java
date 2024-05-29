import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A =sc.nextLine();
        if(A.charAt(1)=='0') {
            System.out.println(10 + Integer.parseInt(A.substring(2)));
        }
        else{
            System.out.println(Character.getNumericValue(A.charAt(0)) + Integer.parseInt(A.substring(1)));
        }
    }
    }
























