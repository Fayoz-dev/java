import java.util.Scanner;

public class Main {
    // 1*k+2*k+3*k+...+nk
    public static void main(String[] args) {
        int n = 3;
        int b;
        int sum = 0;
            for (int i=1; i<=n; i++){
               b = i*10+i;
               sum += b;
                System.out.println(b);
            }
            System.out.println("BU: "+n+" ta sondan hosil bo'lgan ifodaning yig'indisi: "+sum+" ga teng");
       }
}