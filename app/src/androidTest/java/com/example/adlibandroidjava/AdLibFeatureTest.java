package com.example.adlibandroidjava;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.Locale;

@RunWith(Parameterized.class)
public class AdLibFeatureTest extends GreenCoffeeTest
{
    @Rule
    public ActivityTestRule<MainActivity> activity = new ActivityTestRule<>(MainActivity.class);

    public LoginFeatureTest(ScenarioConfig scenarioConfig)
    {
        super(scenarioConfig);
    }

    @Parameterized.Parameters(name = "{0}")
    public static Iterable<ScenarioConfig> scenarios() throws IOException
    {
        return new GreenCoffeeConfig()
                .withFeatureFromAssets("features/AdLibFeature.feature")
                .takeScreenshotOnFail()
                .scenarios(
                        new Locale("en", "GB"),
                        new Locale("es", "ES")
                ); // the locales used to run the scenarios (optional)
    }

    @Test
    public void test()
    {
        start(new LoginSteps());
    }
}
