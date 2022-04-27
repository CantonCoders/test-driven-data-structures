package org.cantoncoders.coderrelationshipmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/*

Store the first name and email address of each coder to be retrieved later.
Store the last name for each coder to be retreived later
Create a unique identified for each coder
Make sure that the email is not already used
Add capacity for 10,000,000+ coders
Be able to delete a user
Be able to undo a delete for a user
Be able to update first name.
Be able to update last name
Be able to update email
Be able to show history of the updates
Be able to operate in less than 1 ms per call
????????

 */
@SpringBootTest
class CoderrelationshipmanagementApplicationTests {


	//Store the first name and email address of each coder to be retrieved later.
	@Test
	void contextLoads() {
		assertThat(false).isFalse();
	}

	@Test
	public void test_FirstNameGetSet(){
		String firstName = "Nick";
		Coder coder = new Coder();
		coder.setFirstName(firstName);
		assertThat(coder.getFirstName()).isEqualTo(firstName);
	}

	@Test
	public void test_EmailGetSet(){
		String email = "nick@localhost";
		Coder coder = new Coder();
		coder.setEmail(email);
		assertThat(coder.getEmail()).isEqualTo(email);
	}

	@Test
	public void test_CanGetCodeByFirstName(){

		DataStore dataStore = new DataStore();
		Coder nickTheCoder = new Coder();
		nickTheCoder.setFirstName("Nick");
		assertThat(dataStore.getCoderByFirstName("Nick")).isEqualTo(nickTheCoder);
	}

}
