import java.io.*;

class readDisplayline
{
	public static void main(String[]args)throws IOException
	{
		FileReader fr= new FileReader ("java.txt");
		BufferedReader br = new BufferedReader(fr);
		int i=1;
		String s;
		while((s=br.readLine())!=null)
		{
			System.out.println(i++ +", "+s);		
		}	
		fr.close();	
}

}
