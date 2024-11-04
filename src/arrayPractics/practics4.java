package arrayPractics;

public class practics4 {
    public static void main(String[] args) {
     int[] numbers = {3,12,15,16,14};
     for (int i = 0; i < numbers.length; i+=2) {
         System.out.println(numbers[i]+",");
       }
     System.out.println();
        for (int i = 1; i < numbers.length; i+=2) {
            System.out.println(numbers[i]+",");
        }
        System.out.println();
    }
}
