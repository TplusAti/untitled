package testMain;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws MalformedURLException{

        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("build", "<your build id>");
        browserOptions.setCapability("name", "<your test name>");
        browserOptions.setCapability("sauce:options", sauceOptions);

        URL url = new URL("https://oauth-tplusati-23f41:4f75ba04-1478-4765-9b07-20434b6cbf15@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);

        driver.get("https://qa.imoving.com/");
        driver.manage().window().maximize();

        Assert.assertTrue(true);

        driver.close();
        driver.quit();
    }
}
