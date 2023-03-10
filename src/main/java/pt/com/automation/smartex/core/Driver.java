package pt.com.automation.smartex.core;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class Driver {
	
    private static AndroidDriver driver;
	
	public static AndroidDriver getDriver(){
		if(driver==null) {
			createDriver();
		}
		return driver;
	}

	@SuppressWarnings("deprecation")
	private static void createDriver() {
		File diretorioAplicacao = new File("app");
		File arquivoAplicacao = new File(diretorioAplicacao, "cadastro_clientes_teste.apk");

		DesiredCapabilities capacity = new DesiredCapabilities();
		capacity.setCapability("deviceName", "emulator-5554");
		capacity.setCapability("platformName", "Android");
		capacity.setCapability("app", arquivoAplicacao.getAbsolutePath());
		capacity.setCapability("appActivity", "br.com.dudstecnologia.cadastrodeclientes.MainClientes");
		capacity.setCapability("appPackage", "br.com.dudstecnologia.cadastrodeclientes");
		capacity.setCapability("newCommandTimeout", 5600);

		try {
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capacity);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void killDriver() {
		if(driver!=null) {
			driver.quit();
			driver=null;
		}
	}

}
