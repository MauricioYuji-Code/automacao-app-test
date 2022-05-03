package stepsDefinitions;

import core.DriverFactory;
import io.cucumber.java.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Hooks extends DriverFactory {

    @Before
    public void instaceSetup() throws MalformedURLException {
        System.out.println("Passou por aqui");
        setup();
    }

//    @AfterStep
//    public void takeScreenshot(Scenario scenario) throws IOException, AWTException {
//        SimpleDateFormat formatoDeData = new SimpleDateFormat("yyyyMMdd-HHmmss-SSS");
//        String fileName = formatoDeData.format(new Date());
//        String shotName = String.format("%s.png", fileName);
//        File finalShotFile = new File("evidencias", shotName);
//        File shotFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(shotFile, finalShotFile);
//    }

    @AfterStep
    public void takeScreenshot(Scenario scenario) {
        byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
    }

    @After
    public void finishDriver() {
//        getDriver().closeApp();
        getDriver().quit();
    }

//    @Test
//    public void testExecution() {
////        List<MobileElement> elements = getDriver().findElements(By.className("android.widget.TextView"));
////        elements.get(1).click();
//
////        MobileElement formulario = getDriver().findElement(By.xpath("//android.widget.TextView[contains(@text, 'Formulário')]"));
////        formulario.click();
//
//        getDriver().findElement(By.xpath("//android.widget.TextView[contains(@text, 'Formulário')]")).click();
//
//
//        MobileElement campoNome = getDriver().findElement(MobileBy.AccessibilityId("nome"));
//        campoNome.sendKeys("Mauricio");
//
//        String texto = campoNome.getText();
//        Assert.assertEquals("Mauricio", texto);
//    }


}
