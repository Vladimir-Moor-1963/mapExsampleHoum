import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Moskvich",1999,200-000);
        Car car2 = new Car("Wolga", 2001,500-000);
        Car car3 = new Car("VW",2008, 510-344);
        Car car4 = new Car("VWPassat", 2000, 180-000);
        Car car5 = new Car("Wolga3110",2002, 250-000);
        Car car6 = new Car("VWGolf", 2004, 400-000);
        Car car7 = new Car("Wolga Gas24", 1998, 200-000);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        System.out.println(cars);

       // 2.1. Среди машин, которые имеют год выпуска новее, чем 1999, необходимо подсчитать общий пробег

        List<Integer> year = (List<Integer>) cars.stream()
                .map(car -> car.getYear())
                .filter(getYear -> getYear>1999)
                .toList();
        System.out.println(year);
       // List<Integer> mille = year.stream()



    }
}
