package pt.com.automation.smartex.functionalities;

import pt.com.automation.smartex.screen.CustomerRegistrationScreen;

public class CustomerRegistrationFunctionalities {
	
	private CustomerRegistrationScreen customerRegistrationScreen;
	
	public CustomerRegistrationFunctionalities() {
		customerRegistrationScreen = new CustomerRegistrationScreen();
	}
	
	public void writeFieldNome(String name) {
		customerRegistrationScreen.getFieldNome().sendKeys(name);
	}
	
	public void writeFieldRg(String rg) {
		customerRegistrationScreen.getFieldRg().sendKeys(rg);
	}
	
	public void writeFieldCpf(String cpf) {
		customerRegistrationScreen.getFieldCpf().sendKeys(cpf);
	}
	
	public void writeDatadeNascimento(String data) {
		customerRegistrationScreen.getFieldData().sendKeys(data);
	}
	
	public void writeEndereco(String endereco) {
		customerRegistrationScreen.getFieldEndereco().sendKeys(endereco);
	}
	
	public void writeNumero(String numero) {
		customerRegistrationScreen.getFieldNumero().sendKeys(numero);
	}
	
	public void writeBairro(String bairro) {
		customerRegistrationScreen.getFieldBairro().sendKeys(bairro);
	}
	
	public void writeCep(String cep) {
		customerRegistrationScreen.getFieldCEP().sendKeys(cep);
	}
	
	public void writeCidade(String cidade) {
		customerRegistrationScreen.getFieldCidade().sendKeys(cidade);
	}
	
	public void clickEstado() {
		customerRegistrationScreen.getSpinnerEstado().click();
	}
	
	public void Scroll() {
		customerRegistrationScreen.scroll("SP");
	}
	
	public void clickTextEstado() {
		customerRegistrationScreen.getTextEstado().click();
	}
	
	public void writeTelefone1(String telefone1) {
		customerRegistrationScreen.getFieldTelefone1().sendKeys(telefone1);
	}
	
	public void writeTelefone2(String telefone2) {
		customerRegistrationScreen.getFieldTelefone2().sendKeys(telefone2);
	}
	
	public void writeEmail(String email) {
		customerRegistrationScreen.getFieldEmail().sendKeys(email);
	}
	
	public void writeObservacoes(String observacoes) {
		customerRegistrationScreen.getFieldObs().sendKeys(observacoes);
	}
	
	public void clickButtonSalvar() {
		customerRegistrationScreen.getButtonSalvar().click();
	}
	
	public String messageCadastrocomSucesso() {
		return customerRegistrationScreen.getMessageSuccess().getText();
	}

}
