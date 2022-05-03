package core;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class CommonsBaseView extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getDriver(), 15);

    public MobileElement validarElementoApareceu(By by) {
        return (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void fillTextElementMobileBy(MobileBy input, String text) {
        getDriver().findElement(input).sendKeys(text);
    }

    public void clickElement(By by) {
        getDriver().findElement(by).click();
    }

    public void validateTrueConditionByText(String expectedText, By result) {
        String var = getDriver().findElement(result).getText();
        assertEquals(expectedText, var);
    }

    public void swipToElement() {
        TouchAction swipe = new TouchAction(getDriver()).press(PointOption.point(341, 362)).moveTo(PointOption.point(339, 233)).release().perform();
    }

    public void rolar(double inicio, double fim) {
        Dimension size = getDriver().manage().window().getSize();

        int x = size.getWidth() / 2;

        int sy = (int) (size.height * inicio);
        int ey = (int) (size.height * fim);

        new TouchAction(getDriver())
                .press(PointOption.point(x, sy))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(x, ey))
                .release()
                .perform();
    }

}
