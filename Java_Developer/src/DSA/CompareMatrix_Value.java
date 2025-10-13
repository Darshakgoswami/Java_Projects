package DSA;

import java.util.HashMap;
import java.util.Map;

public class CompareMatrix_Value 
{

	public static void main(String[] args) 
	{
		int matrix[][]= {{1,2,3},{4,2,4},{7,1,9}};
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int[] row:matrix)
		{
			for(int value:row)
			{
				map.put(value,map.getOrDefault(value, 0)+1);
			}
		}
		for(Map.Entry<Integer,Integer> entry:map.entrySet())
		{
			System.out.println("The Value "+entry.getKey()+" is repeated "+entry.getValue()+" times");
		}
	}

}