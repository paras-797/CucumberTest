package com.csg.tau.TestCucu.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features", glue="com.csg.tau.TestCucu.Cucu")
public class runner {


}
