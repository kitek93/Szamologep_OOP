
import java.util.List;


/**
 * Szétszed egy kifejezést és visszaadja a részeit
 *
 */
public interface Lexer {

    List<String> lex(String expression);
    
}
