public class hybrid_inheritance {
    public static void main(String[] args) {
        Fish f1= new Fish();
        f1.eat();
        f1.swim();
        Shark s1= new Shark();
        s1.swim();
        s1.swim_fast();
        Peacock p1= new Peacock();
        p1.fly();
        p1.beautiful();
        Human h1= new Human();
        h1.eat();
        h1.breathe();
        h1.walk();
        h1.mind();
    } 
}
class Animal{ // Base Class
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
class Fish extends Animal{ // Derived Class 1
    void swim(){
        System.out.println("Swims");
    }
}
class Shark extends Fish{ // Derived Class 1
    void swim_fast(){
        System.out.println("Swims fast");
    }
}
class Tuna extends Fish{ // Derived class 2
    void healthy_fish(){
        System.out.println("Healthy fish");
    }
}
class Bird extends Animal{ // Derived Class 2
    void fly(){
        System.out.println("Flies");
    }
}
class Peacock extends Bird{ // Derived class 1
    void beautiful(){
        System.out.println("Very beautiful");
    }
}
class Mammal extends Animal{ //Derived class 3
    void walk(){
        System.out.println("Walks");
    }
}
class Dog extends Mammal{ //Derived class 1
    int legs;
}
class Human extends Mammal{
    void mind(){ // Derived class 2
        System.out.println("Has Mind");
    }
}
