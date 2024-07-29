public class ExactExpense
{
private map(User, Double) userShares;
    
    public ExactExpense(String expensID, User paidBy, double totalAmount, map<User, Double userShares)
    {
    super(expenseID, paidBy, totalAmount, Expensetype.EXACT);
    this.userShares=userShares;
    }
 public void splitExpense()
 {
     double totalShares=userShares.values().stream().mapToDouble(Doule::doubleValue).sum();
     if(totalShares!=getTotalAmount)
     {
         throw new IllegalArgumentException("Total shres do not equal the total amount.");
     }
     {
         userShares.forEach((User, amount)->System.out.println(User.getUserName()+" owes "+amount));
     }
 }
}
