package arraysPractics;

public class practics3 {
    public static void main(String[] args) {
     int[] numbers = {3,12,15,16,14};
     for (int i = 0; i < numbers.length; i=i+2) {
             System.out.println(numbers[numbers.length-1-i]);
       }
    }
}
