public class OOPS {
    public static void main(String args[]){
        Pen p1= new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color= "Red"; //I can directly change the color without function call
        System.out.println(p1.color);

        BankAccount A= new BankAccount();
        A.username= "Rajat Sharma";
        A.setPassword("abcdef");
        System.out.println(A.username);
        // System.out.println(A.password); //Also I can print only my username not password, if I print it gives error.
  
    }

 
}

class BankAccount{
    public String username; //I make username as public because username is seen by anyone and access by anyone.
    private String password; //I make password as private because it is the personal information so accessible and seen by only this class
    public void setPassword(String pwd){
        password= pwd;
    }
}

// create a new class name Pen
class Pen{
    // define all the properties and function of this Pen class
    String color;
    int tip;
    void setColor(String newColor){
        color= newColor;
    }
    void setTip(int newTip){
        tip= newTip;
    } 
}