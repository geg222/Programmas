import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int N = GCD(num1, num2);
        System.out.println(N);
        System.out.println(((num1*num2)/N));
    }
    public static int GCD(int n1, int n2){
        if(n1 % n2 ==0) return n2;

        return GCD(n2, n1%n2);
    }
}









