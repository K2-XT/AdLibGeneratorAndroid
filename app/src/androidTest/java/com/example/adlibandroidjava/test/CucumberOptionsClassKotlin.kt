package com.example.adlibandroidjava.test

import io.cucumber.junit.CucumberOptions

@CucumberOptions(features = ["features"],
    plugin = [ "pretty" ],
    glue = ["com.example.adlibandroidjava.steps"],
    tags = ["@e2e", "@smoke"])
public class CucumberOptionsClassKotlin {

}
