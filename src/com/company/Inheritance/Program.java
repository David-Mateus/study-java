package com.company.Inheritance;

public class Program {
    public static void main(String[] args){
//    Account acc = new Account(1001, "David", 0.0);
//    BusinessAccount bacc = new BusinessAccount(1002, "Mateus", 0.0, 500.0);

//Account acc1 = new SavingsAccount(1001, "David", 1000.0, 200.0);
//acc1.withDraw(200.0);
//        System.out.println(acc1.getBalance());
//
//    //UPcasting
//        Account acc1 = bacc;
//        Account acc2 = new BusinessAccount(1003, "Silva", 0.0, 200.0);
//
//        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
//        //DownCasting(Uper class para sublaclasse)
//        BusinessAccount acc4 = (BusinessAccount) acc2;
//
//        acc4.loan(100.0);

    // Polimorfismo Teste
        Account x = new Account(1001, "David", 1000.0);
        Account y = new SavingsAccount(1002, "Mateus", 1000.0, 0.01);
        x.withDraw(50.0);
        y.withDraw(50.0);
        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
