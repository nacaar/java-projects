import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        float num1, num2, result;
        int again = 0;
        char operator;

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter first number:");
            num1 = input.nextFloat();
            System.out.println("Enter second number:");
            num2 = input.nextFloat();

            input.nextLine(); // for delete last input's buffer

            System.out.println("Enter an operator (+, -, *, /): ");
            operator = input.nextLine().charAt(0); // cant use nextChar() or nextLine()

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
            }

            System.out.println("Do you want to perform another calculation? (1 for Yes, 0 for No): ");
            again = input.nextInt();
            if (again == 1) {
                System.out.println("Restarting the calculator...");
            } else {
                System.out.println("Exiting the calculator. Goodbye!");
            }
        } while (again == 1);
    }
}