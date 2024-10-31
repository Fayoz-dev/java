public class Palindrom {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        int counter = 0;
        for (int i = a; i <= b; i++) {
            int n = i;
            int reverseNumber = 0;

            while (n != 0) {
                reverseNumber = reverseNumber * 10 + n % 10;
                n = n / 10;
            }
            if (reverseNumber == i) {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("Palindrom sonlar soni: " + counter+" ta");
    }
}
