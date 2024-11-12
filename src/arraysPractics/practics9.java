package arraysPractics;

public class practics9 {
    public static void main(String[] args) {
        int n = 7;

        int[] numbers = new int[n];
        if (n > 0) numbers[0] = 0;
        if (n > 1) numbers[1] = 1;

        for (int i = 2; i < n; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }

        for (int i=0; i< numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
