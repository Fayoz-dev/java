import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 35;
        int sum = 0;
        int b;
            for ( ; n>0; n/=10){
                b = n%10;
                sum+=b;

            }
        System.out.println(sum);
       }
}