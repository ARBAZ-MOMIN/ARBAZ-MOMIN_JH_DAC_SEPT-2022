import java.util.*;
class forteen{
      public static void main(String args[]){
      int a, b, i, A=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 1st Number");
      a = sc.nextInt();
      System.out.println("Enter 2nd Number");
      b = sc.nextInt();
      for(i=1; i<=a || i<=b; i++) 
	  {
      if(a%i==0 && b%i==0)
      A = i;
      } 
      System.out.println("GCD of two numbers is "+A);
   }
}