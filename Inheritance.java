public class Inheritance{
    public static void main(String args[]){
      Fish shark = new Fish();
      shark.eat();
      //fish itself not have eat function but it inherited it from animal parent class
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("Yes eats");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Can swim");
    }
}