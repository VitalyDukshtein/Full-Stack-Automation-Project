package pageObjects.myfitnesspalWeb;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {
    @FindBy(how = How.CSS, using = "h1[class='MuiTypography-root MuiTypography-Heading/Bold/LG MuiTypography-paragraph css-pfv68y']")
    public WebElement head_mainPage;

    @FindBy(how = How.LINK_TEXT, using = "Log In")
    public WebElement btn_loginWeb;
}
