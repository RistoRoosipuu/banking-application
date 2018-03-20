package online.application.banking.domain;

import java.math.BigDecimal;
import java.util.List;

public class SavingsAccount {

    private Long id;
    private int accountNumber;
    private BigDecimal accountBalance;

    private List<SavingsTransactions> savingsTransactionsList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<SavingsTransactions> getSavingsTransactionsList() {
        return savingsTransactionsList;
    }

    public void setSavingsTransactionsList(List<SavingsTransactions> savingsTransactionsList) {
        this.savingsTransactionsList = savingsTransactionsList;
    }
}
