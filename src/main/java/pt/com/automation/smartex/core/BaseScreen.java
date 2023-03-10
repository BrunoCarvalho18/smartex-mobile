package pt.com.automation.smartex.core;

import static pt.com.automation.smartex.core.Driver.getDriver;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;

public class BaseScreen {
	
	public void hideKeyboardd() {
		getDriver().hideKeyboard();
	}
	
	public void waitForElementPresent(By by) {
		WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(by));
		
	}
	
	public void scroll(String text) {
		getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
				+ ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + text+"\").instance(0))"));
	}
	
	
	

}
