import java.util.*;
	class six{
	public static void main(String args []){
	System.out.println("Enter a Year");
	Scanner a=new Scanner (System.in);
	int A=a.nextInt();
    if(A%4==0 && A%100!=0 || A%400==0)
	{
	System.out.println("Year is a leap year");
	}
	else
	{
	System.out.println("Year is not a leap year");
	}
	}
}