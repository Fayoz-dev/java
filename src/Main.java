import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Biror son kiriting: ");
        int n = sc.nextInt();
        int count = 0;
     for (int i=1; i<=n; i++){
         if (n % i == 0){
             count++;
         }
     }
        if (count == 2){
            System.out.println("Tub son");
        }else {
            System.out.println("Bu tub son emas,chunki bo'luvchilari :" + count +"ta");
        }
    }
}