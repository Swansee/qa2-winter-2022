package homework1;

public class Omelette {
    private int eggs;       //сколько яиц кладем
    private int sousages;   //сколько сосисок кладем
    private double beans;   //сколько кладем фасоли в килограммах (0.10)
    private double milk;    //сколько добавляем молока в литрах (0.15)
    private int tomatoes;   //сколько добавляем помидор в штуках
    private String color;   //цвет желтый

    public int getEggs() {
        return eggs;
    }

    public void setEggs(int eggs) {
        this.eggs = eggs;
    }

    public int getSousages() {
        return sousages;
    }

    public void setSousages(int sousages) {
        this.sousages = sousages;
    }

    public double getBeans() {
        return beans;
    }

    public void setBeans(double beans) {
        this.beans = beans;
    }

    public double getMilk() {
        return milk;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }

    public int getTomatoes() {
        return tomatoes;
    }

    public void setTomatoes(int tomatoes) {
        this.tomatoes = tomatoes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
