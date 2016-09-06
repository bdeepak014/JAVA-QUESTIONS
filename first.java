import java.util.Arrays;
import java.util.Scanner;
public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size");
		int n = scan.nextInt();
		double[] numbers = new double[n];
		System.out.println("Enter amount");
		for(int i = 0; i < n; i++)
		{
			numbers[i] = scan.nextDouble();
		}
		System.out.println("Enter Budget");
		double b = scan.nextDouble();
		Arrays.sort(numbers);
		for(int i = 0; i < n; i++)
		{
			if((numbers[i] * (n - i)) > b)
			{
				System.out.print("So,highest ");
				System.out.print(n - i);
				System.out.println(" elements to be modified.");
				System.out.println(b/(n - i));
				break;
			}
			else
			{
				b = b - numbers[i];
			}
		}

	}

}
