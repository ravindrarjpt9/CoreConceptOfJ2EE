
public class Child implements Parent {

	@Override
	public void show() {
		System.out.println("Hello");

	}

	public String toString()
	{
		System.out.println("To String");
		return "Ji";
	}
	
	public void display()
	{
		System.out.println(" ********* ");
	}
	public static void main(String[] args) {
		
		Parent p = new Child();
		
		System.out.println(p.toString());
	}
}
