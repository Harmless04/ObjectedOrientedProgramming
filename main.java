	/*import java.io.*;
class main
{
	public static void main(String args[])

	{
try{
	FileWriter f = new FileWriter("java.txt");
	try
	{
	f.write("java is object oriented programming language");
	
	}
	finally
	{
		f.close();
	}

}
catch(IOException i)
{
	System.out.println(i);
}
}
}

*/
import java.io.*;
 class main
 {
	public static void main(String[]args)
{
	try{
	FileReader f=new
	FileReader("java.txt");
	try
	{
		int i;
		while((i=f.read())!=-1)
	{
		System.out.println((char)i);

}	
	}
	finally
	{
		f.close();	
	}

}
catch(IOException i)
{
	System.out.println("Excepion handled");

}
}

}

