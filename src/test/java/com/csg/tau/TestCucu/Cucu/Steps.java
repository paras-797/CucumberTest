package com.csg.tau.TestCucu.Cucu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
public class Steps {

WebDriver driver;

@Given("^user navigates to \"([^\"]*)\"$")
public void user_navigates_to_www_google_com(String url){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Paras sharma\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	
}

}
