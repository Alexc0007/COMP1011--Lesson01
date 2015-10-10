
public class Player
{
	

	public static void main(String[] args)
	{
		int year = 2015;  //declare int year
		
		System.out.println("hello world! its:"+year+ "!");
		Person tom = new Person("Tom", 6.0 , 225.3);
		
		tom.walks();
		//tom.setHeight(6.1);
		
		Person mike = new Person("Mike" , 5.6 , 180.9);
		mike.walks();
		
		Person matt = new Person("Matt" , 6 , 190.9);
		matt.eat();
		
	}
	
}
