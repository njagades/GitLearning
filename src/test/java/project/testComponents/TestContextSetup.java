package project.testComponents;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import project.pageobjects.PageObjectManager;
import project.pageobjects.QAClickJetLandingPage;

public class TestContextSetup {

	public  WebDriver driver;
    public BaseTest test;
    public PageObjectManager pageObjectManager;
  
	public TestContextSetup() throws IOException
	{
		test=new BaseTest();
		driver = test.WebDriverManager();
		pageObjectManager=new PageObjectManager(driver);
	
	}
}
