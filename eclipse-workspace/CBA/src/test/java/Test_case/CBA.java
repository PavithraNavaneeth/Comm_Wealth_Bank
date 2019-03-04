package Test_case;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Core.Core;
import Web_pages.CBA_Travel_Products;

public class CBA extends Core{
	
	@Test
	public void Click_Travel_Product() 
	{
	CBA_Travel_Products TravelProduct = PageFactory.initElements(driver, CBA_Travel_Products.class);	
	TravelProduct.Go_To_Travel_Products();
	}
	
	@Test
	public void Verify_Sub_Topics()
	{
	CBA_Travel_Products SubTopics = PageFactory.initElements(driver, CBA_Travel_Products.class);	
	SubTopics.ExpectedSubTopics();
	
	}

}
