import java.util.Scanner;
public class SwitchCase {
    Scanner scanner = new Scanner(System.in);

    public double getFirstValue() {
        System.out.println("ENTER OPERATION TYPE -> sum / sub / mul / div ");
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


        switch (operation) {
            case "sum":
                System.out.printf("%f + %f = %f", firstNum, secondNum, firstNum + secondNum);
                break;
            case "sub":
                System.out.printf("%f - %f = %f", firstNum, secondNum, firstNum - secondNum);
                break;
            case "mul":
                System.out.printf("%f * %f = %f", firstNum, secondNum, firstNum * secondNum);
                break;
            case "div":
                System.out.printf("%f / %f = %f", firstNum, secondNum, firstNum / secondNum);
                break;
            default:
                System.out.printf("Please provide operation type you need!");
        }
    }
}
