package arrayPractics;

public class practics1 {
    public static void main(String[] args) {
     int[] numbers = {3,12,15,16,14};
     for (int i = 0; i < numbers.length; i++) {
         System.out.println(numbers[numbers.length - i - 1]);
     }
    }
}
