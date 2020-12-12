package org.expensesplitter.com.Expense_Splitter.Service;

import java.util.ArrayList;
import java.util.Map;

import org.expensesplitter.com.Expense_Splitter.Model.*;
import org.springframework.stereotype.Component;

@Component
public class ExpenseManager {
	private Map<String, User> userMap;
	private Map<String, ArrayList<Split>> balanceSheet;
	
	public void addUser(User user) {
        userMap.put(user.getId(), user);
        balanceSheet.put(user.getId(), new ArrayList<Split>());
    }
	
	
	
	public Map<String, User> getUserMap() {
		return userMap;
	}



	public void setUserMap(Map<String, User> userMap) {
		this.userMap = userMap;
	}



	public Map<String, ArrayList<Split>> getBalanceSheet() {
		return balanceSheet;
	}



	public void setBalanceSheet(Map<String, ArrayList<Split>> balanceSheet) {
		this.balanceSheet = balanceSheet;
	}



	//Shows the balance due of all the users
	 public void showBalance() {
	        
		 //ajay gets back 7250 from ram, krish and kumar
		 String name;
		 
	     for (Map.Entry<String, ArrayList<Split>> userBalance : balanceSheet.entrySet()) {
	    	 name= userBalance.getKey();
	    	 System.out.println(name+" owes ");
	    	 for(Split s:userBalance.getValue()){
	    		 System.out.print("Rs. "+s.getAmount()+" to "+s.getUser().getName()+", ");
	    	 }
	    	 System.out.println();
	     }

	        
	    }
	 
	 
}
