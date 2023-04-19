/*
 * Class for Task Objects
 * 
 * @author dominic.drury@snhu.edu
 */

import java.util.ArrayList;

public class Task {
	//required, no longer than 10 characters, shall not be null, and shall not be updatable
	protected String taskID = "0000000000";
	//required, no longer than 20 characters, shall not be null
	public String name = "NoName";
	//required, no longer than 50 characters, shall not be null
	public String description = "NoDescription";
	//max character length for task id
	public final int MAX_ID_LENGTH = 10;
	//max character length for name
	public final int MAX_NAME_LENGTH = 20;
	//max character length for description
	public final int MAX_DESCRIPTION_LENGTH = 50;
	
	public ArrayList<Task> tasks = new ArrayList<Task>();
	
	//default constructor to prevent creating empty instances.
	protected Task () {
		 
	}
	 
	/**
	 * Constructor with an identifier and default name and description
	 */
	public Task (String taskID) {
		this();
		setTaskID(taskID);
		this.name = "NoName";
		this.description = "NoDescription"; 
	}
	
	/**
	 * Constructor with an identifier and name and default description
	 */
	public Task (String taskID, String name) {
		this();
		setTaskID(taskID);
		setName(name);
		this.description = "NoDescription";
	}
	
	/**
	 * Constructor with an identifier, name and description
	 */
	public Task (String taskID, String name, String description) {
		this();
		setTaskID(taskID);
		setName(name);
		setDescription(description);
	}
	
	/*
	 * @return task ID
	 */
	public String getTaskID() {
		return taskID;
	}
	
	/*
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/*
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	
	/*
	 * Sets task id of NEW task ONLY. provided is not null and is less than 10 characters
	 */
	public void setTaskID(String taskID) {
		if (taskID == null) {
			throw new IllegalArgumentException("The task id must not be empty.");
		}
		else if (taskID.length() > MAX_ID_LENGTH) {
			throw new IllegalArgumentException("The task ID must not be longer than " + MAX_ID_LENGTH
					+ " characters.");
		}
		else {
			this.taskID = taskID;
		}
	}
	
	/*
	 * Sets name of task provided is not null and is less than 20 characters
	 */
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("The name must not be empty.");
		}
		else if (name.length() > MAX_NAME_LENGTH) {
			throw new IllegalArgumentException("The name must not be longer than " + MAX_NAME_LENGTH
					+ " characters.");
		}
		else {
			this.name = name;
		}
	}
	
	/*
	 * Sets description of task provided is not null and is less than 50 characters
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
