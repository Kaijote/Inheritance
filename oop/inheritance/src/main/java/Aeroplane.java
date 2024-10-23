public class Aeroplane extends Vehicle implements Flyable{

    public void move() {
        fly();
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying!");
    }
}
