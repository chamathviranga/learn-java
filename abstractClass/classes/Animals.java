package abstractClass.classes;

abstract class Animals {
    
    private String animal = null;

    protected Animals(String animal){
        this.animal = animal;
    }

    public abstract void isAlive();

    public String walk(){
        return String.format("%s can walk.", this.animal);
    }

    public String eat(){
        return String.format("%s can eat.", this.animal);
    }

    public String run(){
        return String.format("%s can run.", this.animal);
    }

    protected String animal(){
        return this.animal;
    }

}
