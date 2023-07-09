package basicConcepts;
import basicConcepts.classes.Person;

public class Main {
    
    public static void main(String[] args) {

        Person person = new Person(28);
        
        System.out.println("\r\n\r\n");

        String name = person.printName("Chamath");
        String age = person.printAge();
        System.out.println(name);
        System.out.println(age);

        System.out.println("\r\n\r\n");


    }

}
