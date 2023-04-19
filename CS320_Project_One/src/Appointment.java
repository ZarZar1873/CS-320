/*
 * Class for Appointment Objects
 * 
 * @author dominic.drury@snhu.edu
 */

import java.util.ArrayList;
import java.util.Date;

public class Appointment {
	//required, no longer than 10 characters, shall not be null, and shall not be updatable
	protected String appointmentID = "0000000000";
	//required, cannot be in the past, and shall not be null
	public Date appointmentDate;
	//required, no longer than 50 characters, shall not be null
	public String description = "NoDescription";
	//max character length for appointment id
	public final int MAX_ID_LENGTH = 10;
	//max character length for description
	public final int MAX_DESCRIPTION_LENGTH = 50;
	
	public ArrayList<Appointment> appointments = new ArrayList<Appointment>();
	
	//default constructor to prevent creating empty instances.
	protected Appointment () {
			 
	}
	
	/**
	 * Constructor with an identifier and default date and description
	 */
	public Appointment (String appointmentID) {
		this();
		setAppointmentID(appointmentID);
		this.appointmentDate = new Date();
		this.description = "NoDescription"; 
	}
	
	/**
	 * Constructor with an identifier and date and default description
	 */
	public Appointment (String appointmentID, Date appointmentDate) {
		this();
		setAppointmentID(appointmentID);
		setAppointmentDate(appointmentDate);
		this.description = "NoDescription"; 
	}
	
	/**
	 * Constructor with an identifier date and description
	 */
	public Appointment (String appointmentID, Date appointmentDate, String description) {
		this();
		setAppointmentID(appointmentID);
		setAppointmentDate(appointmentDate);
		setDescription(description); 
	}
	
	/*
	 * @return appointment ID
	 */
	public String getAppointmentID() {
		return appointmentID;
	}
	
	/*
	 * @return appointment date
	 */
	public Date getAppointmentDate() {
		return appointmentDate;
	} 
	
	/*
	 * @return appointment date
	 */
	public String getDescription() {
		return description;
	}
	
	/*
	 * Sets task id of NEW task ONLY. provided is not null and is less than 10 characters
	 */
	public void setAppointmentID(String appointmentID) {
		if (appointmentID == null) {
			throw new IllegalArgumentException("The appointment id must not be empty.");
		}
		else if (appointmentID.length() > MAX_ID_LENGTH) {
			throw new IllegalArgumentException("The appointment ID must not be longer than " + MAX_ID_LENGTH
					+ " characters.");
		}
		else {
			this.appointmentID = appointmentID;
		}
	}
	
	/*
	 * Sets the appointment date, provided it is not null and not in the past
	 */
	public void setAppointmentDate(Date appointmentDate) {
		if (appointmentDate == null) {
			throw new IllegalArgumentException("The date must not be empty.");
		}
		else if (appointmentDate.before(new Date())) {
			throw new IllegalArgumentException("Date cannot be in the past");
		}
		else {
			this.appointmentDate = appointmentDate;
		}
	}
	
	/*
	 * Sets description of appointment provided is not null and is less than 50 characters
	 */
	public void setDescription(String description) {
		if (description == null) {
			throw new IllegalArgumentException("The description must not be empty.");
		}
		else if (description.length() > MAX_DESCRIPTION_LENGTH) {
			throw new IllegalArgumentException("The description must be no longer than " + MAX_DESCRIPTION_LENGTH
					+ " numbers long.");
		}
		else {
			this.description = description;
		}
	}
		
}
