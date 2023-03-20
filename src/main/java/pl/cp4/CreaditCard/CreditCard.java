package pl.cp4.CreaditCard;

import java.math.BigDecimal;

public class CreditCard {
    private BigDecimal balance;
    private BigDecimal credit;

    public CreditCard(String cardNumber) {

    }

    public void assignLimit(BigDecimal creditAmount) {
        if (credit!=null){
            throw new CantReassignLimitTwice();
        }

        if (creditAmount.compareTo(BigDecimal.valueOf(100)) < 1) {
            throw new CreditBelowLimitException();
        }
        this.balance = creditAmount;
        this.credit = creditAmount;

    }

    public BigDecimal getCurrentBalance() {
        return balance;
    }

    public void withdraw(BigDecimal amount){
        this.balance = balance.subtract(amount);
    }
}