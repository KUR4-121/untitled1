package models;

public abstract class BasicData {
    public String model;
    public int year;
    public String getModel(){
        return this.model;
    }
    public void setName(String name) {
        this.model = model;
    }
    public String getYear() {
        return String.valueOf(this.year);
    }
    public void setAge(int year) {
        this.year = year;
    }
    public void breakLine() {
        System.out.println("========================================");
    }
}
