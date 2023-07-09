package basicConcepts.classes;

public class Person {
    
    private String myAge = null; 

    public Person(Integer age) {
        this.myAge = this.setAge(age);
    }

    public String printName(String name) {
        String myName = "My name is " +  name;
        return myName;   
    }

    protected String setAge(Integer age) {

        // %s for strings
        // %d for integers
        // %f for floating-point numbers
        // %c for characters
        // %b for boolean values
        // No need to convert : Integer.toString(age)

        try {
            String myAge = String.format("I am %d years old.",age);
            return myAge;
        } catch (Exception e) {
            return String.format("An error occurd : %e","qwe");
        }
        
    }

    public String printAge(){
        return this.myAge;
    }

}
