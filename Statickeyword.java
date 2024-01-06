public class Statickeyword{
    public static void main(String args[]){
      Student s1 = new Student();
      s1.schoolName = "jmv";
      Student s2 = new Student();
      System.out.println(s2.schoolName);
      Student s3 = new Student();
      s3.schoolName = "ABC";
      Student s4 = new Student();
      System.out.println(s4.schoolName);
    }
}
class Student{
    String name;
    int roll;

    static String schoolName; // schoolName ki sirf ek copy ho sbke pas share hogii.
    void setName(){
        this.name=name;
    }
}