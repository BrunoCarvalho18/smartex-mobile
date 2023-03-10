package pt.com.automation.smartex.core;

import java.util.Locale;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

public class GenerateData {

	public GenerateData() {
		// TODO Auto-generated constructor stub
	}

	private String generateTelephone;

	public String generateTelephone() {
		FakeValuesService fakeValuesService = new FakeValuesService(new Locale("pt-BR"), new RandomService());

		generateTelephone = fakeValuesService.bothify("113#######");

		return generateTelephone;

	}

	public String generateCpf() {
		FakeValuesService fakeValuesService = new FakeValuesService(new Locale("pt-BR"), new RandomService());

		generateTelephone = fakeValuesService.bothify("1###5###9##");

		return generateTelephone;

	}

	public String generateRg() {
		FakeValuesService fakeValuesService = new FakeValuesService(new Locale("pt-BR"), new RandomService());

		generateTelephone = fakeValuesService.bothify("1###5###9");

		return generateTelephone;

	}

}
