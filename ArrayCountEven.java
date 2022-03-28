package Day11;

import java.util.Scanner;
//define an array of size 7 and count even numbers within array
//wap to ask 5 number in an array and print sum of array element

public class ArrayCountEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Size, i, evenCount = 0;
		int odd=0;
		Scanner s = new Scanner(System.in);
	 
		System.out.print(" Please Enter Size of elements in an array : "); //size scan kiya
		Size = s.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = s.nextInt();
		} 
		
		System.out.print("\n List of Even Numbers in this Array are :"); 
		for(i = 0; i < Size; i++)
		{
			if(a[i] % 2 == 0)
			{
				System.out.print(a[i] +" ");
				evenCount++;
			}
			else
				odd++;
		}		
		System.out.println("\n Total Even Numbers in this Array = " + evenCount);
		System.out.println("\n Total Odd Numbers in this Array = " + odd);
	}
}
