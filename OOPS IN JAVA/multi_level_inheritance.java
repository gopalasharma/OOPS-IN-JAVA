public class multi_level_inheritance {
    public static void main(String[] args) {
        Dog dobby= new Dog();
        dobby.eat();
        dobby.legs= 4;
        System.out.println("Legs of dog are: " + dobby.legs);
    }
    
}
class Animal{ //Base class
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
class Mammal extends Animal{ //Derived class
    int legs;
}
class Dog extends Mammal{ //Derived class
    String breed;
}
