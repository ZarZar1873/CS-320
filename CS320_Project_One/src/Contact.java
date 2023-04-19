

/*
 * Class for Contact Objects
 * 
 * @author dominic.drury@snhu.edu
 */
import java.util.ArrayList;

public class Contact {
	//required, no longer than 10 characters, shall not be null, and shall not be updatable.
	protected String contactID = "0";
	//required, no longer than 10 characters, and shall not be null.
	public String firstName = "NoName";
	//required, no longer than 10 characters, and shall not be null.
	public String lastName = "NoName";
	//required, exactly 10 characters, and shall not be null.
	public String phone = "0000000000";
	//required, no longer than 30 characters, and shall not be null.
	public String address = "NoAddress";
	//max character length for contact id
	public final int MAX_ID_LENGTH = 10;
	//max character length for contact first and last name
	public final int MAX_NAME_LENGTH = 10;
	//character length for contact phone number
	public final int PHONE_NUMBER_LENGTH = 10;
	//max character length for contact address 
	public final int MAX_ADDRESS_LENGTH = 30;
	
	public ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	//default constructor to prevent creating empty instances.
	protected Contact () {
		
	}
	
	/**
	 * Constructor with an identifier and default first name, last name, phone number, and address
	 */
	public Contact (String contactID) {
		this();
		setContactID(contactID); 
		this.firstName = "NoName";
		this.lastName = "NoName";
		this.phone = "0000000000";
		this.address = "NoAddress";
	}
	
	/**
	 * Constructor with an identifier and first name and default last name, phone number, and address
	 */
	public Contact (String contactID, String firstName) {
		this();
		setContactID(contactID); 
		setFirstName(firstName);
		this.lastName = "NoName";
		this.phone = "0000000000";
		this.address = "NoAddress";
	}
	
	/**
	 * Constructor with an identifier, first name, and last name and default phone number and address
	 */
	public Contact (String contactID, String firstName, String lastName) {
		this();
		setContactID(contactID); 
		setFirstName(firstName);
		setLastName(lastName);
		this.phone = "0000000000";
		this.address = "NoAddress";
	}
	
	/**
	 * Constructor with an identifier, first name, last name, and phone number and default address
	 */
	public Contact (String contactID, String firstName, String lastName, String phone) {
		this();
		setContactID(contactID); 
		setFirstName(firstName);
		setLastName(lastName);
		setPhone(phone);
		this.address = "NoAddress";
	}
	
	/**
	 * Constructor with an identifier, first name, last name, phone number, and address
	 */
	public Contact (String contactID, String firstName, String lastName, String phone, String address) {
		this();
		setContactID(contactID); 
		setFirstName(firstName);
		setLastName(lastName);
		setPhone(phone);
		setAddress(address);
	} 
	
	/*
	 * @return contact ID
	 */
	public String getContactID() {
		return contactID;
	}
	
	/*
	 * @return first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/*
	 * @return last name
	 */
	public String getLastName() {
		return lastName;
	}
	
	/*
	 * @return phone number
	 */
	public String getPhone() {
		return phone;
	}
	
	/*
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	
	/*
	 * Sets contact id of NEW contact ONLY. provided is not null and is less than 10 characters
	 */
	public void setContactID(String contactID) {
		if (contactID == null) {
			throw new IllegalArgumentException("The contact id must not be empty.");
		}
		else if (contactID.length() > MAX_ID_LENGTH) {
			throw new IllegalArgumentException("The first name must not be longer than " + MAX_ID_LENGTH
					+ " characters.");
		}
		else {
			this.contactID = contactID;
		}
	}
	
	/*
	 * Sets first name of contact provided is not null and is less than 10 characters
	 */
	public void setFirstName(String firstName) {
		if (firstName == null) {
			throw new IllegalArgumentException("The first name must not be empty.");
		}
		else if (firstName.length() > MAX_NAME_LENGTH) {
			throw new IllegalArgumentException("The first name must not be longer than " + MAX_NAME_LENGTH
					+ " characters.");
		}
		else {
			this.firstName = firstName;
		}
	}
	
	/*
	 * Sets last name of contact provided is not null and is less than 10 characters
	 */
	public void setLastName(String lastName) {
		if (lastName == null) {
			throw new IllegalArgumentException("The last name must not be empty.");
		}
		else if (lastName.length() > MAX_NAME_LENGTH) {
			throw new IllegalArgumentException("The last name must not be longer than " + MAX_NAME_LENGTH
					+ " characters.");
		}
		else {
			this.lastName = lastName;
		}
	}
	
	/*
	 * Sets phone number of contact provided is not null and is exactly 10 characters
	 */
	public void setPhone(String phone) {
		if (phone == null) {
			throw new IllegalArgumentException("The phone number must not be empty.");
		}
		else if (phone.length() > PHONE_NUMBER_LENGTH) {
			throw new IllegalArgumentException("The phone number must be exactly " + PHONE_NUMBER_LENGTH
					+ " numbers long.");
		}
		else {
			this.phone = phone;
		}
	}
	
	/*
	 * Sets address of contact provided is not null and is no more than 30 characters
	 */
	public void setAddress(String address) {
		if (address == null) {
			throw new IllegalArgumentException("The address must not be empty.");
		}
		else if (address.length() > MAX_ADDRESS_LENGTH) {
			throw new IllegalArgumentException("The address must be no more than " + MAX_ADDRESS_LENGTH
					+ " numbers long.");
		}
		else {
			this.address = address;
		}
	}
}
