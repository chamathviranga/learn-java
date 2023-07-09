package abstractClass.classes;
import abstractClass.classes.Animals;

public class Cat extends Animals {
    
    protected String animal = "Cat";

    public void isAlive (){
        String stauts = String.format("This %s is alive.", super.animal());
        System.out.println(stauts);
    }

    public Cat(String animal){
        super(animal);
    }

}
