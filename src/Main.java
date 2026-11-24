import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Group g = new Group();

        ArrayList<String> dinnerSplit = new ArrayList<>();
        dinnerSplit.add("Ana");
        dinnerSplit.add("Ben");
        dinnerSplit.add("Cy");
        Expense dinner = new Expense("Ana", 6000, "Dinner", dinnerSplit);

        g.addExpense(dinner);

        g.addPerson("Ana");
        g.addPerson("Ben");
        
        ArrayList<String> cabSplit = new ArrayList<>();
        cabSplit.add("Ben");
        cabSplit.add("Cy");
        Expense cab = new Expense("Ben", 3000, "Cab", cabSplit);

        g.addExpense(cab);

        g.printExpenses();


    }
}
