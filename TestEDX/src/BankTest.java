import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankTest {
	Bank bank;
	@Before
	public void setUp() throws Exception {
		bank = new Bank(50);
		Account account = new Account("joh", 500);
		bank.createAccount(account);
		
	}

	@Test
	public void testBank() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNumberAccounts() {
		assertEquals(1,bank.getNumberAccounts(),0);
	}

	@Test
	public void testCreateAccount() {
		fail("Not yet implemented");
	}

	@Test
	public void testDisplayAccounts() {
		
	}

}
