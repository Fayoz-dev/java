package practicsNestedLoop;

public class Practisc6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        for (int i = a; i < b; i++) {
            int n = i;
            int reverceNever = 0;
            while (n != 0) {
                reverceNever = reverceNever*10 + n % 10;
                n = n / 10;
            }
            if (reverceNever == i){
                System.out.println(i);
            }
        }
    }
}
