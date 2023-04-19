/*
 * Class for adding, deleting, and updating contact objects
 * 
 * @author dominic.drury@snhu.edu
 */

import java.util.UUID;
import java.util.ArrayList;

public class ContactService extends Contact {
	//unique id for adding contacts
	private String uniqueID = "0000000000";
	
	/*
	 *  Creates a random unique ID
	 */
	private String uniqueID() {
		uniqueID = UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10));;
		return uniqueID;
	}
	 
	/*
	 * adds new contact to contacts list
	 */
	public void newContact() {
		Contact contact = new Contact(uniqueID());
		contacts.add(contact);
	}
	
	/*
	 * adds new contact to contacts list with a given first name
	 */
	public void newContact(String firstName) {
		Contact contact = new Contact(uniqueID(), firstName);
		contacts.add(contact);
	}
	
	/*
	 * adds new contact to contacts list with a given first and last name
	 */
	public void newContact(String firstName, String lastName) {
		Contact contact = new Contact(uniqueID(), firstName, lastName);
		contacts.add(contact);
	}
	
	/*
	 * adds new contact to contacts list with a given first and last name as well as a phone number
	 */
	public void newContact(String firstName, String lastName, String phone) {
		Contact contact = new Contact(uniqueID(), firstName, lastName, phone);
		contacts.add(contact);
	}
	
	/*
	 * adds new contact to contacts list with a given first and last name as well as a phone number and address
	 */
	public void newContact(String firstName, String lastName, String phone, String address) {
		Contact contact = new Contact(uniqueID(), firstName, lastName, phone, address);
		contacts.add(contact);
	}
	
	/*
	 * deletes contact with given id
	 */
	public void deleteContact(String contactID)throws Exception {
		contacts.remove(searchContacts(contactID));
	}
	
	/*
	 * updates the first name of contact with given id with given first name
	 */
	public void updateFirstName(String contactID, String firstName)throws Exception {
		searchContacts(contactID).setFirstName(firstName);
	}
	
	/*
	 * updates the last name of contact with given id with given last name
	 */
	public void updateLastName(String contactID, String lastName)throws Exception {
		searchContacts(contactID).setLastName(lastName);
	}
	
	/*
	 * updates the phone number of contact with given id with given phone number
	 */
	public void updatePhone(String contactID, String phone)throws Exception {
		searchContacts(contactID).setPhone(phone);
	}

	/*
	 * updates the address of contact with given id with given address
	 */
	public void updateAddress(String contactID, String address)throws Exception {
		searchContacts(contactID).setAddress(address);
	}
	
	/*
	 * Search through contact list for contact with given id
	 */
	private Contact searchContacts(String contactID)throws Exception {
		for (int i = 0; i < contacts.size(); ++i) {
			if (contactID == contacts.get(i).getContactID()) {
				return contacts.get(i); 
			}
		}
		throw new Exception("Contact does not exist");
	}
	
	/*
	 * @returns list containing current task objects stored in tasks
	 */
	public ArrayList<Contact> getContactsList(){ 
		return contacts;
	}
	
}
