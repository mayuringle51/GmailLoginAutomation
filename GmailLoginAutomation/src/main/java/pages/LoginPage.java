package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(id = "identifierId") 
    private WebElement emailInput;
	
	@FindBy(name="Passwd")
	private WebElement passwordInput;
	
	@FindBy(id="identifierNext")
	private WebElement nextBtn;
	
	
	public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }
	
	public void clickEmailNext() {
		nextBtn.click();
    }
	
	public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }
	
	public void clickPasswordNext() {
		nextBtn.click();
    }
	
}
