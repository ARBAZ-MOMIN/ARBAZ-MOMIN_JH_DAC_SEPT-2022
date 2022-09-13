import java.util.Scanner;
class ten{
		public static void main(String args[]){
		System.out.println("Enter the number");
		Scanner a = new Scanner(System.in);
		int N = a.nextInt();
		int sum=0;
		while (N>0)
		{
		int A=N%10;
		sum=sum+A;
		N=N/10;
		}
		System.out.print("Sum="+sum);
}
}