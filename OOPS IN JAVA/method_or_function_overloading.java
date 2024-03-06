public class method_or_function_overloading {
    public static void main(String[] args) {
        Calculator calc= new Calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum((float)1.2, (float)2.6));
        System.out.println(calc.sum(5, 1, 4));
    }
    
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
