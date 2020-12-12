package org.expensesplitter.com.Expense_Splitter.Model;

import org.expensesplitter.com.Expense_Splitter.Enum.Expense;

public class ExpenseDetails {
	
	private String expenseName;
	private Double expenseAmount;
	private User paidBy;
	private Expense type;
	
	public ExpenseDetails(String expenseName, Double expenseAmount, User paidBy, Expense type) {
		super();
		this.expenseName = expenseName;
		this.expenseAmount = expenseAmount;
		this.paidBy = paidBy;
		this.type = type;
	}

	public String getExpenseName() {
		return expenseName;
	}

	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}

	public Double getExpenseAmount() {
		return expenseAmount;
	}

	public void setExpenseAmount(Double expenseAmount) {
		this.expenseAmount = expenseAmount;
	}

	public User getPaidBy() {
		return paidBy;
	}

	public void setPaidBy(User paidBy) {
		this.paidBy = paidBy;
	}

	public Expense getType() {
		return type;
	}

	public void setType(Expense type) {
		this.type = type;
	}
	
	
}
