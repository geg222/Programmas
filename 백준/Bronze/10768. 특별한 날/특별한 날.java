import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int two = 2;
    int eh = 18;

    if (N > two) System.out.println("After");
    else if (N == two && M > eh) System.out.println("After");
    else if (N == two && M == eh) System.out.println("Special");
    else if (N<two) System.out.println("Before");
    else System.out.println("Before");

    }
}


