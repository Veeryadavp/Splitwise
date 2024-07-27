public abstract class Expense
{
private String expenseID;
private User paidBy;
private double amount;
private Expensetype type;

public Expense(String expenseID,User paidBy, double amount, Expensetype type)
{
    this.expenseID = expenseID;
    this.paidBy = paidBy;
    this.amount = amount;
    this.type = type;
}
public String getExpenseID()
{
    return expenseID;
}
public User getPaidBy()
{
    return paidBy;
}
public double getAmount()
{
    return amount;
}
public Expensetype getType()
{
    return type;
}
public void setPaidBy(User paidBy)
{
    this.paidBy=paidBy;
}
public void setAmount(double amount)
{
    this.amount=amount;
}
public void setType(Expensetype type)
{
    this.type=type;
}
public abstract void splitExpense();
}
