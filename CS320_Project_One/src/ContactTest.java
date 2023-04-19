/*
 * Test Class for Contact.java
 * 
 * @author dominic.drury@snhu.edu
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest {
	//test id with approved length 
	private String contactID = "0123456789";
	//test id with to long of length
	private String contactIDToLong = "012345678910111213";
	//test first name with aproved length
	private String firstName = "Jane";
	//test first name with to long of length
	private String firstNameToLong = "This last name has to many characters in it";
	//test last name with aproved length
	private String lastName = "Doe";
	//test last name with to long of length
	private String lastNameToLong = "This last name has to many characters in it";
	//test phone number with approved length
	private String phone  = "0000000000";
	//test phone with to long of length
	private String phoneToLong  = "0000000000000000000";
	//test address number with approved length
	private String address  = "1234 madeup rd."; 
	//test address with to long of length
	private String addressToLong  = "This address is too long and is not approved";
	
	/*
	 * Tests the creation of a new contact object that is given an id, first name, last name,
	 * phone number, and address
	 */
	@Test
	void testContactConstructorOne() {
		Contact contact = new Contact(contactID, firstName, lastName, phone, address);
		assertTrue(contact.getContactID().equals(contactID));
		assertTrue(contact.getFirstName().equals(firstName));
		assertTrue(contact.getLastName().equals(lastName));
		assertTrue(contact.getPhone().equals(phone));
		assertTrue(contact.getAddress().equals(address));
	}
	
	/*
	 * Tests the creation of a new contact object that is given an id, first name, last name, and
	 * phone number
	 */
	@Test
	void testContactConstructorTwo() {
		Contact contact = new Contact(contactID, firstName, lastName, phone);
		assertTrue(contact.getContactID().equals(contactID));
		assertTrue(contact.getFirstName().equals(firstName));
		assertTrue(contact.getLastName().equals(lastName));
		assertTrue(contact.getPhone().equals(phone));
	}
	
	/*
	 * Tests the creation of a new contact object that is given an id, first name, and last name
	 */
	@Test
	void testContactConstructorThree() {
		Contact contact = new Contact(contactID, firstName, lastName);
		assertTrue(contact.getContactID().equals(contactID));
		assertTrue(contact.getFirstName().equals(firstName));
		assertTrue(contact.getLastName().equals(lastName));
	}
	
	/*
	 * Tests the creation of a new contact object that is given an id and first name
	 */
	@Test
	void testContactConstructorFour() {
		Contact contact = new Contact(contactID, firstName);
		assertTrue(contact.getContactID().equals(contactID));
		assertTrue(contact.getFirstName().equals(firstName));
	}
	
	/*
	 * Tests the creation of a new contact object that is given an id
	 */
	@Test
	void testContactConstructorFive() {
		Contact contact = new Contact(contactID);
		assertTrue(contact.getContactID().equals(contactID));
	}
	
	/*
	 * Tests the creation of a new contact object that has a null id
	 */
	@Test
	void testIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(null, firstName, lastName, phone, address);
		});
	}
	
	/*
	 * Tests the creation of a new contact object that has a null first name
	 */
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(contactID, null, lastName, phone, address);
		});
	}
	
	/*
	 * Tests the creation of a new contact object that has a null last name
	 */
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(contactID, firstName, null, phone, address);
		});
	}
	
	/*
	 * Tests the creation of a new contact object that has a null phone
	 */
	@Test
	void testPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(contactID, firstName, lastName, null, address);
		});
	}
	
	/*
	 * Tests the creation of a new contact object that has a null address
	 */
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(contactID, firstName, lastName, phone, null);
		});
	} 
	
	/*
	 * Tests the creation of a new contact object that has to long of an id
	 */
	@Test
	void testContactIDToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(contactIDToLong, firstName, lastName, phone, address);
		});
	}
	
	/*
	 * Tests the creation of a new contact object that has to long of a first name
	 */
	@Test
	void testFirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(contactID, firstNameToLong, lastName, phone, address);
		});
	}
	
	/*
	 * Tests the creation of a new contact object that has to long of a last name
	 */
	@Test
	void testLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(contactID, firstName, lastNameToLong, phone, address);
		});
	}
	
	/*
	 * Tests the creation of a new contact object that has to long of a phone number
	 */
	@Test
	void testPhoneToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(contactID, firstName, lastName, phoneToLong, address);
		});
	}
	
	/*
	 * Tests the creation of a new contact object that has to long of a address
	 */
	@Test
	void testAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(contactID, firstName, lastName, phone, addressToLong);
		});
	}
}

