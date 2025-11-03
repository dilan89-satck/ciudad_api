package co.edu.umanizales.ciudad_api.model;

public class Health {

    // record
    private double numberDeaths;
    private double recovered;

    public Health(int numberDeaths, int recovered) {
        this.numberDeaths = numberDeaths;
        this.recovered = recovered;

    }
    public double getRecovered() { return this.recovered; }
    public double getNumberDeaths() { return this.numberDeaths; }


    public static Health show() {
        return new Health(5, 20);
    }

}


