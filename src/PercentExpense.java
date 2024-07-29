public class PercentExpense
{
private map<User, Double> userShares;
    
    public PercentExpense(String ExpenseID, User paidBy, double totalAmount, map<User, Double> userShares)
    {
        super(ExpenseID, paidBy, totalAmount, Expensetype.PERCENT);
        this.userShares=userShares;
    }
    
    public void splitExpense()
    {
        double totalPercentage=userShares.values().stream().mapToDouble(Double::doubleValue).sum();
        if(totalPercentage!=100.0)
    }
    throw new IllegalArgumentException("Total percentage does not equal 100.");
    }
    userShares.forEach()
}
