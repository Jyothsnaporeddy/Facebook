package Runners.FacebookLogin;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:CucucmberFeatures/facebookFeature.feature"},
        glue = {"Steps"})

public class facebookLogin {
}
