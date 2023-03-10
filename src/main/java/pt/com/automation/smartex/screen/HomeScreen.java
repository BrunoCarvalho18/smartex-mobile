package pt.com.automation.smartex.screen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pt.com.automation.smartex.core.BaseScreen;
import static pt.com.automation.smartex.core.Driver.getDriver;

public class HomeScreen extends BaseScreen {
	
	public HomeScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
	}
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	WebElement fieldAllow;
	
	@AndroidFindBy(className = "android.widget.ImageButton")
	WebElement fieldPlus;
	
	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/floating_novo")
	WebElement buttonCadastroNovo;
	
	public WebElement getFieldPlus() {
		return fieldPlus;
	}

	public void setFieldPlus(WebElement fieldPlus) {
		this.fieldPlus = fieldPlus;
	}

	public WebElement getFieldAllow() {
		return fieldAllow;
	}

	public void setFieldAllow(WebElement fieldAllow) {
		this.fieldAllow = fieldAllow;
	}	
	
	public WebElement getButtonCadastroNovo() {
		return buttonCadastroNovo;
	}

	public void setButtonCadastroNovo(WebElement buttonCadastroNovo) {
		this.buttonCadastroNovo = buttonCadastroNovo;
	}

}
