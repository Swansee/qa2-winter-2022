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
    public void workingWithRouteAndTransport() {
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

        Transport firstTransport = new Transport();
        firstTransport.setTransportType("Car");
        firstTransport.setFuelConsumption(6.50);
        firstTransport.setTankVolume(60);

        Transport secondTransport = new Transport();
        secondTransport.setTransportType("Train");
        secondTransport.setFuelConsumption(210);
        secondTransport.setTankVolume(2100);

        Transport thirdTransport = new Transport();
        thirdTransport.setTransportType("Plain");
        thirdTransport.setFuelConsumption(662.00);
        thirdTransport.setTankVolume(126000);

        System.out.println(firstRoute.getRouteStart() + " - " + firstRoute.getRouteFinish() + ". Distance is: " + firstRoute.getDistance() + " km.");
        System.out.println(firstTransport.getTransportType() + ".");
        System.out.println("With fuel tank " + firstTransport.getTankVolume() + " l. and fuel consumption " + String.format("%.2f",firstTransport.getFuelConsumption()) + " l/100 km.");
        System.out.println("Fuel to be used from " + firstRoute.getRouteStart() + " to " + firstRoute.getRouteFinish() + " by " + firstTransport.getTransportType() + ": " +
                String.format("%.2f",firstRoute.getDistance() / 100 * firstTransport.getFuelConsumption()) + " l.");
        if ((firstRoute.getDistance() / 100 * firstTransport.getFuelConsumption()) > firstTransport.getTankVolume()) {
            System.out.println("One tank of fuel will not be ENOUGH!!! " + firstTransport.getTransportType() + " will need a gas station.");
        } else {
            System.out.println("One tank of fuel will be enough.");
        }

        System.out.println(secondTransport.getTransportType() + ".");
        System.out.println("With fuel tank " + secondTransport.getTankVolume() + " l. and fuel consumption " + String.format("%.2f",secondTransport.getFuelConsumption()) + " l/100 km.");
        System.out.println("Fuel to be used from " + firstRoute.getRouteStart() + " to " + firstRoute.getRouteFinish() + " by " + secondTransport.getTransportType() + ": " +
                String.format("%.2f",firstRoute.getDistance() / 100 * secondTransport.getFuelConsumption()) + " l.");
        if ((firstRoute.getDistance() / 100 * secondTransport.getFuelConsumption()) > secondTransport.getTankVolume()) {
            System.out.println("One tank of fuel will not be ENOUGH!!! " + secondTransport.getTransportType() + " will need a gas station.");
        } else {
            System.out.println("One tank of fuel will be enough.");
        }

        System.out.println(thirdTransport.getTransportType() + ".");
        System.out.println("With fuel tank " + thirdTransport.getTankVolume() + " l. and fuel consumption " + String.format("%.2f",thirdTransport.getFuelConsumption()) + " l/100 km.");
        System.out.println("Fuel to be used from " + firstRoute.getRouteStart() + " to " + firstRoute.getRouteFinish() + " by " + thirdTransport.getTransportType() + ": " +
                String.format("%.2f",firstRoute.getDistance() / 100 * thirdTransport.getFuelConsumption()) + " l.");
        if ((firstRoute.getDistance() / 100 * thirdTransport.getFuelConsumption()) > thirdTransport.getTankVolume()) {
            System.out.println("One tank of fuel will not be ENOUGH!!! " + thirdTransport.getTransportType() + " will need a gas station.");
        } else {
            System.out.println("One tank of fuel will be enough.");
        }

        System.out.println();

        System.out.println(secondRoute.getRouteStart() + " - " + secondRoute.getRouteFinish() + ". Distance is: " + secondRoute.getDistance() + " km.");
        System.out.println(firstTransport.getTransportType() + ".");
        System.out.println("With fuel tank " + firstTransport.getTankVolume() + " l. and fuel consumption " + String.format("%.2f",firstTransport.getFuelConsumption()) + " l/100 km.");
        System.out.println("Fuel to be used from " + secondRoute.getRouteStart() + " to " + secondRoute.getRouteFinish() + " by " + firstTransport.getTransportType() + ": " +
                String.format("%.2f",secondRoute.getDistance() / 100 * firstTransport.getFuelConsumption()) + " l.");
        if ((secondRoute.getDistance() / 100 * firstTransport.getFuelConsumption()) > firstTransport.getTankVolume()) {
            System.out.println("One tank of fuel will not be ENOUGH!!! " + firstTransport.getTransportType() + " will need a gas station.");
        } else {
            System.out.println("One tank of fuel will be enough.");
        }

        System.out.println(secondTransport.getTransportType() + ".");
        System.out.println("With fuel tank " + secondTransport.getTankVolume() + " l. and fuel consumption " + String.format("%.2f",secondTransport.getFuelConsumption()) + " l/100 km.");
        System.out.println("Fuel to be used from " + secondRoute.getRouteStart() + " to " + secondRoute.getRouteFinish() + " by " + secondTransport.getTransportType() + ": " +
                String.format("%.2f",secondRoute.getDistance() / 100 * secondTransport.getFuelConsumption()) + " l.");
        if ((secondRoute.getDistance() / 100 * secondTransport.getFuelConsumption()) > secondTransport.getTankVolume()) {
            System.out.println("One tank of fuel will not be ENOUGH!!! " + secondTransport.getTransportType() + " will need a gas station.");
        } else {
            System.out.println("One tank of fuel will be enough.");
        }

        System.out.println(thirdTransport.getTransportType() + ".");
        System.out.println("With fuel tank " + thirdTransport.getTankVolume() + " l. and fuel consumption " + String.format("%.2f",thirdTransport.getFuelConsumption()) + " l/100 km.");
        System.out.println("Fuel to be used from " + secondRoute.getRouteStart() + " to " + secondRoute.getRouteFinish() + " by " + thirdTransport.getTransportType() + ": " +
                String.format("%.2f",secondRoute.getDistance() / 100 * thirdTransport.getFuelConsumption()) + " l.");
        if ((secondRoute.getDistance() / 100 * thirdTransport.getFuelConsumption()) > thirdTransport.getTankVolume()) {
            System.out.println("One tank of fuel will not be ENOUGH!!! " + thirdTransport.getTransportType() + " will need a gas station.");
        } else {
            System.out.println("One tank of fuel will be enough.");
        }

        System.out.println();

        System.out.println(thirdRoute.getRouteStart() + " - " + thirdRoute.getRouteFinish() + ". Distance is: " + thirdRoute.getDistance() + " km.");
        System.out.println(firstTransport.getTransportType() + ".");
        System.out.println("With fuel tank " + firstTransport.getTankVolume() + " l. and fuel consumption " + String.format("%.2f",firstTransport.getFuelConsumption()) + " l/100 km.");
        System.out.println("Fuel to be used from " + thirdRoute.getRouteStart() + " to " + thirdRoute.getRouteFinish() + " by " + firstTransport.getTransportType() + ": " +
                String.format("%.2f",thirdRoute.getDistance() / 100 * firstTransport.getFuelConsumption()) + " l.");
        if ((thirdRoute.getDistance() / 100 * firstTransport.getFuelConsumption()) > firstTransport.getTankVolume()) {
            System.out.println("One tank of fuel will not be ENOUGH!!! " + firstTransport.getTransportType() + " will need a gas station.");
        } else {
            System.out.println("One tank of fuel will be enough.");
        }

        System.out.println(secondTransport.getTransportType() + ".");
        System.out.println("With fuel tank " + secondTransport.getTankVolume() + " l. and fuel consumption " + String.format("%.2f",secondTransport.getFuelConsumption()) + " l/100 km.");
        System.out.println("Fuel to be used from " + thirdRoute.getRouteStart() + " to " + thirdRoute.getRouteFinish() + " by " + secondTransport.getTransportType() + ": " +
                String.format("%.2f",thirdRoute.getDistance() / 100 * secondTransport.getFuelConsumption()) + " l.");
        if ((thirdRoute.getDistance() / 100 * secondTransport.getFuelConsumption()) > secondTransport.getTankVolume()) {
            System.out.println("One tank of fuel will not be ENOUGH!!! " + secondTransport.getTransportType() + " will need a gas station.");
        } else {
            System.out.println("One tank of fuel will be enough.");
        }

        System.out.println(thirdTransport.getTransportType() + ".");
        System.out.println("With fuel tank " + thirdTransport.getTankVolume() + " l. and fuel consumption " + String.format("%.2f",thirdTransport.getFuelConsumption()) + " l/100 km.");
        System.out.println("Fuel to be used from " + thirdRoute.getRouteStart() + " to " + thirdRoute.getRouteFinish() + " by " + thirdTransport.getTransportType() + ": " +
                String.format("%.2f",thirdRoute.getDistance() / 100 * thirdTransport.getFuelConsumption()) + " l.");
        if ((thirdRoute.getDistance() / 100 * thirdTransport.getFuelConsumption()) > thirdTransport.getTankVolume()) {
            System.out.println("One tank of fuel will not be enough. " + thirdTransport.getTransportType() + " will need a gas station.");
        } else {
            System.out.println("One tank of fuel will be enough.");
        }
    }
}
