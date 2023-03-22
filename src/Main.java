public class Main {
    public static void main(String[] args) {

// _____________SWITCH CASE OPERATION________________________

        SwitchCase switchCaseObj = new SwitchCase();

        double num1 = switchCaseObj.getFirstValue();
        double num2 = switchCaseObj.getSecondValue();
        String action = switchCaseObj.getOperationValue();

        switchCaseObj.calculate(num1, num2, action);

// _____________IF ELSE OPERATION______________________________

//        ifElseOperation ifElseOperationObj = new ifElseOperation();
//        double number1 = ifElseOperationObj.getFirstValue();
//        double number2 = ifElseOperationObj.getSecondValue();
//        String operation = ifElseOperationObj.getOperationValue();
//
//        ifElseOperationObj.calculate(number1, number2, operation);

    }
}