
public class ArrayExploration {

	public static void main(String[] args) {
		
		        
		        int numbers[] = {2,3,4,7,1};
		        
		        //first element
		        System.out.println(numbers[0]);
		        
		        //last element
		        System.out.println(numbers[4]);
		        
		        //Reverse Order- of elements in the array
		        for(int i =numbers.length-1; i>=0; i--)
		        {
		            System.out.println(numbers[i]);
		        }
		        
		        //elements count--
		        
		        //1 simple method
		       System.out.println("Total number of elements:" + numbers.length);
		       
		       //2 --using for loop to get the count of the elements present in array;
		       int count =0;
		       for(int i =0; i<numbers.length;i++) {
		    	   count++;
		       }
		       System.out.println("Total number of elements present:" +count);
		       
		    }

		

	}


