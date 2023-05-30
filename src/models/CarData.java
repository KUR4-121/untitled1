package models;
import interfaces.Basic;
import interfaces.CarInterface;

public class CarData extends BasicData implements Basic,CarInterface {
    public String car_class = "sedan";
    public Object setCar_class;
    public long[] carData;

    public String[] CarData() {
        return new String[]{
                "car_class: " + this.car_class,
                "model: " + this.getModel(),
                "year: " + this.getYear(),
        };
    }
    @Override
    public void welcome(String opt) {
        System.out.println(HELLO + opt);
    }
}
