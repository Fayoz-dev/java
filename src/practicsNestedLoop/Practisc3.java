package practicsNestedLoop;

public class Practisc3 {
    public static void main(String[] args) {
        for (int j = 0; j < 10; j++) {
            System.out.print("(0," + j + ") ");
        }
        System.out.println();

        for (int i = 1; i < 9; i++) {
            for (int j = 0; j < 9; j=j+2) {
                System.out.print("("+i+","+j+")");
            }
            System.out.println();
        }

        for (int j = 0; j < 10; j++) {
            System.out.print("(9," + j + ") ");
        }
        System.out.println();
    }
}
