package testMain;

import com.talentlms.UI.driverFactory.Driver;
import com.talentlms.UI.pages.QAImovingMainPage;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class test1 {

QAImovingMainPage qaImovingMainPage = new QAImovingMainPage();

        @Test
        public void test1() throws InterruptedException {
            Driver.getDriver().get("https://qa.imoving.com/");
//            WebElement element = Driver.getDriver().findElement(By.id("houseTypeSelectList"));
//            DropDownHelper.selectUsingVisibleText(element,"My Apartment");
            String parentPage = Driver.getDriver().getWindowHandle();
            Driver.getDriver().switchTo().newWindow(WindowType.TAB);
            Driver.getDriver().get("https://youtu.be/w8KQmps-Sog?t=12");
            Driver.getDriver().navigate().refresh();
            Thread.sleep(1000);
            Driver.getDriver().switchTo().window(parentPage);
            qaImovingMainPage.selectingFunction(1,2,4);

    }
}
