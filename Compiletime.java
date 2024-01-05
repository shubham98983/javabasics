public class Compiletime{
    public static void main(String args[]){
        Calculator c1 = new Calculator();
        c1.sum(5,10);
        c1.sum(5,9,10);
        // here it's like compiler itself deciding which function to call
    }
}
class Calculator{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
}