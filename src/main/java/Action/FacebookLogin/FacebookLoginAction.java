package Action.FacebookLogin;


import Page.FacebookLogin.FacebookLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class FacebookLoginAction {

    @Autowired
    private FacebookLoginPage facebookLoginPage;

    public WebDriver driver;



    String getUrl = "https://www.facebook.com/";
    
    public void login(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(getUrl);
//        WebElement email = (WebElement) driver.findElements((By) facebookLoginPage.getUsername());
//        email.sendKeys("jyothsnareddyp");
//        WebElement password = driver.findElement((By) facebookLoginPage.getPassWord());
//        password.sendKeys("Mu_Reddy_09");




    }
}
