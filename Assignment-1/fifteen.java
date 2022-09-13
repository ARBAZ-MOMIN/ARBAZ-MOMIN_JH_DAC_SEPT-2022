import java.util.*;
class fifteen{
      public static void main(String args[]){
      int a, b, i, A=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 1st Number");
      a = sc.nextInt();
      System.out.println("Enter 2nd Number");
      b = sc.nextInt();
      for(i=1; i<=a || i<=b; i++) 
	  {
      if(i%a==0 && i%b==0)
      A = i;
      } 
      System.out.println("LCM of two numbers is "+A);
   }
}
