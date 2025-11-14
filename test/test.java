class Alpha
{
	public Alpha(String msg)
	{
		System.out.println("Alpha "+msg);
	}
}
class Beta extends Alpha
{
	public Beta()
	{
		super(getMessage());
		System.out.println("Beta class constructor!!");
	}
	
	public static String getMessage()
	{
		return "class constructor";
	}	
}

public class test
{
   public static void main(String[] argv) 
   {
	   new Beta();

	}
}
