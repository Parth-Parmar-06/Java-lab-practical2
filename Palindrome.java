import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reversedN = 0;
        int copyN = n;

        while (n!=0) {
            int remainder = n % 10;
            reversedN = reversedN * 10 + remainder;
            n = n / 10;
        }

        if (reversedN == copyN) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}