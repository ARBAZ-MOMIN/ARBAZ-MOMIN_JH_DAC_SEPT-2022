import java.util.*;
class nine{
		public static void main(String args[]){
		System.out.println("Enter the number");
		Scanner a = new Scanner(System.in);
		int N = a.nextInt();
		for(int i = 1 ; i<=N ; i++)
		{
		if(N%i==0)
		{
		System.out.print(i+", ");
		}
		}	
}
}