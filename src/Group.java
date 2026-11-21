import java.util.ArrayList;

public class Group {
    private ArrayList<String> people;
    private ArrayList<Expense> expenses;

    public Group() {
        people = new ArrayList();
        expenses = new ArrayList();

    }

    public void addPerson(String name) {
        people.add(name);
    }

    public void addExpense(Expense e) {
        expenses.add(e);
    }

    public void printExpenses() {
        for (int i = 0; i < expenses.size(); i++) {
            Expense e = expenses.get(i);
            String dollars = String.format("%.2f", e.getAmountCents() / 100.0);
            System.out.println(e.getPayer() + " paid $" + dollars + " for " + e.getDescription() + " (split: "
                    + e.getSplitBetween() + ")");
        }
    }
}
