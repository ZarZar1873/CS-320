import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Date;

class AppointmentTest {
	//test id with approved length
	private String appointmentID = "0123456789";
	//test id with to long of length
	private String appointmentIDToLong = "012345678910111213";
	//test approved date
	@SuppressWarnings("deprecation")
	private Date appointmentDate = new Date(9999, 0, 1);
	//test unapproved date (in the past)
	private Date appointmentDateInPast = new Date();
	//test description with approved length
	private String description  = "This is a test description.";
	//test description with to long of length
	private String descriptionToLong  = "This is a test description that is to long and exceeds 50 characters in"
			+ "length.";
	
	/*
	 * Tests the creation of a new appointment object that is given an id, date, and description
	 */
	@Test
	void testAppointmentConstructorOne() {
		Appointment appointment = new Appointment(appointmentID, appointmentDate, description);
		assertTrue(appointment.getAppointmentID().equals(appointmentID));
		assertTrue(appointment.getAppointmentDate().equals(appointmentDate));
		assertTrue(appointment.getDescription().equals(description));
	}
	
	/*
	 * Tests the creation of a new appointment object that is given an id, date, and default description
	 */
	@Test
	void testAppointmentConstructorTwo() {
		Appointment appointment = new Appointment(appointmentID, appointmentDate);
		assertTrue(appointment.getAppointmentID().equals(appointmentID));
		assertTrue(appointment.getAppointmentDate().equals(appointmentDate));
	}
	
	/*
	 * Tests the creation of a new appointment object that is given an id and default date and description
	 */
	@Test
	void testAppointmentConstructorThree() {
		Appointment appointment = new Appointment(appointmentID);
		assertTrue(appointment.getAppointmentID().equals(appointmentID));
	}
	
	/*
	 * Tests the creation of a new appointment object that has to long of an id
	 */
	@Test
	void testAppointmentIDToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment(appointmentIDToLong, appointmentDate, description);
		});
	}
	
	/*
	 * Tests the creation of a new appointment object that has an appointment date in the past
	 */
	@Test
	void testAppointmentDateInPast() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment(appointmentID, appointmentDateInPast, description);
		});
	}
	
	/*
	 * Tests the creation of a new task object that has to long of a description
	 */
	@Test
	void testDescriptionToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment(appointmentID, appointmentDate, descriptionToLong);
		});
	}
	
	/*
	 * Tests the creation of a new appointment object that has an id of null
	 */
	@Test
	void testAppointmentIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment(null, appointmentDate, description);
		});
	}
	
	/*
	 * Tests the creation of a new appointment object that has an appointment date of null
	 */
	@Test
	void testAppointmentDateNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment(appointmentID, null, description);
		});
	}
	
	/*
	 * Tests the creation of a new task object that has a description of null
	 */
	@Test
	void testDescriptionNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment(appointmentID, appointmentDate, null);
		});
	}
}
