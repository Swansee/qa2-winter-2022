package homework1;

public class Keyboard {
    private double width;       //ширина, см
    private double height;      //высота, см
    private double length;      //длинна, си
    private int keys;           //количество кнопок
    private String color;       //цвет черный
    private boolean isBluetooth;        //тип соединения

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getKeys() {
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isBluetooth() {
        return isBluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        isBluetooth = bluetooth;
    }
}
