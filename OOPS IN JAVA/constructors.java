public class constructors {
    public static void main(String[] args) {
        Student s1= new Student("Rajat"); //if I do not create a constructor then java by default create a constructor but we can not initialize anything.
        System.out.println(s1.name);
    
    }
    
}
class Student{
    String name;
    int roll_num;

    // create a constructror
    Student(String name){
        this.name= name;

    }
}