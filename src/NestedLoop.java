public class NestedLoop {
    public static void main(String[] args) {
//        int n = 5;
//        int sum=0;
//        for (int i = 1; i <= n; i++) {
//            int num=0;
//            for (int j = 1; j <= i; j++) {
//                num = num*10 + i;
//            }
//            System.out.print(num);
//            sum+=num;
//            if (i!=n){
//                System.out.print(" + ");
//            }
//        }
//        System.out.println(" = "+sum);
        int x = 2;
        int n = 7;
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            int pow = 1;
            for (int j = 1; j <= i; j++) {
                pow *= x;
            }
            System.out.print(pow);
            sum += pow;
            if (i != n){
                System.out.print(" + ");
            }
        }
        System.out.println(" = "+sum);
    }
}
