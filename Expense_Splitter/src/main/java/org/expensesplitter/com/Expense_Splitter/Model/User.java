package org.expensesplitter.com.Expense_Splitter.Model;

public class User {
	private String Id;
	private String name;
	
	public User(String id, String name) {
        this.Id = id;
        this.name = name;
    }
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	 
}
