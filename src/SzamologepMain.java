
import java.util.List;
import java.util.Scanner;

public class SzamologepMain {

    private static BinaryOperationFactory binaryOpFact = new BinaryOperationFactory();

    //Beolvasás a képernyőről
    private static String beolvasas() {

        Scanner readIn = new Scanner(System.in);
        String operation = readIn.nextLine();
        readIn.close();

        return operation;
    }

    static void kiírás(List<String> s) {

        System.out.println(binaryOpFact.getBinaryOpSymbol(s.get(1)).operate(Integer.parseInt(s.get(0)), Integer.parseInt(s.get(2))));

    }

    public static void main(String[] args) {

        //Létrehozzuk a beolvasott string szétválogató Lexerét
        Lexer calculatorLexer = new CalculatorLexer();
        kiírás(calculatorLexer.lex(beolvasas()));

    }

}
