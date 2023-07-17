import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = in.nextInt();
        in.close();

        String op = generateOddNumbers(input);
        System.out.println(op);
    }

    public static String generateOddNumbers(int n) {
        // Ensure n is an odd number
        if (n % 2 == 0) {
            n -= 1;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 2*n; i += 2) {
            result.append(i).append(" ");
        }

        return result.toString().trim();
    }
}
