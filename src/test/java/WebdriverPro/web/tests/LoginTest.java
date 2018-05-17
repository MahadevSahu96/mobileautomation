package WebdriverPro.web.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;


import WebdriverPro.web.framework.WebdriverTestBase;
import WebdriverPro.web.framework.utils.ExcelReader;
import WebdriverPro.web.pages.HomePage;

public class LoginTest extends WebdriverTestBase {

	Logger logger = Logger.getLogger(LoginTest.class);	
	
	@Test
	public void verifyHomePage(){
		
		logger.info("Test Method started: verifyHomePage()");
		
			
		//Test data setup.
		String uname="Mahadev";
		String pwd="pwd123";
					
		// Object initialisation.
		HomePage homePage = new HomePage(driver);
		
		// Login to app.
		homePage.logintoApp(uname,pwd);
		
		
		
		
	}
	
	
	
	}
