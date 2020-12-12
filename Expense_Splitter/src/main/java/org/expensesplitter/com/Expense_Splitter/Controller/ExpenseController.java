package org.expensesplitter.com.Expense_Splitter.Controller;

import org.expensesplitter.com.Expense_Splitter.Enum.Expense;
import org.expensesplitter.com.Expense_Splitter.Model.ExpenseDetails;
import org.expensesplitter.com.Expense_Splitter.Model.User;
import org.expensesplitter.com.Expense_Splitter.Service.EqualService;
import org.expensesplitter.com.Expense_Splitter.Service.ExpenseManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {
	
	@Autowired
	static ExpenseManager expenses;
	
	@Autowired
	EqualService equalservice;
	
	static{
		expenses.addUser(new User("1", "ajay"));
		expenses.addUser(new User("2", "ram"));
		expenses.addUser(new User("3", "krish"));
		expenses.addUser(new User("4", "kumar"));
	}
	
	@RequestMapping(value= "/add" , method=RequestMethod.POST)
	public void addexpenses(@RequestBody ExpenseDetails details){
		if(details.getType()==Expense.EQUAL)
			equalservice.updateBalanceSheet(details.getExpenseAmount(),details.getPaidBy(),expenses,expenses.getUserMap().size());
		
	}
	
	@RequestMapping(value= "/show" , method=RequestMethod.GET)
	public void show(){
		expenses.showBalance();
	}
}
