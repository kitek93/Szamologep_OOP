
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class SzamologepMain {

    private static BinaryOperationFactory binaryOpFact = new BinaryOperationFactory();
     private static BigDecimal ans = new BigDecimal(0);


    //Beolvasás a képernyőről
    private static String beolvasas() {

        Scanner readIn = new Scanner(System.in);
        String operation = readIn.nextLine();

        return operation;
    }

    static void kiiras(BigDecimal bg) {

        System.out.println(bg);

    }

    static BigDecimal kiszamolas(List<String> s) {

        
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).contains("ANS")){
            s.set(i, ans.toString());
            }
        }

        BinaryOperation binaryOp = binaryOpFact.getBinaryOpBySymbol(s.get(1));
        BigDecimal result = binaryOp.operate(Integer.parseInt(s.get(0)), Integer.parseInt(s.get(2)));

        ans = result;
        return result;

    }

    public static void main(String[] args) {

        String beolvasott = beolvasas();
        Lexer calculatorLexer = new CalculatorLexer();

        while (!beolvasott.contains("quit")) {
           
            BigDecimal ans = kiszamolas(calculatorLexer.lex(beolvasott));
            kiiras(ans);

            beolvasott = beolvasas();
        }

    }

}
