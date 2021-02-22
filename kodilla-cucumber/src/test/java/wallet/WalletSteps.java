package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });
        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });
        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });
        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance", 170,  wallet.getBalance());
        });

        Given("I have deposited $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
        });
        When("I don't request any withdrawal", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 0);
        });
        Then("$0 should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });
        Then("the balance of my wallet should be $100", () -> {
            Assert.assertEquals("Incorrect wallet balance", 100,  wallet.getBalance());
        });

        Given("I have deposited $1000 in my wallet", () -> {
            wallet.deposit(1000);
            Assert.assertEquals("Incorrect wallet balance", 1000, wallet.getBalance());
        });
        When("I request $1000", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 1000);
        });
        Then("$1000 should be dispensed", () -> {
            Assert.assertEquals(1000, cashSlot.getContents());
        });
        Then("the balance of my wallet should be $0", () -> {
            Assert.assertEquals("Incorrect wallet balance", 0,  wallet.getBalance());
        });
    }
}