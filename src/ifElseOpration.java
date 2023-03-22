import java.util.Scanner;
public class ifElseOpration {
    Scanner scanner = new Scanner(System.in);

    public double getFirstValue() {
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();
        return number1;
    }

    public double getSecondValue() {
        System.out.print("Enter the first number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();
        return number2;
    }

    public String getOperationValue() {
        System.out.print("Enter the first number: ");
        String oparation = scanner.nextLine();
        return oparation;
    }

    public void calculate(double firstNum, double secondNum, String operation) {
        if (operation.equals("sum")) {
            System.out.printf("%f + %f = %f", firstNum, secondNum, firstNum + secondNum);
        } else if (operation.equals("sub")) {
            System.out.printf("%f - %f = %f", firstNum, secondNum, firstNum - secondNum);
        } else if (operation.equals("")) {
            System.out.printf("Please provide operation type you need!");
        }
    }
}
