package pt.com.automation.smartex.functionalities;

import pt.com.automation.smartex.screen.HomeScreen;

public class HomeFunctionalities {
	
	private HomeScreen homeScreen;
	
	public HomeFunctionalities() {
		homeScreen = new HomeScreen();
	}
	
	public void clickOnElementAllow() {
		homeScreen.getFieldAllow().click();
	}
	
	public void clickOnElementPlus() {
		homeScreen.getFieldPlus().click();
	}
	
	public void clickButtonCadastroNovo() {
		homeScreen.getButtonCadastroNovo().click();
	}

}
