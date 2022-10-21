package homework2;

/*
- Создать объекты Транспорт и Маршрут
- У транспорта нам надо указать тип, потребление топлива на 100 км и объём бака, для маршрута: название старта, финиша и дистанцию
- Создать метод для работы с этими объектами
- Создать копии объекта транспорт для машины, паровоза и самолёта и заполнить их
- создать три маршрута
- Вывести информацию о каждом маршруте и под каждым информацию по каждому типу транспорта: сколько топлива надо для прохождения маршрута и сможет ли проехать на одном баке
*/

public class Transport {
    private String transportType;
    private double fuelConsumption;
    private int tankVolume;

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }
}
