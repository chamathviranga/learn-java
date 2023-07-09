package interfaces.classes;
import interfaces.classes.Animal;

public class Dog implements Animal {
    

    private String name = "";

    public Dog(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println(String.format("%s can walk",this.name));
    }

    public void run() {
        System.out.println(String.format("%s can run",this.name));
    }

    public void eat() {
        System.out.println(String.format("%s can eat",this.name));
    }

}
