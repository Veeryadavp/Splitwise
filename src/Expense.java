public abstract class Expense
{
private String expenseID;
private User paidBy;
private double totalAmount;
private Expensetype type;

public Expense(String expenseID,User paidBy, double totalAmount, Expensetype type)
{
    this.expenseID = expenseID;
    this.paidBy = paidBy;
    this.totalAmount = totalAmount;
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
public double getTotalAmount()
{
    return totalAmount;
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
    this.totalAmount=amount;
}
public void setType(Expensetype type)
{
    this.type=type;
}
public abstract void splitExpense();
}
