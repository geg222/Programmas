import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        int maxNum = 0;
        int index = 0;

        int [] arr = new int[10];
        for(int i=0; i<9; i++){
            arr[i] = sc.nextInt();
        }

        for(int value : arr) {
            count++;

            if (value > maxNum) {
                maxNum = value;
                index = count;
            }
        }
        System.out.println(maxNum);
        System.out.println(index);
    }
}


