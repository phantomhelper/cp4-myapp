package pl.cp4.CreaditCard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;


public class CreditCardTest {

    @Test
    void itMyFirstTestRun() {
        boolean value = true;
        assertTrue(value);
    }

    @Test
    void my2ndTest() {
        boolean value = false;
    }

    @Test
    void testSchema() {
        //Arrange // Given // Input

        //Act // When // Action

        //Assert // Then // Expected // Output
    }

    @Test
    void itAllowsToAssignCreditLimit() {
        //Arrange
        CreditCard card = new CreditCard("1234-5678");
        //Act
        card.assignLimit(BigDecimal.valueOf(1000));
        //Assert // Then

        assertEquals(BigDecimal.valueOf(1000), card.getCurrentBalance());
    }

    @Test
    void itAllowsToAssignDifferentCreditLimit() {
        //Arrange
        CreditCard card1 = new CreditCard("1234-5678");
        CreditCard card2 = new CreditCard("1234-5679");
        //Act
        card1.assignLimit(BigDecimal.valueOf(1000));
        card2.assignLimit(BigDecimal.valueOf(1100));
        //Assert // Then
        assertEquals(BigDecimal.valueOf(1000), card1.getCurrentBalance());
        assertEquals(BigDecimal.valueOf(1100), card2.getCurrentBalance());
    }

    @Test
    void itDenyLimitsBelow100() {
        CreditCard card1 = new CreditCard("1234-5678");
        CreditCard card2 = new CreditCard("1234-5678");
        CreditCard card3 = new CreditCard("1234-5678");
        assertThrows(
                CreditBelowLimitException.class,
                () -> card1.assignLimit(BigDecimal.valueOf(10)));

        assertThrows(
                CreditBelowLimitException.class,
                () -> card2.assignLimit(BigDecimal.valueOf(100)));

        assertDoesNotThrow(() -> card3.assignLimit(BigDecimal.valueOf(110)));

        try {
            card1.assignLimit(BigDecimal.valueOf(10));
            fail("Should throw exception");
        } catch (CreditBelowLimitException e) {
            assertTrue(true);
        }

    }

    @Test
    void itCantAssignLimitTwice(){
        CreditCard card1 = new CreditCard("1234-5678");
        card1.assignLimit(BigDecimal.valueOf(1000));

        assertThrows(
                CantReassignLimitTwice.class,
                () -> card1.assignLimit(BigDecimal.valueOf(1100))
        );


    }

    @Test
    void itAllowsToWithdraw(){
        CreditCard card1 = new CreditCard("1234-5678");
        card1.assignLimit(BigDecimal.valueOf(1000));
        card1.withdraw(BigDecimal.valueOf(100));
        assertEquals(BigDecimal.valueOf(900), card1.getCurrentBalance());
    }
}