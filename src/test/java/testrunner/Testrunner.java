package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Iroshan\\eclipse-workspace\\Cucumber\\src\\test\\java\\featurespkg", 
glue={"stepsdefinitionpkg"}, tags="@regression or @smoke")

public class Testrunner {

}
