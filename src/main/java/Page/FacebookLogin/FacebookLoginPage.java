package Page.FacebookLogin;


import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Scope;

@Getter
@Scope("test")


public class FacebookLoginPage {
    @FindBy(xpath = "//input[@id='email']")
     WebElement username;

    @FindBy(xpath = "//input[@id='pass']")
    WebElement passWord;


}
