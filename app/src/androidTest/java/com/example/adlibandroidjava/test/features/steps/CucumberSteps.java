package com.example.adlibandroidjava.test.features.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertEquals;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;

import com.example.adlibandroidjava.R;

//import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSteps {
    @Given("^the user launches the app$")
    public void theUserLaunchesTheApp() {
        //Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        //assertEquals("com.example.adlibandroidjava", appContext.getPackageName());
    }

    @Then("^the user should see the generator screen$")
    public void theUserShouldSeeTheGeneratorScreen() {
        onView(withId(R.id.FirstFragment)).check(matches(isDisplayed()));
    }

    @When("^they tap the text \"([^\"]*)\"$")
    public void theyTapTheText(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^they should see the AdLib screen$")
    public void theyShouldSeeTheAdLibScreen() {
    }

    @And("^they enter \"([^\"]*)\" into the \"([^\"]*)\" field$")
    public void theyEnterIntoTheField(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^they should see the text \"([^\"]*)\" in the textview \"([^\"]*)\"$")
    public void theyShouldSeeTheTextInTheTextview(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
