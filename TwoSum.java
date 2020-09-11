import java.util.*;

public class TwoSum
{

	public int[] twoSum(int[] sum, int target)
	{
		int pointer1 = 0;
		int pointer2 = sum.length - 1;
		Arrays.sort(sum);
		System.out.print("Given nums:");
		for (int i =0; i<sum.length;i++)
		{
			System.out.print(sum[i]+", ");
		}
		System.out.print("Target: "+ target);

		while(pointer1 < pointer2)
		{
			if (sum[pointer1] + sum[pointer2] == target)
			{
				if (sum[pointer1] != sum[pointer2])
				{
					return new int[]{pointer1, pointer2};
				}
				else
				{
					return new int[]{-1,0};
				}
			}
			else if (sum[pointer1] + sum[pointer2] < target)
			{
				pointer1++;
			}
			else 
			{
				pointer2--;
			}
		}
		return new int[]{-1,-1};

	}

	public static void main(String[] args)
	{
		int[] nums = {2,9,4,7,1,5};
		int sum = 14;
		TwoSum ts = new TwoSum();
		int[] ans = ts.twoSum(nums,sum);
		int ans1 = ans[0];
		int ans2 = ans[1];
		System.out.println();
		if (ans1 == -1)
		{
			if (ans2 == 0)
			{
				System.out.println("No solution as num is not allowed to be used twice.");
			}
			System.out.println("There is no solution.");
		}
		else
		{
		System.out.println("The output should be ["+ans1+", "+ans2+"].");
		System.out.println("Because nums["+ans1+"] + nums["+ans2+"] = "+sum);
		}
	}
}