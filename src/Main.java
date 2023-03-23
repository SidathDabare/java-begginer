import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("Alice", 20, true);
        students[1] = new Student("Bob", 21, true);
        students[2] = new Student("Charlie", 22, false);
        students[3] = new Student("Sidath", 32, true);

        // change the name of the second student
        students[1].setName("Bobby");
        // remove the third student
        // students[2] = null;

        for (Student student : students) {
            if (student != null) {
                System.out.println(student.getName() + ", " + student.getAge() + ", " + student.isStudent());
            }
        }

        int num[] = {12, 14, 17, 12, 100};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("SUM IS : " + sum);


// _____________SWITCH CASE OPERATION________________________

//        SwitchCase switchCaseObj = new SwitchCase();
//
//        double num1 = switchCaseObj.getFirstValue();
//        double num2 = switchCaseObj.getSecondValue();
//        String action = switchCaseObj.getOperationValue();
//
//        switchCaseObj.calculate(num1, num2, action);

// _____________IF ELSE OPERATION______________________________

//        ifElseOperation ifElseOperationObj = new ifElseOperation();
//        double number1 = ifElseOperationObj.getFirstValue();
//        double number2 = ifElseOperationObj.getSecondValue();
//        String operation = ifElseOperationObj.getOperationValue();
//
//        ifElseOperationObj.calculate(number1, number2, operation);

    }
}