package ClassWork;

public abstract  class Anim {
    public String name;
    public abstract void makeSound();
    public abstract void move();
    public Anim(String animalName){
        name = animalName;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return getName();
    }
}
