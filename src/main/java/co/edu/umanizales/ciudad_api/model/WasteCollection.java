package co.edu.umanizales.ciudad_api.model;

public class WasteCollection {

        private String amounttrash;
        private int  numberemployees;
        private String frequency;

        public WasteCollection(String Amounttrash, int Numberemployees, String Frequency){
            this.amounttrash = Amounttrash;
            this.numberemployees = Numberemployees;
            this.frequency= Frequency;
        }
        public String getAmounttrash() { return this.amounttrash;}
        public String getFrequency() { return  this.frequency;}
        public  int getNumberemployees() { return this.numberemployees;}

    @Override
    public String   toString() {
        return "WasteCollection{" +
                "Amounttrash ='" + amounttrash + '\'' +
                ",Frequency  =" + frequency + '\'' +
                ", Number employees =" + numberemployees +
                '}';

    }}

