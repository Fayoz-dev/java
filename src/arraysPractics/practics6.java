package arraysPractics;

public class practics6 {
    public static void main(String[] args) {
        int n = 7;
        int[] numbers = new int[n];
        int num = 1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = num;
            num+=2;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
