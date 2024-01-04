import java.util.*;
public class javabasics {
    public static void main (String args[]) {
     int i = 87543;
     while ( i > 0 ) {
        int lastdigit = i % 10;
        System.out.print(lastdigit);
        i /=10;
     }
      }
      }


2nd method

import java.util.*;
public class javabasics {
    public static void main (String args[]) {
     int i = 87543;
     int rev = 0;
     while ( i > 0 ) {
        int lastdigit = i % 10;
        rev = (rev*10) + lastdigit;
        i /=10;
     }
     System.out.println(rev);
      }
      }

using for loop:-


import java.util.*;
public class Reversenumber{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
  for(int n=235362; n>0; n=n/10){
    int lastdigit = n%10;
    System.out.print(lastdigit);
  }
}
}