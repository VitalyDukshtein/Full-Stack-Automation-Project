package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.DesktopFlows;
import workflows.ElectronFlows;

@Listeners(utilities.Listeners.class)
public class CalculatorDesktop extends CommonOps {

    @Test(description = "Test01 - Verify Addition Command")
    @Description("This test verifies addition of two numbers on the desktop calculator")
    public void test01_verifyAdditionCommand(){
        DesktopFlows.calculateAddition();
        Verifications.verifyTextInElement(calcMain.field_result, "Display is 7");
    }
}
