package Web_pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CBA_Travel_Products {
	
	WebDriver driver;
	public CBA_Travel_Products (WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(xpath="//h3[contains(text(),'Travel products')]")
	WebElement Travel_Products;
	
		
	public void Go_To_Travel_Products() 
	{
	    // First, let's click on the Travel Product link after hitting the URL
		Travel_Products.click();
		
		
		// Get the Actual and Expected titles in String variables
		String ActualTravelOverseasTitle = driver.getTitle();
		String ExpectedTravelOverseasTitle ="Travel - CommBank";
		
		  
		/*
         * compare the actual title of the page with the expected one and print
         * the result as "Navigated to appropriate page" or "Failed"
         */
		if (ActualTravelOverseasTitle.contentEquals(ExpectedTravelOverseasTitle)){
	            System.out.println("Navigated to Travelling Overseas page successfully");
	        } else {
	            System.out.println("Test Failed");
	        }
	}
	
	public void ExpectedSubTopics() 
	{
		
		/*
         * Below code will verify that the expected Sub topic links are appearing in the Travel Overseas page
         * Or it will print a validation message that the particular Sub-topic link is not found
         * To verify a negative scenario, change the xpath values, e.g. Change 'Travel products' --> 'Travells Products'
         * The following validation message will appear "Travel products link is not found!" 
         */
		List<WebElement> Travel_products = driver.findElements(By.xpath("//a[contains(text(),'Travel products')]"));
		Assert.assertTrue(Travel_products.size() > 0, "Travel Products link is not found!");
		
		List<WebElement> Travel_checklist = driver.findElements(By.xpath("//a[contains(text(),'Travel checklist')]"));
		Assert.assertTrue(Travel_checklist.size() > 0, "Travel checklist link is not found!");
		
		List<WebElement> In_an_emergency = driver.findElements(By.xpath("//a[contains(text(),'In an emergency')]"));
		Assert.assertTrue(In_an_emergency.size() > 0, "In an emergencys link is not found!");

		List<WebElement> Tools_support = driver.findElements(By.xpath("//a[contains(text(),'Tools & support')]"));
		Assert.assertTrue(Tools_support.size() > 0, "Tools & supports link is not found!");
		
		List<WebElement> FX_Calculator = driver.findElements(By.xpath("//a[contains(text(),'Try our FX calculator')]"));
		Assert.assertTrue(FX_Calculator.size() > 0, "Try our FX calculator link is  not found!");
		
		List<WebElement> Travel_Money_Card = driver.findElements(By.xpath("//a[contains(text(),'Travel Money Card')]"));
		Assert.assertTrue(Travel_Money_Card.size() > 0, "Travel Money Card link is not found!");
		
		List<WebElement> Foreign_Cash = driver.findElements(By.xpath("//a[contains(text(),'Foreign Cash')]"));
		Assert.assertTrue(Foreign_Cash.size() > 0, "Foreign Cash link is not found!");

		List<WebElement> Travel_insurance = driver.findElements(By.xpath("//a[contains(text(),'Travel insurance')]"));
		Assert.assertTrue(Travel_insurance.size() > 0, "Travel insurance link is not found!");
	
	}
}
