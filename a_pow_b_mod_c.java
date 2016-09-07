import java.util.Scanner;
public class a_pow_b_mod_c {

public static long func(int x,int n,int d)
{		if(x==0) return 0;
		if(n==0) return 1;
		
		long temp=func(x,n/2,d);
		long result;
		if(n%2 == 1)
		{
			result=(temp%d * temp%d *x%d)%d;
			return result<0?result+d:result;
		}
		else
		{
			result=(temp%d * temp%d)%d;
			return result<0?result+d:result;
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		System.out.println(func(a,b,c));
	}

}
