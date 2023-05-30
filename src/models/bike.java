package models;

import interfaces.BikeInterface;
import interfaces.Basic;
public class bike extends BasicData implements Basic, BikeInterface {
    private String type;
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String[] bikeData(){
        return new String[]{
                "type: " + this.getType(),
                "model: " + this.getModel(),
                "year: " + this.getYear(),
        };
    }
    @Override
    public void welcome(String opt){
        System.out.println(HELLO + opt);
    }
}
