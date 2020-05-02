
import java.math.BigDecimal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Subtract implements BinaryOperation {

    @Override
    public BigDecimal operate(int a, int b) {

       return BigDecimal.valueOf(a).subtract(BigDecimal.valueOf(b));
    }
    
}
