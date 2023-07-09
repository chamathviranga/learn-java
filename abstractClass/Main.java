package abstractClass;
import abstractClass.classes.Cat;

public class Main {
    
    public static void main(String[] args) {
        
        Cat cat = new Cat("Cat");

        System.out.println(cat.eat());
        cat.isAlive();

    }

}
