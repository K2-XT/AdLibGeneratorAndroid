package com.example.adlibandroidjava.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertEquals;

import android.content.Context;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import com.example.adlibandroidjava.MainActivity;
import com.example.adlibandroidjava.R;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import cucumber.api.PendingException;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

//@RunWith(AndroidJUnit4.class)
public class CucumberSteps {

    @Rule
    public ActivityTestRule<MainActivity> mActivityScenarioRule = new ActivityTestRule<>(MainActivity.class);

    @Given("^the user launches the app$")
    public void theUserLaunchesTheApp() {
        //There are two ways of doing this. One way is using the app context. The other is using the ActivityTestRule.
        //Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        //assertEquals("com.example.adlibandroidjava", appContext.getPackageName());
        //appContext.startActivity(MainActivity.class)

        //I'm not yet sure on what the pros and cons of each are, but it seems like the ActivityTestRule class will be easier to control activity life cycles with.
        mActivityScenarioRule.launchActivity(null);
    }

    @Then("^the user should see the generator screen$")
    public void theUserShouldSeeTheGeneratorScreen() {
        onView(withId(R.id.GenerateFieldsFragment)).check(matches(isDisplayed()));
    }

    @When("^they tap the text \"([^\"]*)\"$")
    public void theyTapTheText(String arg0) throws Throwable {
        onView(withText(arg0)).perform(click());
    }

    @Then("^they should see the AdLib screen$")
    public void theyShouldSeeTheAdLibScreen() {
        onView(withId(R.id.AdLibFragment)).check(matches(isDisplayed()));
    }

    @And("^they enter \"([^\"]*)\" into the \"([^\"]*)\" field$")
    public void theyEnterIntoTheField(String arg0, String arg1) throws Throwable {
        int fieldID = getId(arg1);
        onView(withId(fieldID)).perform(replaceText(arg0));
    }

    @Then("^they should see the text \"([^\"]*)\" in the textview \"([^\"]*)\"$")
    public void theyShouldSeeTheTextInTheTextview(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        onView(withId(getId(arg1))).check(matches(withText(arg0)));
    }

    //This function is needed for when we pass an id through Gherkin.
    private static int getId(String id) {
        Context targetContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        String packageName = targetContext.getPackageName();
        return targetContext.getResources().getIdentifier(id, "id", packageName);
    }
}
