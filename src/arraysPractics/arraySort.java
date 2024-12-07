package arraysPractics;

public class arraySort {
    public static void main(String[] args) {
        int[] array = {5, 4, 9, 6, 1, 8, 7};
        // Sortlashdan oldingi array qiymati
        System.out.println("Sortlashdan oldingi array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // Sortlangandan keyingi array qiymati
        System.out.println("Sortlangandan keyingi array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}