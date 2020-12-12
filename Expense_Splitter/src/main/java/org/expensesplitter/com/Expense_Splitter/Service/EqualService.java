package org.expensesplitter.com.Expense_Splitter.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.expensesplitter.com.Expense_Splitter.Model.*;
import org.springframework.stereotype.Service;

@Service
public class EqualService {

	
	public void updateBalanceSheet(Double amount, User user, ExpenseManager expense, int n) {
		
		HashMap<String, ArrayList<Split>> sheet;
		Double amountTobeAdded= amount/n;
		for(Map.Entry<String, ArrayList<Split>> entry: expense.getBalanceSheet().entrySet()){
			ArrayList<Split> arr;
			boolean contains=false; 
			double amt;
			sheet= new HashMap<String, ArrayList<Split>>();
			if(!entry.getKey().equals(user.getId())){
				arr= entry.getValue();
				contains=false;
				amt=0.0;
				for(Split s: arr){
					if(s.getUser().getId().equals(user.getId())){
						amt= s.getAmount()+amountTobeAdded;
						contains=true;
						break;
					}
				}
				if(contains==false){
					amt= amountTobeAdded;
				}
				arr.add(new Split(user,amt));
				sheet.put(entry.getKey(),arr);
				expense.setBalanceSheet(sheet);
			}
		}
		
	}
	
}
