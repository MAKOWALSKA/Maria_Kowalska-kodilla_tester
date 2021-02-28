package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    public WalletSteps() {
        //test1 - example
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });
        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });
        Then("$30 should be dispensed", () -> Assert.assertEquals(30, cashSlot.getContents()));
        Then("the balance of my wallet should be $170",
                () -> Assert.assertEquals("Incorrect wallet balance", 170, wallet.getBalance()));
        //test2 - homework 14.3
        Given("I have deposited $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
        });
        When("I don't request any withdrawal", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 0);
        });
        Then("$0 should be dispensed", () -> Assert.assertEquals(0, cashSlot.getContents()));
        Then("the balance of my wallet should be $100",
                () -> Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance()));
        //test3 - 14.3 - homework 14.3
        Given("I have deposited $1000 in my wallet", () -> {
            wallet.deposit(1000);
            Assert.assertEquals("Incorrect wallet balance", 1000, wallet.getBalance());
        });
        When("I request $1000", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 1000);
        });
        Then("$1000 should be dispensed", () -> Assert.assertEquals(1000, cashSlot.getContents()));
        Then("the balance of my wallet should be $0", () ->
                Assert.assertEquals("Incorrect wallet balance", 0, wallet.getBalance()));
        //test4 - homework 14.4
        Given("there is $100 in my wallet 2", () -> wallet.deposit(100));
        When("I check the balance of my wallet", () -> System.out.println(wallet.getBalance()));
        Then("I should see that the balance is $100", () -> {
            Assert.assertEquals(100, wallet.getBalance());
        });
        //test5 - homework 14.4
        Given("there is $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
        });
        When("I withdraw $200", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 200);
        });
        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(100, wallet.getBalance());
        });
        Then("I should be told that I don't have enough money in my wallet", () -> {
            Assert.assertEquals("You don't have enough money in your wallet", "You don't have enough money in your wallet");
        });
    }
}
