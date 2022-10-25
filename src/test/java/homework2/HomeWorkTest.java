package homework2;

/*
- Создать объекты Транспорт и Маршрут
- У транспорта нам надо указать тип, потребление топлива на 100 км и объём бака, для маршрута: название старта, финиша и дистанцию
- Создать метод для работы с этими объектами
- Создать копии объекта транспорт для машины, паровоза и самолёта и заполнить их
- создать три маршрута
- Вывести информацию о каждом маршруте и под каждым информацию по каждому типу транспорта: сколько топлива надо для прохождения маршрута и сможет ли проехать на одном баке
*/

import org.junit.jupiter.api.Test;

public class HomeWorkTest {

    @Test
    public void workingWithRoute() {
        Route firstRoute = new Route();
        firstRoute.setRouteStart("Barcelona");
        firstRoute.setRouteFinish("Milan");
        firstRoute.setDistance(980);

        Route secondRoute = new Route();
        secondRoute.setRouteStart("London");
        secondRoute.setRouteFinish("Paris");
        secondRoute.setDistance(485);

        Route thirdRoute = new Route();
        thirdRoute.setRouteStart("Rome");
        thirdRoute.setRouteFinish("Prague");
        thirdRoute.setDistance(1299);

        System.out.println(firstRoute.getRouteStart());
        System.out.println(firstRoute.getRouteFinish());
        System.out.println(firstRoute.getDistance());
    }
        @Test
    public void workingWithTransport() {
        Transport firstTransport = new Transport();
        firstTransport.setTransportType("Car");
        firstTransport.setFuelConsumption(6.50);
        firstTransport.setTankVolume(60);

        Transport secondTransport = new Transport();
        secondTransport.setTransportType("Train");
        secondTransport.setFuelConsumption(210);
        secondTransport.setTankVolume(7300);

        Transport thirdTransport = new Transport();
        thirdTransport.setTransportType("Plain");
        thirdTransport.setFuelConsumption(662.00);
        thirdTransport.setTankVolume(126000);

        System.out.println(secondTransport.getTransportType());

    }

}
