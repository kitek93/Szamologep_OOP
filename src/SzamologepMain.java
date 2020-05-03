
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class SzamologepMain {

    private static BinaryOperationFactory binaryOpFact = new BinaryOperationFactory();

    //Beolvasás a képernyőről
    private static String beolvasas() {

        Scanner readIn = new Scanner(System.in);
        String operation = readIn.nextLine();

        return operation;
    }

    static void kiírás(List<String> s) {

        BinaryOperation binaryOp = binaryOpFact.getBinaryOpBySymbol(s.get(1));
        BigDecimal result = binaryOp.operate(Integer.parseInt(s.get(0)), Integer.parseInt(s.get(2)));
        System.out.println(result);

    }

    public static void main(String[] args) {

        String beolvasott = beolvasas();
        Lexer calculatorLexer = new CalculatorLexer();

        while (!beolvasott.contains("quit")) {

            kiírás(calculatorLexer.lex(beolvasott));

            beolvasott = beolvasas();
        }

    }

}
