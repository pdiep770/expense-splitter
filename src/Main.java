import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Group g = new Group();

        ArrayList<String> dinnerSplit = new ArrayList<>();
        dinnerSplit.add("Ana");
        dinnerSplit.add("Ben");

        dinnerSplit.add("Cy");
        Expense dinner = new Expense("Ana", 6000, "dinner", dinnerSplit);

        g.addExpense(dinner);
    }
}
