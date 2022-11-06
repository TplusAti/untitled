package steps;

import com.talentlms.UI.MockDataGenerator.DataFakeGenerator;
import com.talentlms.UI.dataProvider.ConfigReader;
import com.talentlms.UI.pojo.helperMethods.FlentWaits1;
import com.talentlms.UI.pojo.helperMethods.Helper;
import com.talentlms.UI.pages.AdminHomePage;
import com.talentlms.UI.pages.LoginPage;
import com.talentlms.UI.driverFactory.Driver;
import com.talentlms.UI.pages.UserCreatePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;

public class loginSteps {


    @Given("go to login page")
    public void go_to_login_page() {
      Driver.getDriver().get(ConfigReader.getProperty("qaEnv"));
      
    }
    @Given("Enter {string} in userName or Email input field")
    public void enter_in_user_name_or_email_input_field(String userNameOrEmail) {
      loginPage.inputUserNameorEmail(userNameOrEmail);
      
    }
    @Given("Enter {string} in password input field")
    public void enter_in_password_input_field(String password) {
    loginPage.inputPassword(password);
      
    }
    @When("user click on login button")
    public void user_click_on_login_button() {
      loginPage.clickLoginButton();
      
    }
    @Then("user should successfully logged in")
    public void user_should_successfully_logged_in() {
        Assertions.assertEquals("Home",adminHomePage.adminhomeTitle.getText());
        flentWaits1.fluentwaitUntilclickable(By.xpath("(//div[@class='tl-bold-link'])[1]"));
    }

    @When("Click \"add user button")
    public void click_add_user_button() {
        adminHomePage.addUserButton.click();
      
    }
    @Then("user should see {string} title")
    public void user_should_see_title(String title) {
        Assertions.assertEquals(title,userCreatePage.AddUserTitle.getText());
    }

    @Then("in field First name white first name")
    public void in_field_first_name_white_first_name() {
        userCreatePage.FirstNameField.sendKeys(firstName);
    }
    @Then("in field Last name write last name")
    public void in_field_last_name_write_last_name() {
        userCreatePage.LastName.sendKeys(lastName);
      
    }
    @Then("in field Email address write")
    public void in_field_email_address_write() {
        userCreatePage.Emailaddress.sendKeys(email);
    }

    @Then("in field User name wrire user name")
    public void in_field_user_name_wrire_user_name() {
        userCreatePage.UserName.sendKeys(userName);
    }


    @Then("in field Password write password")
    public void in_field_password_write_password() {
        userCreatePage.Password.sendKeys(password);
      
    }
    @Then("in field Bio write short description")
    public void in_field_bio_write_short_description() {
        userCreatePage.Bio.sendKeys(bio);
      
    }
    @Then("in field Time Zone choose time zone")
    public void in_field_time_zone_choose_time_zone() {

        //userCreatePage.timeZone.click();
        System.out.println("dawda");
    }
    @When("click add user button")
    public void click_button() {
        helper.javaScriptScrollDownThePage();
       userCreatePage.AddUserButton.click();
    }

    @Then("verify user is created with correct parameteres")
    public void verify_user_is_created_with_correct_parameteres() {
      // Assertions.assertEquals(firstName.substring(0,1)+". "+
              // lastName,userTitle.getText());

    }
    LoginPage loginPage = new LoginPage();
    Helper helper = new Helper();
    AdminHomePage adminHomePage = new AdminHomePage();
    FlentWaits1 flentWaits1 = new FlentWaits1();
    UserCreatePage userCreatePage = new UserCreatePage();
    DataFakeGenerator dataFakeGenerator = new DataFakeGenerator();

        String firstName = dataFakeGenerator.addFirstName();
        String lastName = dataFakeGenerator.addLastname();
        String bio = dataFakeGenerator.addBio();
        String password = dataFakeGenerator.addPassword();
        String email = dataFakeGenerator.addEmail();
        String userName = dataFakeGenerator.addUserName();
        String xPath1 = "//span [@title='"+ firstName.substring(0,1) + ". "+ lastName +"]";

    //   public WebElement userTitle;




}
