import java.util.Scanner;
public class binary_search {

	public static int binary(int arr[],int l,int r,int z)
	{
		if(l<=r)
		{
			int mid=(l+r)/2;
			if(arr[mid] == z)
				return mid;
			else if(arr[mid] > z)
				return binary(arr,l,mid-1,z);
			else
				return binary(arr,mid+1,r,z);
		}
		return 0;
	}
	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = scan.nextInt();
		}
		int z=scan.nextInt();
		int k=binary(arr,0,n,z);
		System.out.println(k);

	}
	

}
