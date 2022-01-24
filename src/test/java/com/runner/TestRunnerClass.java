package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.devtools.v95.network.model.ReportingApiReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources"},glue = {"com.stepdefinition"}, monochrome= true,
plugin= {"pretty","html:report/WebReport", "json:report/jsonreport.json", "junit:report/xmlreport.xml"},dryRun=false)

		

	


public class TestRunnerClass {
	//@AfterClass
	
//	private void afterclass() {
//		Reporting.generateJVMReport("C:\\Users\\Karthi\\eclipse-workspace\\Cucumber\\report\\jsonreport.json")
//
//	}
	
	
	
	

}
