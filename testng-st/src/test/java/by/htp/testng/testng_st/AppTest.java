package by.htp.testng.testng_st;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AppTest {
	
	private static final String DRIVER_FIREFOX = "webdriver.gecko.driver";
	private static final String  DRIVER_FIREFOX_RATH = "C:\\driver\\geckodriver.exe";
	
	
	private WebDriver driver;
	
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
		System.setProperty(DRIVER_FIREFOX, DRIVER_FIREFOX_RATH);
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
/*
	@Test
	public void test1() {	
	
		 driver.get("http://www.google.by");
		 WebElement element = driver.findElement(By.name("q"));
	     element.sendKeys("java");
	     element.submit();
	     
	     try {
			Thread.sleep(10000);
		} catch (Exception e) {			
			e.printStackTrace();
		}
	     
	     System.out.println("Page title is: " + driver.getTitle());	
	     assertEquals(driver.getTitle(), "java - Поиск в Google");
	}
	
	@Test
	public void test2() {
		
		driver.get("http://www.tut.by");
		WebElement element = driver.findElement(By.cssSelector("span.header._title")); 
		System.out.println("News title: " + element.getText());
		element.click();
		WebElement paragraf = driver.findElement(By.cssSelector("div#article_body p"));
		System.out.println("Paragraf: " + paragraf.Size());	
				
	}
	
	
	@Test
	public void test3() {		
		
		driver.get("https://www.it-academy.by/");
		
		
		
		
		ArrayList<WebElement> list = new ArrayList<WebElement>();
		list.add(driver.findElement(By.cssSelector("li.panel-section-list__item a")));
			for( WebElement element : list) { 
		System.out.println("News title: " + element.getText());
		}
	
		
				
	}
	*/
	@Test
	public void task6() {
		
		driver.get("http://www.quizful.net/");
		WebElement quizful = driver.findElement(By.cssSelector("a[href='/LoginAction.loginForm']"));
		quizful.click();
		WebElement login = driver.findElement(By.name("loginForm.login")); 
		login.sendKeys("segheim");
		WebElement password = driver.findElement(By.name("loginForm.password"));
		password.sendKeys("108755");
		WebElement buttom = driver.findElement(By.name("ok"));
		buttom.click();
		WebElement profil = driver.findElement(By.cssSelector("ul#user-panel a:first-child"));
		profil.click();
		WebElement react = driver.findElement(By.cssSelector("a.btn.btn-default.btn-xs"));
		react.click();
		WebElement ld = driver.findElement(By.cssSelector("div#profile-personal-form div.title"));
		ld.click();
				 
		WebElement name = driver.findElement(By.name("personalForm.name"));
		name.sendKeys("Eugeni");
		WebElement surname = driver.findElement(By.name("personalForm.surname"));
		surname.clear();
		surname.sendKeys("Savitsky");
		WebElement bd = driver.findElement(By.name("personalForm.birthyear"));
		bd.clear();
		bd.sendKeys("1986");
		WebElement country = driver.findElement(By.name("personalForm.countryId"));
		Select selectCountry = new Select(country);
		selectCountry.selectByVisibleText("Беларусь");
		WebElement city = driver.findElement(By.name("personalForm.cityId"));
		Select selectCity = new Select(city);
		selectCity.selectByVisibleText("Минск");
		WebElement aboutMySelf = driver.findElement(By.name("personalForm.about"));
		aboutMySelf.sendKeys("Wazzzup!");
		
		WebElement notice = driver.findElement(By.cssSelector("div#profile-notifications-form div.title"));
		notice.click();
		WebElement noticeOFF = driver.findElement(By.name("notificationsForm.notificationsEnabled"));
		noticeOFF.click();
		WebElement dispatchOFF = driver.findElement(By.name("notificationsForm.deliveryEnabled"));
		dispatchOFF.click();
		
		WebElement secret = driver.findElement(By.cssSelector("div#profile-privacy-form div.title"));
		secret.click();
		WebElement only = driver.findElement(By.name("privacyForm.profileVisibility"));
		only.click();
		
			
		
	
	}
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
		
		driver.close();
		driver = null;
	}
	
	@AfterMethod	
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}
	
	
}
    