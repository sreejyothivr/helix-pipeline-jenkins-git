package Pipelinescript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


import io.percy.selenium.Percy;



public class Example {
	
	@Test
	public void getstring_prefix60()
	{
		
		 ChromeOptions chromeOptions =new ChromeOptions();
		    chromeOptions.addArguments("--remote-allow-origins=*");
		    WebDriver driver =new ChromeDriver(chromeOptions);
		  
		    driver.get("https://www.saucedemo.com/");
		   
	  }
	
	@Test
	public void getUrl_prefix61()
	{
		
		 ChromeOptions chromeOptions =new ChromeOptions();
		    chromeOptions.addArguments("--remote-allow-origins=*");
		    WebDriver driver =new ChromeDriver(chromeOptions);
		   
		    driver.get("https://www.tesla.com/");
		    System.out.println(driver.getCurrentUrl());
		    
	  }
	
}
