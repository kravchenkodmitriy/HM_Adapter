public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(3)
                        .addOperand(5)
                        .calculate(Calculator.Operation.POW));

        Ints intsCalculate = new IntsCalculator();
        System.out.println(intsCalculate.mult(3, 10));
        System.out.println(intsCalculate.pow(4, 5));
        System.out.println(intsCalculate.sum(9, 4));
    }
}
