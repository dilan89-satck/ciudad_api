package co.edu.umanizales.ciudad_api.model;

public class Taxes {
    private int collection;
    private int debt;
    private String time;


    public Taxes(int Collection, int Debt , String Time){
        this.collection = Collection;
        this.debt = Debt;
        this.time = Time;
    }

    public int getCollection() {return collection;}
    public int getDebt() {return debt;}
    public String getTime() {return time;}

    public static Taxes Mostrar(){
        return new Taxes(5000, 60000, "half day");
    }

}
