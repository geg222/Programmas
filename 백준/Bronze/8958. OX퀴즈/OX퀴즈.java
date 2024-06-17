import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N =sc.nextInt();
        String [] arr = new String[N];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.next();
        }

        for(int i=0; i<arr.length; i++){
            int c= 0;
            int s= 0;

            for(int j=0; j<arr[i].length(); j++){
                if(arr[i].charAt(j)=='O') {
                    c++;
                }
                else{
                    c=0;
                }
                s+=c;
            }
            System.out.println(s);
        }
    }
}
