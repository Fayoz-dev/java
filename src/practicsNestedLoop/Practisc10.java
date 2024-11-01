package practicsNestedLoop;
public class Practisc10 {
    public static void main(String[] args) {
        int n = 3;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int faktorial = 1;
            for (int j = 1; j <= i; j++) {
                faktorial *= j;
            }
            sum += faktorial;
        }
        System.out.println(sum);
    }
}