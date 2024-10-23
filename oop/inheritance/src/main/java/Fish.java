public class Fish extends Animal implements Swimmable{

    public void swim() {
        System.out.println(this.getClass().getSimpleName() + " is swimming!");
    }
    public void makeSound() {

    }

}
