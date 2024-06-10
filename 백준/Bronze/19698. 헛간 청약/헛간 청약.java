import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int w=s.nextInt();
        int h=s.nextInt();
        int l=s.nextInt();
        w/=l;
        h/=l;
        int sum=w*h;
        if(n>=sum) System.out.print(sum);
        else System.out.print(n);
    }
} 