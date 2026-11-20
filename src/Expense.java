import java.util.ArrayList;

public class Expense {

    private String payer;
    private int amountCents;
    private String description;
    private ArrayList<String> splitBetween;

    public Expense(String payer, int amountCents, String description, ArrayList<String> splitBetween) {
        this.payer = payer;
        this.amountCents = amountCents;
        this.description = description;
        this.splitBetween = splitBetween;
    }

    public String getPayer() {
        return payer;
    }

    public int getAmountCents() {
        return amountCents;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<String> getSplitBetween() {
        return splitBetween;
    }
}
