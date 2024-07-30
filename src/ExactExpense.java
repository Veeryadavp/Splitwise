import java.util.Map;

public class ExactExpense extends Expense
{
private Map(User, Double) userShares;
    
    public ExactExpense(String expenseID, User paidBy, double totalAmount, Map<User, Double> userShares)
    {
    super(expenseID, paidBy, totalAmount, Expensetype.EXACT);
    this.userShares=userShares;
    }
 public void splitExpense()
 {
     double totalShares=userShares.values().stream().mapToDouble(Double::doubleValue).sum();
     if(totalShares!=getTotalAmount)
     {
         throw new IllegalArgumentException("Total shares do not equal the total amount.");
     }
     {
         userShares.forEach((User, amount)->System.out.println(User.getUserName() +" owes "+ amount));
     }
 }
}
