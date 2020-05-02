
import java.math.BigDecimal;
import java.math.MathContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Divide implements BinaryOperation {

    @Override
    public BigDecimal operate(int a, int b) {
       
        return BigDecimal.valueOf(a).divide(BigDecimal.valueOf(b), new MathContext(5));
        
    }
    
}
