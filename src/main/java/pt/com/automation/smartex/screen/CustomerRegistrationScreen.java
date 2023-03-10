package pt.com.automation.smartex.screen;

import static pt.com.automation.smartex.core.Driver.getDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pt.com.automation.smartex.core.BaseScreen;

public class CustomerRegistrationScreen extends BaseScreen {
	
	public CustomerRegistrationScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
	}
	
	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editNome")
	WebElement fieldNome;
	
	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editRg")
	WebElement fieldRg;
	
	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editCpf")
	WebElement fieldCpf;
	
	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editData")
	WebElement fieldData;
	
	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editEndereco")
	WebElement fieldEndereco;
	
	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editNumero")
	WebElement fieldNumero;
	
	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editBairro")
	WebElement fieldBairro;
	
	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editCep")
	WebElement fieldCEP;
	
	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editCidade")
	WebElement fieldCidade;
	
	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/spinnerEstados")
	WebElement spinnerEstado;
	
	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editTelefone1")
	WebElement fieldTelefone1;
	
	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editTelefone2")
	WebElement fieldTelefone2;
	
	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editEmail")
	WebElement fieldEmail;
	
	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editObs")
	WebElement fieldObs;
	
	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/btnSalvar")
	WebElement buttonSalvar;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='SP']")
	WebElement textEstado;
	
	@AndroidFindBy(id = "android:id/message")
	WebElement messageSuccess;

	
	public WebElement getMessageSuccess() {
		return messageSuccess;
	}

	public void setMessageSuccess(WebElement messageSuccess) {
		this.messageSuccess = messageSuccess;
	}

	public WebElement getTextEstado() {
		return textEstado;
	}

	public void setTextEstado(WebElement textEstado) {
		this.textEstado = textEstado;
	}

	public WebElement getButtonSalvar() {
		return buttonSalvar;
	}

	public void setButtonSalvar(WebElement buttonSalvar) {
		this.buttonSalvar = buttonSalvar;
	}

	public WebElement getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(WebElement fieldNome) {
		this.fieldNome = fieldNome;
	}

	public WebElement getFieldRg() {
		return fieldRg;
	}

	public void setFieldRg(WebElement fieldRg) {
		this.fieldRg = fieldRg;
	}

	public WebElement getFieldCpf() {
		return fieldCpf;
	}

	public void setFieldCpf(WebElement fieldCpf) {
		this.fieldCpf = fieldCpf;
	}

	public WebElement getFieldData() {
		return fieldData;
	}

	public void setFieldData(WebElement fieldData) {
		this.fieldData = fieldData;
	}

	public WebElement getFieldEndereco() {
		return fieldEndereco;
	}

	public void setFieldEndereco(WebElement fieldEndereco) {
		this.fieldEndereco = fieldEndereco;
	}

	public WebElement getFieldNumero() {
		return fieldNumero;
	}

	public void setFieldNumero(WebElement fieldNumero) {
		this.fieldNumero = fieldNumero;
	}

	public WebElement getFieldBairro() {
		return fieldBairro;
	}

	public void setFieldBairro(WebElement fieldBairro) {
		this.fieldBairro = fieldBairro;
	}

	public WebElement getFieldCEP() {
		return fieldCEP;
	}

	public void setFieldCEP(WebElement fieldCEP) {
		this.fieldCEP = fieldCEP;
	}

	public WebElement getFieldCidade() {
		return fieldCidade;
	}

	public void setFieldCidade(WebElement fieldCidade) {
		this.fieldCidade = fieldCidade;
	}

	public WebElement getSpinnerEstado() {
		return spinnerEstado;
	}

	public void setSpinnerEstado(WebElement spinnerEstado) {
		this.spinnerEstado = spinnerEstado;
	}

	public WebElement getFieldTelefone1() {
		return fieldTelefone1;
	}

	public void setFieldTelefone1(WebElement fieldTelefone1) {
		this.fieldTelefone1 = fieldTelefone1;
	}

	public WebElement getFieldTelefone2() {
		return fieldTelefone2;
	}

	public void setFieldTelefone2(WebElement fieldTelefone2) {
		this.fieldTelefone2 = fieldTelefone2;
	}

	public WebElement getFieldEmail() {
		return fieldEmail;
	}

	public void setFieldEmail(WebElement fieldEmail) {
		this.fieldEmail = fieldEmail;
	}

	public WebElement getFieldObs() {
		return fieldObs;
	}

	public void setFieldObs(WebElement fieldObs) {
		this.fieldObs = fieldObs;
	}

	
}
