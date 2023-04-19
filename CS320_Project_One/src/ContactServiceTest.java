/*
 * Test Class for ContactService.java
 * 
 * @author dominic.drury@snhu.edu
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
	//test id with approved length
	private String contactID = "0123456789";
	//test first name with aproved length
	private String firstName = "Jane";
	//test last name with aproved length
	private String lastName = "Doe";
	//test phone number with approved length
	private String phone  = "0000000000";
	//test address number with approved length
	private String address  = "1234 madeup rd.";
	 
	/*
	 * Tests new contacts in list with unique id
	 */
	@Test
	void testNewContactWithID() {
		ContactService contact = new ContactService();
		contact.newContact();
		Assertions.assertNotNull(contact.getContactsList().get(0).getContactID());
	}
	
	/*
	 * Tests new contacts in list with unique id and first name
	 */
	@Test
	void testNewContactWithFirstName() {
		ContactService contact = new ContactService();
		contact.newContact(firstName);
		Assertions.assertNotNull(contact.getContactsList().get(0).getFirstName());
	}
	
	/*
	 * Tests new contacts in list with unique id, first name, and last name
	 */
	@Test
	void testNewContactWithLastName() {
		ContactService contact = new ContactService();
		contact.newContact(firstName, lastName);
		Assertions.assertNotNull(contact.getContactsList().get(0).getLastName());
	}
	
	/*
	 * Tests new contacts in list with unique id, first name, last name, and phone number
	 */
	@Test
	void testNewContactWithPhoneNumber() {
		ContactService contact = new ContactService();
		contact.newContact(firstName, lastName, phone);
		Assertions.assertNotNull(contact.getContactsList().get(0).getPhone());
	}
	 
	/*
	 * Tests new contacts in list with unique id, first name, last name, phone number, and address
	 */
	@Test
	void testNewContactWithAddress() {
		ContactService contact = new ContactService();
		contact.newContact(firstName, lastName, phone, address);
		Assertions.assertNotNull(contact.getContactsList().get(0).getAddress());
	}
	
	/*
	 * Tests if contact was removed from contacts list succesfully
	 */
	@Test
	void testDeleteTask() throws Exception{
		ContactService contact = new ContactService();
		contact.newContact();
		assertEquals(1, contact.getContactsList().size());
		contact.deleteContact(contact.getContactsList().get(0).getContactID());
		assertEquals(0, contact.getContactsList().size());
	} 
	
	/*
	 * Tests if contact failed to be removed from contacts list succesfully
	 */
	@Test
	void testDeleteTaskFailure() throws Exception{
		ContactService contact = new ContactService();
		contact.newContact();
		assertEquals(1, contact.getContactsList().size());
		assertThrows(Exception.class, () -> contact.deleteContact(contactID));
		assertEquals(1, contact.getContactsList().size());
	}
	
	/*
	 * Tests if contact first name was updated succesfully
	 */
	@Test
	void testUpdateFirstName() throws Exception{
		ContactService contact = new ContactService();
		contact.newContact();
		contact.updateFirstName(contact.getContactsList().get(0).getContactID(), firstName);
		assertEquals(firstName, contact.getContactsList().get(0).getFirstName());
	}
	
	/*
	 * Tests if contact last name was updated succesfully
	 */
	@Test
	void testUpdateLastName() throws Exception{
		ContactService contact = new ContactService();
		contact.newContact();
		contact.updateLastName(contact.getContactsList().get(0).getContactID(), lastName);
		assertEquals(lastName, contact.getContactsList().get(0).getLastName());
	}
	
	/*
	 * Tests if contact phone number was updated succesfully
	 */
	@Test
	void testUpdatePhone() throws Exception{
		ContactService contact = new ContactService();
		contact.newContact();
		contact.updatePhone(contact.getContactsList().get(0).getContactID(), phone);
		assertEquals(phone, contact.getContactsList().get(0).getPhone());
	}
	
	/*
	 * Tests if contact address was updated succesfully
	 */
	@Test
	void testUpdateAddress() throws Exception{
		ContactService contact = new ContactService();
		contact.newContact();
		contact.updateAddress(contact.getContactsList().get(0).getContactID(), address);
		assertEquals(address, contact.getContactsList().get(0).getAddress());
	}
}

