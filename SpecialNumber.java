import java.util.Scanner;
public class SpecialNumber {
    public static void main(String[] args) {
        // taking user input for the number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n; // creating a copy of number entered by user so that it can be compared after
        
        // initializing sum and multiplication variable
        int sum = 0;
        int mul = 1;
        // iterating to find individual digits and updating the values of sum and multiplication
        while (n!=0) {
            int remainder = n%10;
            sum += remainder;
            mul *= remainder;
            n /= 10;
        }
        // print message if special number found or not
        if ((sum+mul) == num) {
            System.out.println(num + " is a special number");
        } else {
            System.out.println(num + " is not a special number");
        }
    }
}