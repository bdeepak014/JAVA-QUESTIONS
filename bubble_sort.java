import java.util.Arrays;
import java.util.Scanner;
public class bubble_sort {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Size");
	int n=scan.nextInt();
	int[] arr = new int[n];
	for(int i = 0; i < n; i++)
	{
		arr[i] = scan.nextInt();
	}
	int temp;
	for(int i = 0; i < n-1; i++)
	{
		for(int j = 0; j < n-i-1; j++)
		{
			if(arr[j] > arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	for(int i = 0; i < n ;i++)
	{
		System.out.println(arr[i]);
	}
	

		
	}

}
