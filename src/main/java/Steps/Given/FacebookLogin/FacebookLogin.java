package Steps.Given.FacebookLogin;

import Action.FacebookLogin.FacebookLoginAction;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class FacebookLogin {
    @Autowired
    private FacebookLoginAction facebookLoginAction1;

    FacebookLoginAction facebookLoginAction = new FacebookLoginAction();
    @Given("User in facebook login home page")
    public void userInFacebookLoginHomePage() {
        facebookLoginAction.login();

    }
}
