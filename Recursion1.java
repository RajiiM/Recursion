public class Sample {

	public static void main(String[] args) {
		Sample obj = new Sample();
		String name = "Rajii";
		obj.display(name, name.length());
	}
    
	public void display(String myName, int len)
	{
		if(len>0)
		{
			System.out.println(myName.substring(0, len));
			len--;
			display(myName,len);
		}
	}
}

OUTPUT:
Rajii
Raji
Raj
Ra
R
