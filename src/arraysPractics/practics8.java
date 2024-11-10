package arraysPractics;

public class practics8 {
    public static void main(String[] args) {
        int n = 5;
        int[] numbers = new int[n];
        int num = 2;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = num;
            num+=3;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
