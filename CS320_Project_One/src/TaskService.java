/*
 * Class for adding, deleting, and updating task objects
 * 
 * @author dominic.drury@snhu.edu
 */

import java.util.UUID;
import java.util.ArrayList;

public class TaskService extends Task {
	//unique id for adding tasks
	private String uniqueID = "0000000000";
		 
	/*
	 *  Creates a random unique ID
	 */
	private String uniqueID() {
		uniqueID = UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10));
		return uniqueID;
	}
	
	/*
	 * adds new task to tasks list
	 */
	public void newTask() {
		Task task = new Task(uniqueID());
		tasks.add(task);
	} 
	
	/*
	 * adds new task to tasks list with given name
	 */
	public void newTask(String name) {
		Task task = new Task(uniqueID(), name);
		tasks.add(task);
	}
	
	/*
	 * adds new task to tasks list with given name and description
	 */
	public void newTask(String name, String description) {
		Task task = new Task(uniqueID(), name, description);
		tasks.add(task);
	}
	
	/*
	 * deletes task with given id
	 */
	public void deleteTask(String taskID)throws Exception {
		tasks.remove(searchTasks(taskID));
	}
	
	/*
	 * updates the name of task with given id with given name
	 */
	public void updateName(String taskID, String name)throws Exception {
		searchTasks(taskID).setName(name);
	}
	
	/*
	 * updates the description of task with given id with given description
	 */
	public void updateDescription(String taskID, String description)throws Exception {
		searchTasks(taskID).setDescription(description);
	}
	
	/*
	 * Search through task list for task with given id
	 * 
	 * @returns task
	 */
	private Task searchTasks(String taskID)throws Exception {
		for (int i = 0; i < tasks.size(); ++i) {
			if (taskID == tasks.get(i).getTaskID()) {
				return tasks.get(i);
			}
		}
		throw new Exception("Task does not exist");
	}
	
	/*
	 * @returns list containing current task objects stored in tasks
	 */
	public ArrayList<Task> getTasksList(){ 
		return tasks;
	}
}
