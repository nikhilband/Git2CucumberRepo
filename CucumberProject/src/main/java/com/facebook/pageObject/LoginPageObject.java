package com.facebook.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageObject {
	
	WebDriver driver;
	
	public void openURL() {
		
		System.setProperty("webdriver.chrome.driver", "H:\\Testing-MAterial\\CHROME-Driver\\Chrome-driver-111.0.5563.64\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	}
	public void enterUsername(){
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abd@gmail.com");
		
	}

	public void enterPassword(){
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123345");
		
	}
	
	public void clickLoginButton(){
		driver.findElement(By.xpath("//*[@name='login']")).click();
		
	}

	//public void enterUsername(String userName,String passWord){
		//driver.findElement(By.xpath(userName)).sendKeys(passWord);
		
	//}
	
	public void verifyLogin(){
		System.out.println("Logged in Successfully");
		
	}
	
}
