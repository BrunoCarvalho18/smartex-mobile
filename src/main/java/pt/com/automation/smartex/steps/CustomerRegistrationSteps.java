package pt.com.automation.smartex.steps;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.Assert;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pt.com.automation.smartex.core.GenerateData;
import pt.com.automation.smartex.functionalities.CustomerRegistrationFunctionalities;
import pt.com.automation.smartex.functionalities.HomeFunctionalities;

public class CustomerRegistrationSteps {

	HomeFunctionalities home = new HomeFunctionalities();
	GenerateData generateData = new GenerateData();
	CustomerRegistrationFunctionalities customerRegistration = new CustomerRegistrationFunctionalities();
	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDateTime myDateObj = LocalDateTime.now();
	String formattedDate = myDateObj.format(myFormatObj);
	Faker faker = new Faker();
	String name = faker.name().firstName();

	@Given("I am on the home of the app")
	public void i_am_on_the_home_of_the_app() {
		home.clickOnElementAllow();
		home.clickOnElementPlus();
		home.clickButtonCadastroNovo();
	}

	@When("I fill all the fields")
	public void i_fill_all_the_fields() {

		customerRegistration.writeFieldNome(name);
		customerRegistration.writeFieldRg(generateData.generateRg());
		customerRegistration.writeFieldCpf(generateData.generateCpf());
		customerRegistration.writeDatadeNascimento(formattedDate);
		customerRegistration.writeEndereco(faker.address().streetName());
		customerRegistration.writeNumero(faker.address().buildingNumber());
		customerRegistration.writeBairro("Das dores");
		customerRegistration.writeCep(faker.address().zipCode());
		customerRegistration.writeCidade(faker.address().city());
		customerRegistration.clickEstado();
		customerRegistration.Scroll();
		customerRegistration.clickTextEstado();
		customerRegistration.writeTelefone1(generateData.generateTelephone());
		customerRegistration.writeTelefone2(generateData.generateTelephone());
		customerRegistration.writeEmail(faker.internet().emailAddress());
		customerRegistration.writeObservacoes("Obs teste");	
		customerRegistration.clickButtonSalvar();

	}

	@Then("The customer was registered successfully")
	public void the_customer_was_registered_successfully() {
        Assert.assertEquals(customerRegistration.messageCadastrocomSucesso(),"Cadastro efetuado com sucesso");
	}

}
