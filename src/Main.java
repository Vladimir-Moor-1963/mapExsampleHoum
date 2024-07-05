import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Moskvich",1999, 200000);
        Car car2 = new Car("Wolga", 2001,500000);
        Car car3 = new Car("VW",2008, 510344);
        Car car4 = new Car("VWPassat", 2000, 180000);
        Car car5 = new Car("Wolga3110",2002, 250000);
        Car car6 = new Car("VWGolf", 2004, 400000);
        Car car7 = new Car("Wolga Gas24", 1998, 200000);

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
        int totalMileage = cars.stream()
                .filter(car -> car.getYear() > 1999)
                .mapToInt(Car::getMileage)
                .sum();
        System.out.println(totalMileage);

        //2.2. Среди машин, у которых пробег более 500 000, найти самую старую машину
        Optional<Car> altCar = cars.stream()
                .filter(car -> car.getMileage() > 500000)
                .min(Comparator.comparingInt(Car::getYear));
        System.out.println(altCar);
       // 2.3. Среди машин, у которых марка начинается на "V" или "W", найти с самым большим пробегом, но не более 200 000 тысяч
        Optional<Car> maxmileWCar = cars.stream()
                .filter(car -> car.getMileage() <= 200000)
                .filter(car -> car.getName().startsWith("V") || car.getName().startsWith("W"))
                .max(Comparator.comparingInt(Car::getMileage));
        System.out.println(maxmileWCar);




    }
}
