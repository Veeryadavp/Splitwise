import java.util.List;

public class EqualExpense extends Expense
{
 private List<User> users;
     public EqualExpense(String expenseID,User paidBy, double totalAmount, List<User> users)
     {
         super(expenseID, paidBy, totalAmount, Expensetype.EQUAL);
         this.users=users;
     }
     
     public void splitExpense()
     {
         double AmtPerUser=Math.round((getTotalAmount()/users.size()*100.0)/100.0);
         for(User user:users)
         {
             System.out.println(user.getUserName()+" owes "+AmtPerUser);
         }
     }
}
