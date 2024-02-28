public class types_of_constructors {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name= "Rajat";
        s1.roll_num= 123;
        s1.password= "abcd";
        s1.marks[0]= 100;
        s1.marks[1]= 90;
        s1.marks[2]= 80;
        Student s2= new Student(s1); //Object s2 which copy all the properties of s1
            s2.password= "xyz";
            s1.marks[2]= 100; //here in also s2 the 3rd marks will be changed because in copy constructor original value not passed only reference passed which points the original value.
            for(int i=0; i<3; i++){
                System.out.println(s2.marks[i]);
            }

        
    }
    
}
class Student{
    String name;
    int roll_num;
    String password;
    int marks[];


    // 1. Non-parameterized constructor
    Student(){
        marks= new int[3];
        System.out.println("This is a constructor!");
    }

    // 2. Parameterized constructor
    Student(String name){
        marks= new int[3];
        this.name= name;
    }
    Student(int roll_num){
        marks= new int[3];
        this.roll_num= roll_num;
    }
    
    // 3. Copy constructor
    Student(Student s1){ //Create a copy constructor.
        marks= new int[3];
        this.name= s1.name;
        this.roll_num= roll_num;
        this.marks= s1.marks;

        
    }
}
