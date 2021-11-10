// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class CT02AcessandoResultadoDePesquisaTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void cT02AcessandoResultadoDePesquisa() {
    driver.get("https://www.webmotors.com.br//carros/estoque?tipoveiculo=carros&estadocidade=estoque");
    driver.findElement(By.id("locationAutoComplete")).click();
    driver.findElement(By.id("locationAutoComplete")).sendKeys("Bahia");
    driver.findElement(By.cssSelector(".AutoComplete-result-name")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".title-search"));
      assert(elements.size() > 0);
    }
    driver.get("https://www.webmotors.com.br//carros/estoque?tipoveiculo=carros&estadocidade=estoque");
    {
      WebElement element = driver.findElement(By.cssSelector(".Filters__container__group:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".CardMake:nth-child(4) > .CardMake__name-make")).click();
    driver.findElement(By.cssSelector(".Filters__line--gray")).click();
    driver.findElement(By.linkText("CITY")).click();
    driver.findElement(By.cssSelector(".Filters__line--gray")).click();
    driver.findElement(By.linkText("1.5 EX 16V FLEX 4P AUTOMÁTICO")).click();
    driver.get("https://www.webmotors.com.br//carros/estoque?tipoveiculo=carros&estadocidade=estoque");
    {
      WebElement element = driver.findElement(By.cssSelector(".Filters__container__group:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".Filters__container__group:nth-child(6) .Checkbox:nth-child(2)")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".title-search"));
      assert(elements.size() > 0);
    }
  }
}
