import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int sum=0;
        for (int i = 1; i <= n; i++) {
            int num=0;
            for (int j = 1; j <= i; j++) {
                num = num*10 + i;
            }
            System.out.print(num);
            sum+=num;
            if (i!=n){
                System.out.print(" + ");
            }
        }
        System.out.println(" = "+sum);

    }
}