public class Abstractclass{
    public static void main(String args[]){
       Horse h1 = new Horse();
       h1.eat();
       h1.walk();
       Chicken c1 = new Chicken();
       c1.eat();
       c1.walk();
    }
}
abstract class Animal{ // Abstract class has no object
    Animal(){ // iska constructor hierarchy k according call hoga dusre class ki object se
        System.out.println("Have definite colour");
    }
    void eat(){
        System.out.println("can eat everything");
    }
 abstract void walk(); //yha define nhi hota ye pr ek idea ho gya walk jaisa kush hota h like idea
}
class Horse extends Animal{
    void walk(){
        System.out.println("walk fastly on 4 legs");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("walk on 2 legs");
    }
}