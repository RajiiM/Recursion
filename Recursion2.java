public class Sample {

	public static void main(String[] args) {
		Sample obj = new Sample();
		int result = obj.sum(5);
		System.out.println(result);
	}
    
	public int sum(int no)
	{
		if(no==1)
		{
			return no;
		}
		else
		{
			return no+(sum(no-1));
		}
	}
}
//Output
15