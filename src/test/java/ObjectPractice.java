import org.junit.jupiter.api.Test;

public class ObjectPractice {
    @Test
    public void workingWithOrders() {
        Order firstOrder = new Order();

        firstOrder.setTotalPrice(12.34);
        firstOrder.setAddress("Rigas str.22");
        firstOrder.setItemCount(9);

        Order secondOrder = new Order();
        secondOrder.setTotalPrice(55.67);
        secondOrder.setAddress("Lubanas str. 43-13");
        secondOrder.setItemCount(3);

        System.out.println("Hello, World!");
        //sout = System.out.println
        System.out.println("1st order:");
        System.out.println(firstOrder.getTotalPrice());

        System.out.println("2nd order:");
        System.out.println(secondOrder.getTotalPrice());
    }
}


//Домашняя работа:
//для всех объектов надо создать GETTER/SETTER
//после этого создаем JAVA Class, где буду с ними работать, и после этого в этом классе
//1 копия парочка атрибутов и вконце их вывести. Для каждого из объектов
//
//* со звездочкой - создаем 2 объекта: Transport + Rout
//набор параметров - сами
//Транспорт должен содержать в себе как минимум инфо о расходе топлива на 100 км., о том - сколько у него бак (2 атрибута)
//Маршрут: о начальном пункте, о конечном пункте и расстояние между ними в км.
//Создаем отдельный класс где будем из применять: создаем копию объекта транспорт для машины, для паровоза и 3 для самолета. Заполняем эти компии информацией.
//Создаем копию объекта Роут, 3 маршрута с разной информацией. В консоль информацию о маршруте и сколько литров топлива на его преодолении и сможет ли транспорт преодолеть на 1 баке.