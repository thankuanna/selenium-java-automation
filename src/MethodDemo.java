
public class MethodDemo {

	public static void main(String[] args) {
		//create an object of class
		
		MethodDemo d1 = new MethodDemo();
		d1.getData();
		
		MethodDemo2 d2 = new MethodDemo2();
		d2.getUserData();
		/*String demo2 = d2.getUserData();
		System.out.println(demo2);
		*/
		
		getStaticdata();
		System.out.println(MethodDemo.getStaticdata());
		
		
		

	}
	
	public void getData()
	{
		System.out.println("Hello");
	}
	
//Static accesing method by its own class w/o creating an object
	public static int getStaticdata()
	{
		return 10;
	}

}
