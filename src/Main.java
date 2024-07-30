import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
     ExpenseManager EM=new ExpenseManager();

     User u1=new User("1", "Raghu", "raghu@gmail.com", "0123456789");
     User u2=new User("2", "Veer", "veer@gmail.com", "0789456123");
     User u3=new User("3", "prajwal", "prajwal@gmail.com", "0987654321");
     User u4=new User("4", "sonal","sonal@gmail.com", "0147258369");

     EM.adduser(u1);
     EM.adduser(u2);
     EM.adduser(u3);
     EM.adduser(u4);

     Expense equalExpense=new EqualExpense("e1", u1, 400.0, Arrays.asList(u1,u2,u3));
     EM.addExpense(equalExpense);

        Map<User, Double> exactShares=new HashMap<User, Double>();
        exactShares.put(u1, 100.0);
        exactShares.put(u2, 100.0);
        exactShares.put(u3, 100.0);
        exactShares.put(u4, 100.0);
        Expense exactExp=new ExactExpense("e2", u1, 400.0, exactShares);
        EM.addExpense(exactExp);

        Map<User, Double> percentShares=new HashMap<>();
        percentShares.put(u2, 30.0);
        percentShares.put(u3, 40.0);
        percentShares.put(u4, 20.0);
        Expense percentExp=new PercentExpense("e3", u3, 600, percentShares);
        EM.addExpense(percentExp);

    }
}