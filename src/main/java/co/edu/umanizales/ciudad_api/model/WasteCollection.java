package co.edu.umanizales.ciudad_api.model;

public class WasteCollection {

    private String amountTrash;
    private int numberEmployees;
    private String frequency;

    public WasteCollection(String amountTrash, int numberEmployees, String frequency) {
        this.amountTrash = amountTrash;
        this.numberEmployees = numberEmployees;
        this.frequency = frequency;
    }
    public String getAmountTrash() { return this.amountTrash; }
    public String getFrequency() { return this.frequency; }
    public int getNumberEmployees() { return this.numberEmployees; }

    @Override
    public String toString() {
        return "WasteCollection{" +
                "amountTrash='" + amountTrash + '\'' +
                ", frequency='" + frequency + '\'' +
                ", numberEmployees=" + numberEmployees +
                '}';

    }}

