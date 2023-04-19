/*
 * Test Class for Task.java
 * 
 * @author dominic.drury@snhu.edu
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {
	//test id with approved length
	private String taskID = "0123456789";
	//test id with to long of length
	private String taskIDToLong = "012345678910111213";
	//test name with approved length
	private String name = "Jane Doe";
	//test name with to long of length
	private String nameToLong = "This name has to many characters in it";
	//test description with approved length 
	private String description  = "This is a test description.";
	//test description with to long of length
	private String descriptionToLong  = "This is a test description that is to long and exceeds 50 characters in"
			+ "length.";
	
	/*
	 * Tests the creation of a new task object that is given an id, name, and description
	 */
	@Test
	void testTaskConstructorOne() {
		Task task = new Task(taskID, name, description);
		assertTrue(task.getTaskID().equals(taskID));
		assertTrue(task.getName().equals(name));
		assertTrue(task.getDescription().equals(description));
	}
	
	/*
	 * Tests the creation of a new task object that is given an id and name with default description
	 */
	@Test
	void testTaskConstructorTwo() {
		Task task = new Task(taskID, name);
		assertTrue(task.getTaskID().equals(taskID));
		assertTrue(task.getName().equals(name)); 
	}
	
	/*
	 * Tests the creation of a new task object that is given an id with default name and description
	 */
	@Test
	void testTaskConstructorThree() {
		Task task = new Task(taskID);
		assertTrue(task.getTaskID().equals(taskID));
	}
	
	/*
	 * Tests the creation of a new task object that has to long of an id
	 */
	@Test
	void testTaskIDToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Task(taskIDToLong, name, description);
		});
	}
	
	/*
	 * Tests the creation of a new task object that has to long of a name
	 */
	@Test
	void testNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Task(taskID, nameToLong, description);
		});
	}
	
	/*
	 * Tests the creation of a new task object that has to long of a description
	 */
	@Test
	void testDescriptionToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Task(taskID, name, descriptionToLong);
		});
	}
	
	/*
	 * Tests the creation of a new task object that has a null id
	 */
	@Test
	void testTaskIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Task(null, name, description);
		});
	}
	
	/*
	 * Tests the creation of a new task object that has a null name
	 */
	@Test
	void testNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Task(taskID, null, description);
		});
	}
	
	/*
	 * Tests the creation of a new task object that has a null description
	 */
	@Test
	void testDescriptionNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Task(taskID, name, null);
		});
	}

}
