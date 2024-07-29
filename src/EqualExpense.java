public class EqualExpense extends Expense
{
 private list<User> users;
     public EqualExpense(String expenseID,User paidBy, double totalAmount, list<User> users)
     {
         super(expenseID, paidBy, amount, Expensetype.EQUAL)
         this.users=users;
     }
     
     public void splitExpense()
     {
         double AmtPerUser=math.round((getTotalAmount()/users.size()*100.0)/100.0);
         for(User user:users)
         {
             System.out.println(user.getName()+" owes "+AmtPerUser);
         }
     }
}
