import java.util.*;

public class  Calculator{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();

        System.out.print("Enter the type of operation (+, -, *, /): ");
        String operation = in.next();

        double result = 0.0;

        switch (operation) {
            case "+":
                result = Addition.add(a, b);
                break;
            case "-":
                result = Subtraction.subtract(a, b);
                break;
            case "*":
                result = Multiplication.multiply(a, b);
                break;
            case "/":
                result = Division.divide(a, b);
                break;
            default:
                System.out.println("Invalid operation!");
                System.exit(0);
        }

        System.out.println("Result: " + result);

       
    }





    }
