package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

	@Before("@NetBanking")
	public void netBankingSetup() {
		System.out.println("&&&&&&&&&&&&&&&&&&&");
		System.out.println("Set up the enteries in NetBanking Datase");
	}

	@After
	public void tearDown() {
		System.out.println("CLear the entries");
		System.out.println("+++++++++++++++++");
	}

	@Before("@Mortgage")
	public void mortgageSetup() {
		System.out.println("-------------------");
		System.out.println("Set up the enteries in mortgage Datase");
	}
}
