package arraysPractics;

public class practics32 {
    public static void main(String[] args) {
     int[] numbers = {3,12,15,16,14,13};
     for (int i = 1; i < numbers.length; i++) {
         if (numbers[i-1] > numbers[i]) {
             System.out.println(numbers[i-1]);
         }
     }
    }
}
