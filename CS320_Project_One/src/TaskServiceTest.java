/*
 * Test Class for TaskService.java
 * 
 * @author dominic.drury@snhu.edu
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskServiceTest {
	//test id with approved length
	private String taskID = "9876543210";
	//test name with approved length
	private String name = "John Smith";
	//test description with approved length 
	private String description  = "This is a unique test description.";
	
	/*
	 * Tests new tasks in list with unique id
	 */
	@Test
	void testNewTaskWithID() {
		TaskService task = new TaskService();
		task.newTask();
		Assertions.assertNotNull(task.getTasksList().get(0).getTaskID());
	}
	 
	/*
	 * Tests new tasks in list with unique id and name
	 */
	@Test
	void testNewTaskWithName() {
		TaskService task = new TaskService();
		task.newTask(name);
		Assertions.assertNotNull(task.getTasksList().get(0).getName());
	}
	
	/*
	 * Tests new tasks in list with unique id, name, and description
	 */
	@Test
	void testNewTaskWithDescription() {
		TaskService task = new TaskService();
		task.newTask(name, description);
		Assertions.assertNotNull(task.getTasksList().get(0).getDescription());
	}
	
	/*
	 * Tests if task was removed from tasks list successfully
	 */
	@Test
	void testDeleteTask() throws Exception{
		TaskService task = new TaskService();
		task.newTask();
		assertEquals(1, task.getTasksList().size());
		task.deleteTask(task.getTasksList().get(0).getTaskID());
		assertEquals(0, task.getTasksList().size());
	}
	
	/*
	 * Tests if task failed to be removed from tasks list successfully
	 */
	@Test
	void testDeleteTaskFailure() throws Exception{
		TaskService task = new TaskService();
		task.newTask();
		assertEquals(1, task.getTasksList().size());
		assertThrows(Exception.class, () -> task.deleteTask(taskID));
		assertEquals(1, task.getTasksList().size());
	}
	
	/*
	 * Tests if task name was updated succesfully
	 */
	@Test
	void testUpdateName() throws Exception{
		TaskService task = new TaskService();
		task.newTask();
		task.updateName(task.getTasksList().get(0).getTaskID(), name);
		assertEquals(name, task.getTasksList().get(0).getName());
	}
	
	/*
	 * Tests if task description was updated succesfully
	 */
	@Test
	void testUpdateDescription() throws Exception{
		TaskService task = new TaskService();
		task.newTask();
		task.updateDescription(task.getTasksList().get(0).getTaskID(), description);
		assertEquals(description, task.getTasksList().get(0).getDescription());
	}
} 
