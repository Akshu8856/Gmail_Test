package Gmail_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src//test//resources//Feature"},glue = {"Gmail_Step_Defination"},
tags = "@Login",monochrome=true)

public class runner
{
	
	
}
