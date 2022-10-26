package homework2;

/*
- Создать объекты Транспорт и Маршрут
- У транспорта нам надо указать тип, потребление топлива на 100 км и объём бака, для маршрута: название старта, финиша и дистанцию
- Создать метод для работы с этими объектами
- Создать копии объекта транспорт для машины, паровоза и самолёта и заполнить их
- создать три маршрута
- Вывести информацию о каждом маршруте и под каждым информацию по каждому типу транспорта: сколько топлива надо для прохождения маршрута и сможет ли проехать на одном баке
*/


public class Route {
    private String routeStart;
    private String routeFinish;
    private double distance;

    public String getRouteStart() {
        return routeStart;
    }

    public void setRouteStart(String routeStart) {
        this.routeStart = routeStart;
    }

    public String getRouteFinish() {
        return routeFinish;
    }

    public void setRouteFinish(String routeFinish) {
        this.routeFinish = routeFinish;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
