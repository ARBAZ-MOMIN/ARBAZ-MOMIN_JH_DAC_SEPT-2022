import java.util.*;
	class four{
	public static void main(String args []){
	System.out.println("Enter First number");
	Scanner a=new Scanner (System.in);
	int A=a.nextInt();
	System.out.println("Enter Second number");
	Scanner b=new Scanner (System.in);
	int B=b.nextInt();
    A=A+B;
	B=A-B;
	A=A-B;
	{
	System.out.println("First Number after Swap is "+A);
	System.out.println("Second Number after Swap is "+B);
	}
	}
}