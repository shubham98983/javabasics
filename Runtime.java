public class Runtime{
    public static void main(String args[]){
        Deer d = new Deer();
        d.eat();
        // derived class k pas eat dono function h single level inheritance but
        // derived class ka function base class k function ko override kr rha.
    }
}
class Animal{
    void eat(){
        System.out.println("Can eat anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}