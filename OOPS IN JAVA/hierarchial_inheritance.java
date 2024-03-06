public class hierarchial_inheritance {
    public static void main(String[] args) {
        Mammal m1= new Mammal();
        m1.eat();
        m1.walk();
        Fish f1= new Fish();
        f1.breathe();
        f1.swim();
        Bird b1= new Bird();
        b1.eat();
        b1.breathe();
        b1.fly();
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
class Mammal extends Animal{ // Derived class 1
    void walk(){
        System.out.println("Walks");
    }
}
class Bird extends Animal{ // Derived class 2
    void fly(){
        System.out.println("Flies");
    }
}
class Fish extends Animal{ // Derived class 3
    void swim(){
        System.out.println("Swims");
    }
}
