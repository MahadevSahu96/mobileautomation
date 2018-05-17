package WebdriverPro.web.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import WebdriverPro.web.framework.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HomePage extends BasePage {
	
	
	private By loginBy = By.cssSelector("#header-profile a.lh-layerhandler-toggle");
	private By loginButtonBy = By.id("ll-btn");
	private By menuIemsDivBy = By.cssSelector(".lh-layerhandler-menu #nav li.lh-layerhandler"); 
	private By menuItemsBy = By.cssSelector(".lh-layerhandler-menu #nav li.lh-layerhandler>a");
	private String subLinkCSS="div.lh-layerhandler-menu li a";
	private By unameId = By.id("uname");
	private By pwdId = By.id("pwd");
	
	
	public HomePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

      
    public void clickLogin(){
    	MobileElement loginBtn=waitForElementPresent(loginBy,5);
    	loginBtn.click();
    }
    
    public void logintoApp(String name,String pwd){
    	MobileElement uname=waitForElementPresent(unameId,5);
    	uname.sendKeys(name);
    	MobileElement pwdU=waitForElementPresent(pwdId,5);
    	pwdU.sendKeys(pwd);
    	clickLogin();
    	
    	
    	
    	
    	
    	
    }
   
    
   
    public void selectMenuOptions(String menuItem, String subItem){
    	List<MobileElement> itemsList = getElements(menuIemsDivBy);
    	for (MobileElement item : itemsList) {
    		System.out.println(item.getText());
    		if(item.getText().equals(menuItem)){
    			hoverOver(item);
    			List<MobileElement> links = item.findElements(By.cssSelector(subLinkCSS));

    			for (MobileElement link : links) {
    				System.out.println(link.getText());
    				if(link.getText().contains(subItem)){
    					link.click();
    					break;
    				}
    			}
    			break;
    		}
    	}
    }

    
    public void clickItem(String itemName){
    	click(By.linkText(itemName));
    }
    
   
	@Override
	public void waitForPageToLoad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyPageElements() {
		// TODO Auto-generated method stub
		
	}
    

}
