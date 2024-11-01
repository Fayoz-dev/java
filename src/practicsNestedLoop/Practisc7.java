package practicsNestedLoop;

public class Practisc7 {
    public static void main(String[] args) {
        int a=2;
        int b=10;
        int c=3;
        int sum = 0;
        for (int i=a;i<=b;i++){
            int pow = 1;
            for (int j=1;j<=c;j++ ){
                pow*=i;
            }
            sum+=pow;
        }
        System.out.println(sum);
    }
}
