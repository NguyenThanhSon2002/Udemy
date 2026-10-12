public class SimpleCalculator {

    //    private double firstNumber;
    //    private double secondNumber;
    //
    //    public double getAdditionResult() {
    //        return this.firstNumber + this.secondNumber;
    //    }
    //
    //    public double getSubtractionResult () {
    //        return this.firstNumber - this.secondNumber;
    //    }
    //
    //    public double getMultiplicationResult () {
    //        return this.firstNumber * this.secondNumber;
    //    }
    //
    //    public double getDivisionResult () {
    //        if (this.secondNumber == 0)
    //            return 0;
    //        return this.firstNumber / this.secondNumber;
    //    }
    //
    //    public double getFirstNumber() {
    //        return this.firstNumber;
    //    }
    //
    //    public double getSecondNumber() {
    //        return this.secondNumber;
    //    }
    //
    //    public void setFirstNumber(double firstNumber) {
    //        this.firstNumber = firstNumber;
    //    }
    //
    //    public void setSecondNumber(double secondNumber) {
    //        this.secondNumber = secondNumber;
    //    }

    private double firstNumber;     // 0.0 by default
    private double secondNumber;    // 0.0 by default

    // == getters/setters ==
    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // == public methods ==
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        // 1. check if we can divide with secondNumber
        if (secondNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;
    }

}
