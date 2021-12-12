public class Sample {

	public static void main(String[] args) {
		Sample obj = new Sample();
		int result = obj.fact(5);
		System.out.println(result);
	}
    
	public int fact(int no)
	{
		if(no==1)
		{
			return no;
		}
		else
		{
			return no*(fact(no-1));
		}
	}
}
//OUTPUT
120