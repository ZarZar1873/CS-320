/*
 * Test Class for AppointmentService.java
 * 
 * @author dominic.drury@snhu.edu
 */

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppointmentServiceTest {
	//test id with approved length
	private String appointmentID = "0123456789";
	//test approved date
	@SuppressWarnings("deprecation")
	private Date appointmentDate = new Date(9999, 0, 1);	
	//test description with approved length
	private String description  = "This is a test description.";
	
	/*
	 * Tests new appointments in list with unique id
	 */
	@Test
	void testNewAppointmentWithID() {
		AppointmentService appointment = new AppointmentService();
		appointment.newAppointment();
		Assertions.assertNotNull(appointment.getAppointmentsList().get(0).getAppointmentID());
	}
	
	/*
	 * Tests new appointments in list with unique id and date
	 */
	@Test
	void testNewAppointmentWithDate() {
		AppointmentService appointment = new AppointmentService();
		appointment.newAppointment(appointmentDate);
		Assertions.assertNotNull(appointment.getAppointmentsList().get(0).getAppointmentDate());
	}
	
	/*
	 * Tests new appointments in list with unique id, date, and description
	 */
	@Test
	void testNewAppointmentWithDescription() {
		AppointmentService appointment = new AppointmentService();
		appointment.newAppointment(appointmentDate, description);
		Assertions.assertNotNull(appointment.getAppointmentsList().get(0).getAppointmentDate());
	}
	
	/*
	 * Tests if appointment was removed from appointments list successfully
	 */
	@Test
	void testDeleteTask() throws Exception{
		AppointmentService appointment = new AppointmentService();
		appointment.newAppointment();
		assertEquals(1, appointment.getAppointmentsList().size());
		appointment.deleteTask(appointment.getAppointmentsList().get(0).getAppointmentID());
		assertEquals(0, appointment.getAppointmentsList().size());
	}
	
	/*
	 * Tests if appointment failed to be removed from appointments list successfully
	 */
	@Test
	void testDeleteTaskFailure() throws Exception{
		AppointmentService appointment = new AppointmentService();
		appointment.newAppointment();
		assertEquals(1, appointment.getAppointmentsList().size());
		assertThrows(Exception.class, () -> appointment.deleteTask(appointmentID));
		assertEquals(1, appointment.getAppointmentsList().size());
	}
	
	
}
