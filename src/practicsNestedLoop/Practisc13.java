package practicsNestedLoop;
public class Practisc13 {
    public static void main(String[] args) {
        int n = 3;
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double faktorial = 1;
            for (int j = 1; j <= i; j++) {
                faktorial = 1/(faktorial* j);
            }
            sum = sum+faktorial;
        }
        System.out.println(sum);
    }
}