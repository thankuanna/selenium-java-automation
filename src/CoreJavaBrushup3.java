import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CoreJavaBrushup3 {

	public static void main(String[] args) {
		// String is an Object
		
		//Two way to declare
		
		//1. String literal
		String s0 = "Rahul Shetty academy";
		String s1 = "Rahul Shetty academy";
		
		System.out.println(s0 == s1);  // true  --Because same reference
		
/*in the above string literal, wenn we use gleich multiple name values, 
		it wont create new object, instead  it referes to the existing.
	 * In Java, String literals are stored in the String pool. If two strings have the same value, 
	 * Java reuses the same object instead of creating a new one	
	 
	 */
		
		//2 new object
		String s2 = new String("welcome");
		String s3 = new String("welcome");
	//here 2 objects are created
		System.out.println(s2 == s3);  // false;  Because new object created
		
		String s = "Rahul Shetty academy";
		//spilt string based on white space;  s.split(" ");
		String[] splittedstring = s.split(" ");  //stored in a array since it gives array as output
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[2]);
		
		//spilt string based on shetty;  s.split(" ");
	String[] splited =	s.split("Shetty");
	System.out.println(splited[0]);
	System.out.println(splited[1]);
	// to remove white space;
	System.out.println(splited[1].trim());
	
	// to print all characters one by one 
	for(int i =0;i<s.length();i++)
	{
		System.out.println(s.charAt(i));
	}
	
	//to get reverse the string
	for(int i = s.length()-1; i>=0;i--)
	{
		System.out.println(s.charAt(i));
	}
	}

}
