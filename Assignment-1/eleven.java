import java.util.Scanner;
class eleven{
		public static void main(String args[]){
		System.out.println("Enter First number");
		Scanner a = new Scanner(System.in);
		int A = a.nextInt();
		System.out.println("Enter Second number");
		Scanner b = new Scanner(System.in);
		int B = b.nextInt();
		System.out.println("Enter Third number");
		Scanner c = new Scanner(System.in);
		int C = c.nextInt();
		if ((A<B)&&(A<C))
		{
		System.out.print("The smallest no. is "+A);
		}
		if ((B<A)&&(B<C))
		{
		System.out.print("The smallest no. is "+B);
		}
		if ((C<A)&&(C<B))
		{
		System.out.print("The smallest no. is "+C);
		}
		else
		{
		System.out.print(" ");	
		}
}
}