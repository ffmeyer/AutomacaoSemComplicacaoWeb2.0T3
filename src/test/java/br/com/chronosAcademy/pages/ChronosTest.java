package br.com.chronosAcademy.pages;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import br.com.chronosAcademy.core.Driver;


public class ChronosTest {
	
	WebDriver driver;
	Driver driverWeb;
	
	@Before
	public void setUp() {
		//driver = ConfigureSelenium.setWebBrowser(ConfigureSelenium.BROWSER_HEADLESS_CHROME);
		driverWeb = new Driver("chrome");
		driver = driverWeb.getDriver();
		driver.get("https://www.chronosacademy.com.br");
	}

	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void primeiroTeste() {
		
		String xpath = "(//h4[starts-with(@class,elementor-size-default)])[1]";
		String expectedMessage = "Porque Tempo É Conhecimento";
		String txtTitulo = driver.findElement(By.xpath(xpath)).getText();
		assertEquals("Mensagem de erro diferente", expectedMessage, txtTitulo);
	}
	
	
}
