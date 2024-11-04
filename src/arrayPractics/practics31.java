package arrayPractics;

public class practics31 {
    public static void main(String[] args) {
        int[] array = {7, 4, 2, 7, 1, 4, 7, 2, 4, 7};
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }

        System.out.println("Eng ko'p takrorlangan element soni: " + maxCount);
    }
}
