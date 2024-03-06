public class single_level_inheritance {
    public static void main(String[] args) {
        Dog d1= new Dog();
        d1.eat();
        
    }
    
}
class Animal{ //Parent or base class
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}
class Dog extends Animal{ //Child or derived class or subclass
    int legs;
    void run(){
        System.out.println("Runs");
    }
}



