
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class CalculatorLexer implements Lexer {

    @Override
    public List<String> lex(String expression) {

        char[] chExpression = expression.toCharArray();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < chExpression.length; i++) {

            if (isOperationSymbol(chExpression[i])) {
                result.add(expression.substring(0, i));
                result.add(expression.substring(i, i + 1));
                result.add(expression.substring(i + 1));

            }
        }
        return trimString(result);
    }

    private List<String> trimString(List<String> s) {

        for (int i = 0; i < s.size(); i++) {
            s.set(i, s.get(i).trim());

        }
        return s;
    }

    private boolean isOperationSymbol(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

}
