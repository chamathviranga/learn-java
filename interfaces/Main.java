package interfaces;
import interfaces.classes.Dog;

public class Main {
    
    public static void main(String[] args) {
        Dog dog = new Dog("Charley");

        dog.eat();
        dog.walk();
        dog.run();
    }

}
