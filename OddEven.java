import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println("Enter a value");
        Scanner value = new Scanner(System.in);
        int p = value.nextInt();
        if (p % 2 == 0) {
            System.out.printf("even");
        } else {
            System.out.printf("odd");
        }
    }
}
