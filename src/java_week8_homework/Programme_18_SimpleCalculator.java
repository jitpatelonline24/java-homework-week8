package java_week8_homework;
/**
 * Point
 */
public class Programme_18_SimpleCalculator {

    double firstNumber;
    double secondNumber;

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult(){
        return (this.firstNumber+this.secondNumber);
    }
    public double getSubtractionResult(){
        return (this.firstNumber-this.secondNumber);
    }
    public double getMultiplicationResult(){
        return (this.firstNumber*this.secondNumber);
    }
    public double getDivisionResult() {
        if (this.secondNumber != 0) {
            return (this.firstNumber + this.secondNumber);
        }
        return 0;
    }

    public static void main(String[] args) {
        Programme_18_SimpleCalculator calculator = new Programme_18_SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("Add= " + calculator.getAdditionResult());
        System.out.println("Subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("Multiply= " + calculator.getMultiplicationResult());
        System.out.println("Divide= " + calculator.getDivisionResult());

    }
}
