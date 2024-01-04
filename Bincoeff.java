import java.util.*;
public class bincoeff {
  public static int factorial(int n) {
    int f = 1;

    for (int i=1; i<=n; i++) {
      f *=i ;
    }
    return f;
  }
 public static int bincoeff (int n , int r) {
int factn = factorial(n);
int factr = factorial(r);
int factnmr = factorial(n-r);
int bincoeff = factn / (factr * factnmr);
return bincoeff;
 }

  public static void main (String args[]) {
  System.out.println(bincoeff(5 , 2));
  }
}
   