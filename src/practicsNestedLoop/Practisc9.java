package practicsNestedLoop;

public class Practisc9 {
    public static void main(String[] args) {
        int n = 3;
       double a = 5;
       double sum = 1;
       double currentPower = 1;

       for (int i=1; i<=n; i++) {  //1-5+25-125
           currentPower *= a*(-1);
           sum += currentPower;
       }
       System.out.println(sum);
    }
}
