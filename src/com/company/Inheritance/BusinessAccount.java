package com.company.Inheritance;
//Sintaxe de herança
public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount(){

    }
    public void TestePegandoaBussis(){
        System.out.println("pego");
    }
//Como esta extendo de outra class, devemos passar os argumentos da outra class mais o argumento da class atual.
    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    //metodo
    public  void loan(double amount){
        if (amount <= loanLimit){
            balance += amount - 10.0;
        }
    }
}
