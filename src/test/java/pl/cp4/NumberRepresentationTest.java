package pl.cp4;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class NumberRepresentationTest {
    @Test
    void testBigdecimalRepresentation(){
        BigDecimal a = BigDecimal.valueOf(0.02f);
        BigDecimal b = BigDecimal.valueOf(0.03f);
        BigDecimal c = a.subtract(b);
        System.out.println("BigDecimal 0.02 - 0.03");
        System.out.println(c);
    }
}
