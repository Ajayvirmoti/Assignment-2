import java.util.*;
public class Main {
    public static void main(String args[])
	 {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		while(testcase!=0)
		{
			long n = sc.nextLong();
			long t = sc.nextLong();
			long lowerVal = 1;
			long higerVal = n;
			long ans =0;
			while(lowerVal<=higerVal)
			{
				long mid=(lowerVal+higerVal)/2;
				if(Math.pow(mid,t)<= n)
				{
					ans = mid;
					lowerVal = mid+1;
				}
				else
				{
					higerVal = mid-1;
				}
			}
			System.out.println(ans);
			testcase--;
		}
    }
}
