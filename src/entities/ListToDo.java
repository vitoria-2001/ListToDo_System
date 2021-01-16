package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import status.enums.TopicStatus;

public class ListToDo {
	private String theme;
	private Date date;
	private TopicStatus status;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public ListToDo () {
		
	}

	public ListToDo(String theme, String topics, Date date, TopicStatus status) {
		this.theme = theme;
		this.date = date;
		this.status = status;
	}



	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	

	public TopicStatus getStatus() {
		return status;
	}

	public void setStatus(TopicStatus status) {
		this.status = status;
	}
	
	
	@Override
	public String toString() {
		return "List to Do in: " + sdf.format (date) 
				+ "Theme:"  +theme;
	}
	
	
	
	
}
