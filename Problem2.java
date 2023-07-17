import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int num = input.nextInt();
        
        System.out.print("Output: ");
        for (int i = 1; i <= 2*num; i=i+2) {
            
                System.out.print(i + " ");
            
        }
    }
}
