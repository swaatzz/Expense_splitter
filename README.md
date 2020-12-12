Shares the expense among the users in the repository

There is a controller that takes the Expense details as the message body in the service , which is automatically parsed into ExpenseDetails model. The service divides the amount equally among all the users and maintains the balance sheet for the all the user which contains information how much the user owes from which user.
