import java.util.Map;

public class PercentExpense extends Expense
{
private Map<User, Double> userShare;
    
    public PercentExpense(String ExpenseID, User paidBy, double totalAmount, Map<User, Double> userShares)
    {
        super(ExpenseID, paidBy, totalAmount, Expensetype.PERCENT);
        this.userShare =userShares;
    }
    
    public void splitExpense()
    {
        double totalPercentage= userShare.values().stream().mapToDouble(Double::doubleValue).sum();
        if(totalPercentage!=100.0)
        {
    throw new IllegalArgumentException("Total percentage does not equal 100.");
    }
    userShare.forEach((User, percentage)->{
        double amount=Math.round((getTotalAmount()*(percentage/100.0))*100.0)/100.0;
        System.out.println(User.getUserName()+" owes "+amount);
});
        }
}
