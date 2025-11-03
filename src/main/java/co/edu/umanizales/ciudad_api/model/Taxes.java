package co.edu.umanizales.ciudad_api.model;

public class Taxes {
    private int collection;
    private int debt;
    private String time;


    public Taxes(int collection, int debt, String time) {
        this.collection = collection;
        this.debt = debt;
        this.time = time;
    }

    public int getCollection() { return collection; }
    public int getDebt() { return debt; }
    public String getTime() { return time; }

    public static Taxes show() {
        return new Taxes(5000, 60000, "half day");
    }

}
