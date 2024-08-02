import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        // taking user input for number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // printing the number pattern
        for (int i=0; i<n; i++) {
            // spaces
            for (int j=n-i-1; j>0; j--) {
                System.out.print("  ");
            } 
            for (int j=0; j<i+1; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}