import java.util.List;


public class Main {
    public static void main(String[] args) {
//        List<Object> objects = List.of(
//                new Aeroplane(),
//                new Car(),
//                new Pigeon(),
//                new Duck(),
//                new Fish());
//
//        for (Object object : objects) {
//
//            if (object instanceof Swimmable swimmable) {
//                swimmable.swim();
//            }
//
//            if (object instanceof Flyable flyable) {
//                flyable.fly();
//            }
//
//            if (object instanceof Vehicle vehicle) {
//                vehicle.move();
//            }
//        }

//        Sky sky = new Sky();
//        sky.addTraffic(new Duck());
//        sky.addTraffic(new Pigeon());
//        sky.addTraffic(new Aeroplane());
//
//        sky.checkTraffic();

//        Sky sky = new Sky();
//        sky.addTraffic(new Duck());
//        sky.addTraffic(new Pigeon());
//        sky.addTraffic(new Aeroplane());
//
//        Water water = new Water();
//        water.addTraffic(new Duck());
//        water.addTraffic(new Fish());
//
//        List<Environment<?>> environments = List.of(sky, water);
//
//        for (Environment<?> environment: environments) {
//            environment.checkTraffic();
//        }
        Car car = new Car();
        car.move();
        Van van = new Van();
        van.move();
        Lorry lorry = new Lorry();
        lorry.move();

    }
}
