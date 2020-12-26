package com.app.GoogleAccount;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class GoogleAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\cdac mail data\\online class material\\ASDM\\chromedriver.exe");
		//open browser 
		WebDriver driver = new ChromeDriver();
		
		//enter the url
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		//minimize the browser window
		driver.manage().window().maximize();
		
		  driver.findElement(By.id("firstName")).sendKeys("pallavi");
	       driver.findElement(By.id("lastName")).sendKeys("Bangade");
	       driver.findElement(By.id("username")).sendKeys("pallavi01bangade");
	       driver.findElement(By.name("Passwd")).sendKeys("Xyz@12345");
	       driver.findElement(By.name("ConfirmPasswd")).sendKeys("Xyz@12345");
	       driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button")).click();  //Click on next Button.

	}

}
