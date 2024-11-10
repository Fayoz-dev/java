package arraysPractics;

import java.util.Scanner;

public class arrayElementlariniKiritishChiqarish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hellomaleykum , Array uzunligini kirit: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Array: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("array[" + i + "] = " + numbers[i]);
            int a = scanner.nextInt();
            numbers[i] = a;
        }
        System.out.println("Array Elementlari: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
