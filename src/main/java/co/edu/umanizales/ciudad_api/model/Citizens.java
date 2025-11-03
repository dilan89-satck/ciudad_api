package co.edu.umanizales.ciudad_api.model;
// ADDED

public class Citizens {
    private int numberCitizens;
    private String mostPopulatedArea;

    public Citizens(int numberCitizens, String mostPopulatedArea) {
        this.numberCitizens = numberCitizens;
        this.mostPopulatedArea = mostPopulatedArea;

    }
    public int getNumberCitizens() { return this.numberCitizens; }
    public String getMostPopulatedArea() { return this.mostPopulatedArea; }


    public static Citizens show() {
        return new Citizens(200000, "santa ana");
    }




}

