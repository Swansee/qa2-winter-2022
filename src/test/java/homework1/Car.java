package homework1;

public class Car {
    private String manufacturer;    //Mercedes-Benz Group
    private String bodyStyle;       //5-door liftback
    private int modelYear;  	    //2022–present (тут у меня вопрос) - постараюсь не забыть спросить на лекции
    private String autoClass;	    //Full-size luxury car (F)
    private int powerOutputHp;      //288 hp
    private int batteryKwt;         //108 kWh
    private int electricRange;      //785 km
    private int wheelbase;          //3210 mm
    private int length;             //5216 mm
    private int width;	            //1926 mm
    private int height;	            //1512 mm
    private int weight;             //2480 kg

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getAutoClass() {
        return autoClass;
    }

    public void setAutoClass(String autoClass) {
        this.autoClass = autoClass;
    }

    public int getPowerOutputHp() {
        return powerOutputHp;
    }

    public void setPowerOutputHp(int powerOutputHp) {
        this.powerOutputHp = powerOutputHp;
    }

    public int getBatteryKwt() {
        return batteryKwt;
    }

    public void setBatteryKwt(int batteryKwt) {
        this.batteryKwt = batteryKwt;
    }

    public int getElectricRange() {
        return electricRange;
    }

    public void setElectricRange(int electricRange) {
        this.electricRange = electricRange;
    }

    public int getWheelbase() {
        return wheelbase;
    }

    public void setWheelbase(int wheelbase) {
        this.wheelbase = wheelbase;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
