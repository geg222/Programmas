import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int N =Integer.parseInt(bf.readLine());

        int []A = new int[N];
        for(int i=0; i<N; i++){
            A[i]=Integer.parseInt(bf.readLine());
        }
        Arrays.sort(A);
        for(int i=0; i<A.length; i++){
           sb.append(A[i]).append('\n');
        }
        System.out.println(sb);




        }

    }





