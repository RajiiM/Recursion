OUTPUT:
R
Ra
Raj
Raji
Rajii
Raji
Raj
Ra
R
------------

public class Sample {

	public static void main(String[] args) {
		Sample obj = new Sample();
        obj.display1("Rajii", 1);
        obj.display2("Rajii");
	}
	
	public void display1(String myName, int i)
	{
		if(i<myName.length())
		{
			System.out.println(myName.substring(0,i));
			i++;
			display1(myName,i);
		}
	}
	
	public void display2(String myName)
	{
		if(myName.length()>0)
		{
			System.out.println(myName);
			myName = myName.substring(0,myName.length()-1);
			display2(myName);
		}
	}
}
