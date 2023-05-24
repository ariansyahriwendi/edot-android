package TestStep;

import BaseClass.BaseSetUp;
import BaseClass.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStep extends BaseStep {

    @Given("Account created")
    public void accountCreated() {
    }

    @Given("Application opened")
    public void applicationOpened() {
    }

    @Given("Account not logged in")
    public void accountNotLoggedIn() {
        BaseSetUp.reset();
    }

    @And("I click selanjutnya")
    public void iClickSelanjutnya() {
    }

    @And("I input password {string}")
    public void iInputPassword(String arg0) {
    }

    @And("I click masuk login")
    public void iClickMasukLogin() {
    }

    @Then("Success to login")
    public void successToLogin() {
    }
}
