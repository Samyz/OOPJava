/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author Sorrawat Wisutthiwan
 */
public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1122,1000.0,"George");
        account.setAnnualInterestRate(1.5);
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);
        account.summary();
    }
}
