public class method_or_function_overriding {
    public static void main(String[] args) {
        Deer d= new Deer();
        d.eat();
    }
    
}
class Animal{
    void eat(){
        System.out.println("Eats Everything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats Grass");
    }
}
