import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        for(int i =0; i<N; i++) {
            for (int j = 1; j < N - i; j++) {
                System.out.print(" ");
            }
            for (int h = 0; h < i + 1; h++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


