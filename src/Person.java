
public class Person
{
	private double height;
	private double weight;
	private String _name;
	private int IQ;
	//constructor
	public Person(String name , double height , double weight)
	{
		this.height = height;
		this.weight = weight;
		_name = name;
		
	}
	
	public void walks()
	{
		this.weight *=0.9;
		System.out.println(_name + " Lost Weight!");
		System.out.println(_name + " weighs "+ this.weight + " pounds");
	}
	
	public void eat()
	{
		this.weight *=1.2;
		System.out.println(_name + " gain Weight!");
		System.out.println(_name + " weighs " + this.weight);
	}
	//getters and setters
	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height) 
	{
		this.height = height;
	}

}
