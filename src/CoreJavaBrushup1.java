
public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		
		// Variables n Datatype
		
		int myNum = 12;
		String website = "Rahul Shetty";
		char letter = 'r';
		double dec = 6.99;
		boolean mycard = true;
		
		System.out.println(myNum+ " is the value store in my num"); // concatination
		System.out.println(website);
		System.out.println(letter);
		System.out.println(dec);
		System.out.println(mycard);
		
		//Arrays
		int[] arr = new  int[5];
		arr[0] = 1;
		arr[1] =4;
		arr[2] =9;
		arr[3]= 4;
		arr[4] =5;
		
		int[] arr2 = {1,4,9,4,5,100,899,5,78,90,12};
		System.out.println(arr[4]);
		
		//for loop; array length: 5
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		for (int i=0; i<=arr2.length-1; i++)
		{
			System.out.println(arr2[i]);
		}
		
		//String array
		String[] name = {"Thanku","Anna","Baiju"};
		for(int j=0 ; j<name.length;j++)
		{
			System.out.println(name[j]);
		}
		
		//Enhanced for loop
		
		for(String s:name)
		{
			System.out.println(s);
		}
		

	}

}
