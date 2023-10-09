package com.company;

//herança
public class BusinnesAccount extends Account{
    private Double loanLimit;
    public BusinnesAccount(){

    }

    public BusinnesAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    public void loan(double amount){
        if(amount <= loanLimit){
            deposit(amount);
        }

    }
}
