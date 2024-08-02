import java.util.Scanner;
public class Parity {
    public static void main(String[] args) {
        // take input from the user
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // check if the number is odd or even
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}