package class12;

public class CalculatorTester {
    public static void main(String[] args) {

//we have created the object of the calculator class.
        Calculator calc = new Calculator();
        //use object variable then a . then the name of method in their class.
        calc.add();
        //used the add class from calculator class.
        // if your class is in a different package
        //must write import statement then package name then class name of the method.
        //for example import review1.Calculator
calc.subtract();
calc.multiply(10,20);//we made the parameters in calculator class




    }
}
