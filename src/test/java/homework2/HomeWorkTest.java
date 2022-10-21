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

 //      System.out.println("Delivery out");
 //      System.out.println("1st delivery:");
        System.out.println(firstRoute.getRouteStart());
        System.out.println(firstRoute.getRouteFinish());
        System.out.println(firstRoute.getDistance());
    }

}
