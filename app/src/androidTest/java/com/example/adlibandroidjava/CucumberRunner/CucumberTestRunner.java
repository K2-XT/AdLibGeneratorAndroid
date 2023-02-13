package com.example.adlibandroidjava.CucumberRunner;

import android.os.Bundle;

import com.example.adlibandroidjava.BuildConfig;
import io.cucumber.android.runner.CucumberAndroidJUnitRunner;
import io.cucumber.junit.CucumberOptions;

public class CucumberTestRunner extends CucumberAndroidJUnitRunner {

    private static final String CUCUMBER_TAGS_KEY = "tags";
    private static final String CUCUMBER_SCENARIO_KEY = "name";

    @Override
    public void onCreate(final Bundle bundle) {

        final String tags = BuildConfig.TEST_TAGS;
        String scenario = BuildConfig.TEST_SCENARIO;

        if (!tags.isEmpty()) {
            bundle.putString(CUCUMBER_TAGS_KEY, tags.replaceAll("\\s", ""));
        }
        if (!scenario.isEmpty()) {
            scenario = scenario.replaceAll(" ", "\\\\s");
            bundle.putString(CUCUMBER_SCENARIO_KEY, scenario);
        }
        super.onCreate(bundle);
    }

}

//public class CucumberTestRunner extends AndroidJUnitRunner {
//    private static final String CUCUMBER_TAGS_KEY = "tags";
//    private static final String CUCUMBER_SCENARIO_KEY = "name";
//    private final CucumberInstrumentationCore instrumentationCore = new CucumberInstrumentationCore(this);
//    @Override
//    public void onCreate(final Bundle bundle) {
//        String tags = BuildConfig.TEST_TAGS;
//        if (!tags.isEmpty()) {
//            bundle.putString(CUCUMBER_TAGS_KEY, tags.replaceAll("\\s", ""));
//        }
//        String scenario = BuildConfig.TEST_SCENARIO;
//        if (!scenario.isEmpty()) {
//            scenario = scenario.replaceAll(" ", "\\\\s");
//            bundle.putString(CUCUMBER_SCENARIO_KEY, scenario);
//        }
//        instrumentationCore.create(bundle);
//        super.onCreate(bundle);
//    }
//    @Override
//    public void onStart() {
//        waitForIdleSync();
//        instrumentationCore.start();
//    }
//}
