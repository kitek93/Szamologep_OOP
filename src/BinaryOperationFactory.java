
public class BinaryOperationFactory {

    public BinaryOperation getBinaryOpSymbol(String s) {

        if ("+".equals(s))  {
            return new Add();

        } else if ("-".equals(s)) {
            return new Subtract();

        } else if ("/".equals(s)) {
            return new Divide();

        } else if ("*".equals(s)) {
            return new Multiply();

        } else {
            throw new IllegalArgumentException("Operation " + s + " is not implemented!");
        }

    }

}
