package com.example.adlibandroidjava.test

import cucumber.api.CucumberOptions;
@CucumberOptions(features = ["features"],
    plugin = [ "pretty" ],
    glue = ["com.example.adlibandroidjava.test.features.steps"],
    tags = ["@e2e", "@smoke"])
@SuppressWarnings("unused")
public class CucumberTestCase