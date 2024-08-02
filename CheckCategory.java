import java.util.Scanner;
public class CheckCategory {
    public static void main(String[] args) {
        // take input from the user
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        // check the category 
        if (ch >= '0' && ch <= '9') {
            System.out.println("Number");
        } else if (ch >= 'a' && ch<='z') {
            System.out.println("Lowercase Alphabet");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase Alphabet");
        } else {
            System.out.println("Special Character");
        }
    }
}