import java.util.*;
class thirteen{
		public static void main(String args[]){
		System.out.println("Enter the number");
		Scanner a = new Scanner(System.in);
		int N = a.nextInt();
		while (N>0)
		{
		int A=N%10;
		System.out.print(A+" ");
		N=N/10;
		}
}
}