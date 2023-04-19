/*
 * Class for adding and deleting appointment objects
 * 
 * @author dominic.drury@snhu.edu
 */

import java.util.UUID;
import java.util.ArrayList;
import java.util.Date;

public class AppointmentService extends Appointment {
	//unique id for adding appointments
	private String uniqueID = "0000000000";
	
	/*
	 *  Creates a random unique ID
	 */
	private String uniqueID() {
		uniqueID = UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10));
		return uniqueID;
	}
	
	/*
	 * adds new appointment to appointments list
	 */
	public void newAppointment() {
		Appointment appointment = new Appointment(uniqueID());
		appointments.add(appointment);
	} 
	
	/*
	 * adds new appointment to appointments list with a given date
	 */
	public void newAppointment(Date appointmentDate) {
		Appointment appointment = new Appointment(uniqueID(), appointmentDate);
		appointments.add(appointment);
	} 
	
	/*
	 * adds new appointment to appointments list with a given date and description
	 */
	public void newAppointment(Date appointmentDate, String description) {
		Appointment appointment = new Appointment(uniqueID(), appointmentDate, description);
		appointments.add(appointment);
	} 
	
	/*
	 * deletes appointment with given id
	 */
	public void deleteTask(String appointmentID)throws Exception {
		appointments.remove(searchTasks(appointmentID));
	}
	
	/*
	 * Search through appointment list for appointment with given id
	 * 
	 * @returns appointment
	 */
	private Appointment searchTasks(String appointmentID)throws Exception {
		for (int i = 0; i < appointments.size(); ++i) {
			if (appointmentID == appointments.get(i).getAppointmentID()) {
				return appointments.get(i);
			}
		}
		throw new Exception("Appointment does not exist");
	}
	
	/*
	 * @returns list containing current task objects stored in tasks
	 */
	public ArrayList<Appointment> getAppointmentsList(){ 
		return appointments;
	}
}
