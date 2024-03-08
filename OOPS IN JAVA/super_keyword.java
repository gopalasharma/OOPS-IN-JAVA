public class super_keyword {
    public static void main(String[] args) {
        Horse h1= new Horse();
        System.out.println(h1.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor called");
    }
}
class Horse extends Animal{
    Horse(){
        super.color= "brown";
        
        System.out.println("Horse constructor called");
    }
}
