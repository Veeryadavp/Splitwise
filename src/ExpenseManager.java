import java.util.List;
import java.util.ArrayList;

public class ExpenseManager
{
    private List<User> users;
    private List<Expense> expenses;

    public ExpenseManager()
    {
        users=new ArrayList<>();
        expenses=new ArrayList<>();
    }
    public void adduser(User user)
    {
        users.add(user);
    }
    public void addExpense(Expense expense)
    {
        expenses.add(expense);
        expense.splitExpense();
    }
    public List<Expense> getUserExpenses(String userID)
    {
        List<Expense> userExpenses=new ArrayList<>();
        for(Expense expense:expenses)
        {
            if (expense.getPaidBy().getUserID().equals(userID))
            {
                userExpenses.add(expense);
            }
        }
return userExpenses;
    }



}
