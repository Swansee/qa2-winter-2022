package homework1;

public class Restourant {
    private double whiskey;     //сколько виски в баре в литрах
    private double cola;        //сколько колы в литрах
    private double coffee;       //сколько кофейных зерен в килограммах
    private double milk;        //сколько молока в литрах
    private int glass;          //сколько стаканов
    private String name;        //название ресторана

    public double getWhiskey() {
        return whiskey;
    }

    public void setWhiskey(double whiskey) {
        this.whiskey = whiskey;
    }

    public double getCola() {
        return cola;
    }

    public void setCola(double cola) {
        this.cola = cola;
    }

    public double getCoffee() {
        return coffee;
    }

    public void setCoffee(double coffee) {
        this.coffee = coffee;
    }

    public double getMilk() {
        return milk;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }

    public int getGlass() {
        return glass;
    }

    public void setGlass(int glass) {
        this.glass = glass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
