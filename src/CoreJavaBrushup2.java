import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,3,4,5,6,7,8,9,10,11};
		// divisible by 2
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
				break; // comes out of the loop
			}
		
		else
		{
			System.out.println(arr[i]+" is not divisible by 2");
		}
		}
		
		
		//Arraylist --dyanamic
		ArrayList a = new ArrayList();
		
		// to add or intialise the array;
		a.add(2);
		a.add(3);
		a.add(5);
		a.add(90);
		
		// to remove an element
		a.remove(3);
		
		//to print the element
		System.out.println(a.get(2));
		
		//if its String
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("thanku");
		a1.add("anna");
		a1.add("baiju");
		a1.add("susan");
		System.out.println(a1.get(0));
		
		
		// to print all values in the array
		for(int i =0; i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		System.out.println("******************");
		//enhanced for loop
		
		for( String value: a1)
		{
			System.out.println(value);
		}
		
		//to check item is there in array or not
		System.out.println(a1.contains("susan"));
		
		// to convert normal array to Arraylist since normal array is not dyanamic n doesnt have method
		String[] name = {"Thanku","Anna","Baiju"};
		List<String> nameArrayList= Arrays.asList(name);
		boolean result =nameArrayList.contains("Thanku");
		System.out.println(result);
	}

}
