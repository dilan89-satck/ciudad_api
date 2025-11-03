package co.edu.umanizales.ciudad_api.model;
// AGREGADO

public class Citizens {
    private int numbercitizens;
    private String mostpopulatedarea;

    public Citizens( int Numbercitizens, String Mostpopulatedarea) {
        this.numbercitizens = Numbercitizens;
        this.mostpopulatedarea= Mostpopulatedarea;

    }
    public int getNumbercitizens(){ return this.numbercitizens;}
    public String getMostpopulatedarea() { return this.mostpopulatedarea; }


    public static Citizens Mostrar(){
        return new Citizens(200000,"santa ana");
    }




}

