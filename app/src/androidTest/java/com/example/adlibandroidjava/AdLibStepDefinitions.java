package com.example.adlibandroidjava;

public class AdLibStepDefinitions extends GreenCoffeeSteps
{
    @Given("^the user launches the app$")
    public void iSeeAnEmptyLoginForm()
    {
        onViewWithId(R.id.login_input_username).isEmpty();
        onViewWithId(R.id.login_input_password).isEmpty();
    }

    @When("^I introduce an invalid username$")
    public void iIntroduceAnInvalidUsername()
    {
        onViewWithId(R.id.login_input_username).type("guest");
    }

    @When("^I introduce an invalid password$")
    public void iIntroduceAnInvalidPassword()
    {
        onViewWithId(R.id.login_input_password).type("1234");
    }

    @When("^I press the login button$")
    public void iPressTheLoginButton()
    {
        onViewWithId(R.id.login_button_doLogin).click();
    }

    @Then("^the user should see the generator screen$")
    public void iSeeAnErrorMessageSayingInvalidCredentials()
    {
        onViewWithText(R.string.login_credentials_error).isDisplayed();
    }
}
