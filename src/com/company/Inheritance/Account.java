package com.company.Inheritance;

public abstract  class Account {
    //Obs: usa-se Integer, porque aceita valor nulo
    private Integer number;
    private String holder;
    protected Double balance;

    //Construtor padrao
    public Account(){
    }
    //Construtor com argumentos
    public Account(Integer number, String holder, Double balance){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }
//Getter e Setter
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    //Metodos
    public boolean withDraw(double amount){
        this.balance -= amount + 5;
        return false;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
}
