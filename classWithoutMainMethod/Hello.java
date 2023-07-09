package classWithoutMainMethod;

public class Hello {
    static {
        System.out.println("Static block");
    }

    public Hello(){
        System.out.println("Constrcutor block");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        
    }
}
