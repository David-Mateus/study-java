package com.company.Inheritance;

public final class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public  void UpdateBalance(){
        balance += balance * interestRate;
    }
    @Override
    public boolean withDraw(double amount){
        balance -= amount;
        return false;
    }

}
