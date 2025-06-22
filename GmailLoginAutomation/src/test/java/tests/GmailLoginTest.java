package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class GmailLoginTest {
 public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
	
		WebDriver driver = null;
		
		
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	 // Load test data
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\main\\resources\\testdata\\credentials.properties"));
        
        // Test
        driver.get("https://gmail.com");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterEmail(properties.getProperty("email"));
        loginPage.clickEmailNext();

        // Wait for password field
        Thread.sleep(3000);

        loginPage.enterPassword(properties.getProperty("password"));
        loginPage.clickPasswordNext();
        

        System.out.println("✅ Test Execution Completed");


	 
}
}
